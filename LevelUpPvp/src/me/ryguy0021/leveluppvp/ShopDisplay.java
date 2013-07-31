package me.ryguy0021.leveluppvp;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopDisplay implements Listener{
	public void shopDisplay(Inventory shop, int sword, int armor, int sharp, int protect, int speed){
		if(sword == 1){
			ItemStack item = new ItemStack(Material.STONE_SWORD);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Upgrade Your Wooden", ChatColor.RED + "Sword to a Stone Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "50 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sword == 2){
			ItemStack item = new ItemStack(Material.IRON_SWORD);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Upgrade Your Stone", ChatColor.RED + "Sword to a Iron Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "200 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sword == 3){
			ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Upgrade Your Iron", ChatColor.RED + "Sword to a Diamond Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "1000 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sword == 4){
			ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "You Bought All of", ChatColor.RED + "the Upgrades for Your Sword");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		}
		if(armor == 1){
			ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Protect Yourself With", ChatColor.AQUA + "Leather Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "100 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(armor == 2){
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Upgrade Your Leather", ChatColor.AQUA + "Armor to Chain Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "250 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(armor == 3){
			ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Upgrade Your Chain", ChatColor.AQUA + "Armor to Iron Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "750 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(armor == 4){
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Upgrade Your Iron", ChatColor.AQUA + "Armor to Diamond Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "1500 Coins");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(armor == 5){
			ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "You Bought All of", ChatColor.AQUA + "the Upgrades for Your Armor");
			id.setLore(lore);
			item.setItemMeta(id);
			shop.addItem(item);
		}
		if (sharp == 1){
			ItemStack item = new ItemStack(Material.REDSTONE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Add Sharpness I", ChatColor.RED + "to Your Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "100 Coins");
			id.setLore(lore);
			id.setDisplayName("Sword Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sharp == 2){
			ItemStack item = new ItemStack(Material.REDSTONE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Add Sharpness II", ChatColor.RED + "to Your Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "300 Coins");
			id.setLore(lore);
			id.setDisplayName("Sword Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sharp == 3){
			ItemStack item = new ItemStack(Material.REDSTONE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Add Sharpness III", ChatColor.RED + "to Your Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "750 Coins");
			id.setLore(lore);
			id.setDisplayName("Sword Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sharp == 4){
			ItemStack item = new ItemStack(Material.REDSTONE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Add Sharpness IV", ChatColor.RED + "to Your Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "1500 Coins");
			id.setLore(lore);
			id.setDisplayName("Sword Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sharp == 5){
			ItemStack item = new ItemStack(Material.REDSTONE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "Add Sharpness V", ChatColor.RED + "to Your Sword", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "2500 Coins");
			id.setLore(lore);
			id.setDisplayName("Sword Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(sharp == 6){
			ItemStack item = new ItemStack(Material.REDSTONE);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.RED + "You Bought All of", ChatColor.RED + "the Upgrades for Sharpness");
			id.setLore(lore);
			id.setDisplayName("Sword Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		}
		if (protect == 1){
			ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Add Protection I", ChatColor.AQUA + "to Your Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "200 Coins");
			id.setLore(lore);
			id.setDisplayName("Armor Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(protect == 2){
			ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Add Protection II", ChatColor.AQUA + "to Your Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "500 Coins");
			id.setLore(lore);
			id.setDisplayName("Armor Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(protect == 3){
			ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Add Protection III", ChatColor.AQUA + "to Your Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "1000 Coins");
			id.setLore(lore);
			id.setDisplayName("Armor Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(protect == 4){
			ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "Add Protection IV", ChatColor.AQUA + "to Your Armor", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "2000 Coins");
			id.setLore(lore);
			id.setDisplayName("Armor Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if(protect == 5){
			ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.AQUA + "You Bought All of", ChatColor.AQUA + "the Upgrades for Protection");
			id.setLore(lore);
			id.setDisplayName("Armor Strengthening Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		}
		if (speed == 1){
			ItemStack item = new ItemStack(Material.SUGAR);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.WHITE + "Upgrade Your Speed", ChatColor.WHITE + "to Speed I", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "500 Coins");
			id.setLore(lore);
			id.setDisplayName("Speed Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if (speed == 2){
			ItemStack item = new ItemStack(Material.SUGAR);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.WHITE + "Upgrade Your Speed", ChatColor.WHITE + "to Speed II", ChatColor.GREEN + "Cost: " + ChatColor.GOLD + "1000 Coins");
			id.setLore(lore);
			id.setDisplayName("Speed Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		} else if (speed == 3){
			ItemStack item = new ItemStack(Material.SUGAR);
			ItemMeta id = item.getItemMeta();
			List<String> lore = Arrays.asList(ChatColor.WHITE + "You Bought All of", ChatColor.WHITE + "the Upgrades for Speed");
			id.setLore(lore);
			id.setDisplayName("Speed Dust");
			item.setItemMeta(id);
			shop.addItem(item);
		}
	}
}
