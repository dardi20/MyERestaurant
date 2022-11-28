package org.MyRestaurant.entity;

import java.util.HashMap;

import org.MyRestaurant.entity.product.Drink;
import org.MyRestaurant.entity.product.Meal;
import org.MyRestaurant.entity.product.Product;
import org.MyRestaurant.utils.MenuImporter;

public class Menu {
	
	private HashMap<Integer, Product> menuItems = new HashMap<Integer, Product>();
	MenuImporter menuImporter = new MenuImporter();
	public Menu() {
//		this.menuItems = menuImporter.importMenu("/menu_items.txt").getMenuItems();
//		initializeMenuItems();
		}

	private void initializeMenuItems() {
		menuItems.put(100, new Meal("Hamburger", 100, 4.5, "Angus beef patty, tomato, red onion"));
		menuItems.put(101, new Meal("Cheeseburger", 101, 5, "Angus beef patty, cheese, tomato, red onion"));
		menuItems.put(102, new Meal("Sandwich", 102, 3.5, "Chicken, mayonnaise, peppers"));
		menuItems.put(103, new Meal("Hotdog", 103, 3, "Beef, mustard, ketchup, onion, cucumber"));
		menuItems.put(104, new Meal("Pizza", 104, 6, "Margarita, tomato sauce, mozarella"));
		menuItems.put(105, new Meal("Fries", 105, 2, "french fries with ketchup and mayonnaise"));
		menuItems.put(200, new Drink("Coca Cola", 200, 1, false));
		menuItems.put(201, new Drink("Coca Cola Zero", 201, 1, true));
		menuItems.put(202, new Drink("Fanta", 202, 1, false));
		menuItems.put(203, new Drink("Sprite", 203, 1, false));
		menuItems.put(204, new Drink("Red Bull", 204, 2, false));
		menuItems.put(205, new Drink("Coffee", 205, 0.5, false));
		menuItems.put(300, new Meal("Ice cream", 300, 1));
		menuItems.put(301, new Meal("Waffle", 301, 2.5));
		menuItems.put(302, new Meal("Brownie", 302, 1.5));
	}

	public HashMap<Integer, Product> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(HashMap<Integer, Product> menuItems) {
		this.menuItems = menuItems;
	}
}
