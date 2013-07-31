package me.ryguy0021.leveluppvp;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class AddEnchantment {
	public void addSharp(ItemStack item, int sharp){
		if (sharp == 2){
			item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
		} else if (sharp == 3){
			item.addEnchantment(Enchantment.DAMAGE_ALL, 2);
		} else if (sharp == 4){
			item.addEnchantment(Enchantment.DAMAGE_ALL, 3);
		} else if (sharp == 5){
			item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
		} else if (sharp == 6){
			item.addEnchantment(Enchantment.DAMAGE_ALL, 5);
		}
	}
	public void addProtection(ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, int protect){
		if (protect == 2){
			item1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		} else if (protect == 3){
			item1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		} else if (protect == 4){
			item1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		} else if (protect == 5){
			item1.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			item2.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			item3.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
		}
	}
}
