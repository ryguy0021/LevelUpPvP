package me.ryguy0021.leveluppvp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.PlayerInventory;

public class ShopBuy implements Listener{
	UpdateInventory updateInventoryObject = new UpdateInventory();
	private LevelUpPvp plugin;
	
	public void shopBuy(Material itemBought, String player, PlayerInventory i, Player person){
		this.plugin = LevelUpPvp.instance;
		int coins = plugin.getConfig().getInt(player + ".coins");
		int sword = plugin.getConfig().getInt(player + ".sword");
		int armor = plugin.getConfig().getInt(player + ".armor");
		int sharp = plugin.getConfig().getInt(player + ".sharp");
		int protect = plugin.getConfig().getInt(player + ".protect");
		int speed = plugin.getConfig().getInt(player + ".speed");
		
		
		if (itemBought == Material.STONE_SWORD){
			if (coins > 49){
				coins = coins - 50;
				++sword;
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sword", sword);
				updateInventoryObject.updateInventory(player, i, person);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.IRON_SWORD){
			if (coins > 199){
				coins = coins - 200;
				++sword;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sword", sword);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.DIAMOND_SWORD && sword == 3){
			if (coins > 999){
				coins = coins - 1000;
				++sword;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sword", sword);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.LEATHER_CHESTPLATE){
			if (coins > 99){
				coins = coins - 100;
				++armor;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".armor", armor);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.CHAINMAIL_CHESTPLATE){
			if (coins > 249){
				coins = coins - 250;
				++armor;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".armor", armor);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.IRON_CHESTPLATE){
			if (coins > 749){
				coins = coins - 750;
				++armor;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".armor", armor);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.DIAMOND_CHESTPLATE && armor == 4){
			if (coins > 1499){
				coins = coins - 1500;
				++armor;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".armor", armor);
				plugin.saveConfig();
			}
		}
		if(itemBought == Material.REDSTONE && sharp == 1){
			if (coins > 99){
				coins = coins - 100;
				++sharp;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sharp", sharp);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.REDSTONE && sharp == 2){
			if (coins > 299){
				coins = coins - 300;
				++sharp;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sharp", sharp);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.REDSTONE && sharp == 3){
			if (coins > 749){
				coins = coins - 750;
				++sharp;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sharp", sharp);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.REDSTONE && sharp == 4){
			if (coins > 1499){
				coins = coins - 1500;
				++sharp;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sharp", sharp);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.REDSTONE && sharp == 5){
			if (coins > 2499){
				coins = coins - 2500;
				++sharp;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".sharp", sharp);
				plugin.saveConfig();
			}
		}
		if(itemBought == Material.GLOWSTONE_DUST && protect == 1){
			if (coins > 199){
				coins = coins - 200;
				++protect;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".protect", protect);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.GLOWSTONE_DUST && protect == 2){
			if (coins > 499){
				coins = coins - 500;
				++protect;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".protect", protect);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.GLOWSTONE_DUST && protect == 3){
			if (coins > 999){
				coins = coins - 1000;
				++protect;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".protect", protect);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.GLOWSTONE_DUST && protect == 4){
			if (coins > 1999){
				coins = coins - 2000;
				++protect;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".protect", protect);
				plugin.saveConfig();
			}
		}
		if(itemBought == Material.SUGAR && speed == 1){
			if (coins > 499){
				coins = coins - 500;
				++speed;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".speed", speed);
				plugin.saveConfig();
			}
		} else if(itemBought == Material.SUGAR && speed == 2){
			if (coins > 999){
				coins = coins - 1000;
				++speed;
				updateInventoryObject.updateInventory(player, i, person);
				plugin.getConfig().set(player + ".coins", coins);
				plugin.getConfig().set(player + ".speed", speed);
				plugin.saveConfig();
			}
		} 
	}
}
