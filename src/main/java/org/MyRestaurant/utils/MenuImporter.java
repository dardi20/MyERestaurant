package org.MyRestaurant.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import org.MyRestaurant.entity.Menu;
import org.MyRestaurant.entity.product.Drink;
import org.MyRestaurant.entity.product.Meal;
import org.MyRestaurant.entity.product.Product;

public class MenuImporter {
	public Menu importMenu(String path) {
		Menu menu = new Menu();
		HashMap<Integer, Product> menuItems = menu.getMenuItems();
		try {
			List<String> menuItemsAsString = Files.readAllLines(Paths.get(getClass().getResource(path).toURI()));
			for (String menuItemAsString : menuItemsAsString) {
				Product product = null;
				String[] menuItemSplited = menuItemAsString.split(",");
				for (int i = 0; i < menuItemSplited.length; i++) {
					int productId = Integer.valueOf(menuItemSplited[0]);
					String productName = menuItemSplited[1];
					double productPrice = Double.valueOf(menuItemSplited[2]);
					String productCategory = menuItemSplited[3];
					if (productCategory.equals("meal")) {
						product = new Meal(productName, productId, productPrice);
					} else if (productCategory.equals("drink")) {
						boolean sugarFree = Boolean.valueOf(menuItemSplited[4]);
						product = new Drink(productName, productId, productPrice, sugarFree);
					} else {
						StringBuilder message = new StringBuilder();
						message.append("Product category i vendosur ").append(productCategory)
								.append(" nuk eshte i duhuri.");
						throw new RuntimeException(message.toString());
					}
				}
				menuItems.put(product.getProductId(), product);
			}
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		return menu;
	}

}
