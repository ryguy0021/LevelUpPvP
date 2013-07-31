package me.ryguy0021.leveluppvp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class UpdateInventory implements Listener{
	
	private LevelUpPvp plugin;
	
	AddEnchantment addEnchantmentObject = new AddEnchantment();
	
	public void updateInventory(String player, PlayerInventory i, Player person){
		this.plugin = LevelUpPvp.instance;
		
		int sword = plugin.getConfig().getInt(player + ".sword");
		int armor = plugin.getConfig().getInt(player + ".armor");
		int sharp = plugin.getConfig().getInt(player + ".sharp");
		int protect = plugin.getConfig().getInt(player + ".protect");
		int speed = plugin.getConfig().getInt(player + ".speed");
		
		i.clear();
		for (PotionEffect effect : person.getActivePotionEffects()){
	        person.removePotionEffect(effect.getType());
		}
		i.setHelmet(null);
		i.setChestplate(null);
		i.setLeggings(null);
		i.setBoots(null);
		
		if(sword == 1){
			ItemStack item = new ItemStack(Material.WOOD_SWORD);
			addEnchantmentObject.addSharp(item, sharp);
			i.addItem(item);
		} else if(sword == 2){
			ItemStack item = new ItemStack(Material.STONE_SWORD);
			addEnchantmentObject.addSharp(item, sharp);
			i.addItem(item);
		} else if(sword == 3){
			ItemStack item = new ItemStack(Material.IRON_SWORD);
			addEnchantmentObject.addSharp(item, sharp);
			i.addItem(item);
		} else if(sword == 4){
			ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
			addEnchantmentObject.addSharp(item, sharp);
			i.addItem(item);
		}
		
		if(armor == 2){
			ItemStack item1 = new ItemStack(Material.LEATHER_HELMET);
			ItemStack item2 = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = new ItemStack(Material.LEATHER_LEGGINGS);
			ItemStack item4 = new ItemStack(Material.LEATHER_BOOTS);
			addEnchantmentObject.addProtection(item1, item2, item3, item4, protect);
			i.setHelmet(item1);
			i.setChestplate(item2);
			i.setLeggings(item3);
			i.setBoots(item4);
		} else if(armor == 3){
			ItemStack item1 = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemStack item2 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
			ItemStack item4 = new ItemStack(Material.CHAINMAIL_BOOTS);
			addEnchantmentObject.addProtection(item1, item2, item3, item4, protect);
			i.setHelmet(item1);
			i.setChestplate(item2);
			i.setLeggings(item3);
			i.setBoots(item4);
		} else if(armor == 4){
			ItemStack item1 = new ItemStack(Material.IRON_HELMET);
			ItemStack item2 = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack item3 = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack item4 = new ItemStack(Material.IRON_BOOTS);
			addEnchantmentObject.addProtection(item1, item2, item3, item4, protect);
			i.setHelmet(item1);
			i.setChestplate(item2);
			i.setLeggings(item3);
			i.setBoots(item4);
		} else if(armor == 5){
			ItemStack item1 = new ItemStack(Material.DIAMOND_HELMET);
			ItemStack item2 = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemStack item4 = new ItemStack(Material.DIAMOND_BOOTS);
			addEnchantmentObject.addProtection(item1, item2, item3, item4, protect);
			i.setHelmet(item1);
			i.setChestplate(item2);
			i.setLeggings(item3);
			i.setBoots(item4);
		}
		if(speed == 2){
			person.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 0));
		} else if(speed == 3){
			person.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, 1));
		}
		ItemStack steak = new ItemStack(Material.COOKED_BEEF, 64);
		i.addItem(steak);
	}
}
