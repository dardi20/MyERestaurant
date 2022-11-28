package org.MyRestaurant.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.MyRestaurant.entity.Client;
import org.MyRestaurant.entity.Menu;
import org.MyRestaurant.entity.product.Product;
import org.MyRestaurant.utils.MenuImporter;

/**
 * Servlet implementation class OrderController
 */
@WebServlet("/order")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Menu menu = new MenuImporter().importMenu("/menu_items.txt");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Product> productList = new ArrayList<Product>();
		HashMap<Integer, Product> menuItems = menu.getMenuItems();
		for(Entry<Integer,Product> productEntry : menuItems.entrySet()) {
			productList.add(productEntry.getValue());
		}
		request.setAttribute("menuList", productList);
		request.getRequestDispatcher("order.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String adress = request.getParameter("address");
		String telNumber = request.getParameter("telNumber");
		Client client = new Client(name,adress,telNumber);
		String [] orderList = request.getParameterValues("orderItems");
		List <Product> productList = new ArrayList<Product>();
		HashMap<Integer, Product> menuItems = menu.getMenuItems();
		for(int i = 0 ; i<orderList.length; i++) {
			productList.add(menuItems.get(Integer.valueOf(orderList[i])));
		}
		double totalSum = calculateSum(productList);
		request.setAttribute("totalSum", totalSum);
		request.setAttribute("client", client);
		request.setAttribute("orderlist", productList);
		request.getRequestDispatcher("checkout.jsp").forward(request, response);
//		PrintWriter out = response.getWriter();
	}

	private double calculateSum(List<Product> productList) {
		double sum = 0;
		for(Product product : productList) {
			sum += product.getPrice();
		}
		return sum;
	}

}
