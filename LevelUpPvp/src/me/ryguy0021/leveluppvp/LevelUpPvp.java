package me.ryguy0021.leveluppvp;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;

public class LevelUpPvp extends JavaPlugin implements Listener{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static LevelUpPvp plugin;
	public static Inventory shop;
	UpdateInventory updateInventoryObject = new UpdateInventory();
	ShopDisplay shopDisplayObject = new ShopDisplay();
	ShopBuy shopBuyObject = new ShopBuy();
	public static LevelUpPvp instance;
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled");
	}
	
	@Override
	public void onEnable() {
		instance = this;
		final FileConfiguration config = this.getConfig();
		getServer().getWorld("LevelUpPvp").setSpawnLocation(590, 73, -841);
		getServer().getPluginManager().registerEvents(this, this);
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled");
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		if (label.equalsIgnoreCase("shop")) {
			if (sender instanceof Player){
				Player player = (Player) sender;
				int coins = getConfig().getInt(player.getName() + ".coins");
				int sword = getConfig().getInt(player.getName() + ".sword");
				int armor = getConfig().getInt(player.getName() + ".armor");
				int sharp = getConfig().getInt(player.getName() + ".sharp");
				int protect = getConfig().getInt(player.getName() + ".protect");
				int speed = getConfig().getInt(player.getName() + ".speed");
				shop = Bukkit.createInventory(null, 9, "Shop - Coins: " + coins);
				shop.clear();
				shopDisplayObject.shopDisplay(shop, sword, armor, sharp, protect, speed);
				player.openInventory(shop);
			}
		} else if (label.equalsIgnoreCase("coins")){
			Player player = (Player)sender;
			int coins = getConfig().getInt(player.getName() + ".coins");
			player.sendMessage("Coins: " + coins);
			saveConfig();
		}  else if (label.equalsIgnoreCase("join")){
			Player player = (Player) sender;
			String name = player.getName();
			if(this.getConfig().getBoolean(name + ".ingame") == false){
				player.teleport(new Location(player.getWorld(), 587, 63, -796));
				this.getConfig().set(name + ".ingame", true);
			}
		}
		return false;
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		String player = e.getWhoClicked().getName();
		Player person = (Player) e.getWhoClicked();
		int coins = getConfig().getInt(player + ".coins");
		if (e.getInventory().getTitle().equals("Shop - Coins: " + coins)){
			e.setCancelled(true);
			PlayerInventory i = e.getWhoClicked().getInventory();
			Material itemBought = e.getCurrentItem().getType();
			shopBuyObject.shopBuy(itemBought, player, i, person);
			e.getWhoClicked().closeInventory();
		}
	}
	
	@EventHandler
	public void onItemDrop(PlayerDropItemEvent e){
		if (!e.getPlayer().hasPermission("leveluppvp.drop")) {
			e.setCancelled(true);
			e.getPlayer().updateInventory();
		}
	}
	
	@EventHandler
	public void onKill(PlayerDeathEvent e){
		if(e.getEntity().getKiller() instanceof Player){
			String killer = e.getEntity().getKiller().getName();
			int coins = getConfig().getInt(killer + ".coins");
			++coins;
			getConfig().set(killer + ".coins", coins);
			saveConfig();
			e.getEntity().getKiller().sendMessage(ChatColor.BLUE + "+1 Coin");
		}
	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e){
		String player = e.getEntity().getName();
		getConfig().set(player + ".ingame", false);
	}
	
	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent e){
		Player respawner = e.getPlayer();
		Player person = respawner;
		String player = respawner.getName();
		PlayerInventory i = respawner.getInventory();
		updateInventoryObject.updateInventory(player, i, person);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		String player = e.getPlayer().getName();
		Player person = e.getPlayer();
		int coins = 0;
		int joined = getConfig().getInt(player + ".joined");
		if(joined == 0){
			this.getConfig().set(player + ".coins", coins);
			this.getConfig().set(player + ".joined", 1);
			this.getConfig().set(player + ".sword", 1);
			this.getConfig().set(player + ".armor", 1);
			this.getConfig().set(player + ".sharp", 1);
			this.getConfig().set(player + ".protect", 1);
			this.getConfig().set(player + ".speed", 1);
			this.saveConfig();
		}
		this.getConfig().set(player + ".ingame", false);
		PlayerInventory i = e.getPlayer().getInventory();
		updateInventoryObject.updateInventory(player, i, person);
		e.getPlayer().teleport(new Location(e.getPlayer().getWorld(), 590, 73, -841));
	}
	
	@EventHandler
	public void onPvP(EntityDamageByEntityEvent e){
	     Entity ent = e.getEntity();
	     Entity ent1 = e.getDamager();
	     if(ent instanceof Player && ent1 instanceof Player){
	          Player attacked = (Player) ent;
	          String name = attacked.getName();
				if(getConfig().getBoolean(name + ".ingame") == false){
					e.setCancelled(true);
				}
	     }
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		if (!e.getPlayer().hasPermission("leveluppvp.break")) {
			e.setCancelled(true);
		}
	}
}
