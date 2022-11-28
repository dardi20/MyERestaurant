package org.MyRestaurant.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.MyRestaurant.entity.Menu;
import org.MyRestaurant.entity.product.Product;
import org.MyRestaurant.utils.MenuImporter;

public class ProductModel {

	public List<Product> generateProductList() {
		Menu menu = new MenuImporter().importMenu("/menu_items.txt");
		List<Product> productList = new ArrayList<Product>();
		HashMap<Integer, Product> menuItems = menu.getMenuItems();
		for (Entry<Integer, Product> product : menuItems.entrySet()) {
			productList.add(product.getValue());
		}
		return productList;
	}
	

	public static void main(String[] args) {
		
		List<Product> productList = new ProductModel().generateProductList();
		for(Product product : productList) {
			System.out.println(product.getName());
		}
	
	}

}
