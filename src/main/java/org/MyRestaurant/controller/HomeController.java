package org.MyRestaurant.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.MyRestaurant.entity.product.Product;
import org.MyRestaurant.model.ProductModel;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page = page.toLowerCase();
		switch(page) {
			case "home":
				request.setAttribute("title", "Homepage");
				request.getRequestDispatcher("index.jsp").forward(request, response);
				break;
			case "menulist":
				request.setAttribute("title", "Menu");
				List<Product>productList = new ArrayList<>();
				productList = new ProductModel().generateProductList();
				request.setAttribute("productList", productList);
				request.getRequestDispatcher("menu.jsp").forward(request, response);
				break;
			default:
				request.setAttribute("title", "Error page");
				request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
