package org.MyRestaurant.utils;

import java.util.HashMap;
import java.util.Map.Entry;

import org.MyRestaurant.entity.Menu;
import org.MyRestaurant.entity.product.Product;

public class MenuPrinter {
	
	public void printMenu(Menu menu) {
		System.out.println("--------------Menu--------------");
		
		HashMap<Integer, Product> menuItems = menu.getMenuItems();
		
		for(Entry<Integer,Product> menuEntry : menuItems.entrySet()) {
			Product menuItem = menuEntry.getValue();
			System.out.println(menuItem.getProductId() + ". " + menuItem.getName() + " | " + menuItem.getPrice()  + "Euro.");
		}
	
		System.out.println("--------------------------------");
	}
	
}
