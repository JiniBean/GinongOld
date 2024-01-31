package com.ginong.user.product.controller;

import java.io.IOException;

import com.ginong.user.product.entity.Product;
import com.ginong.user.product.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product/detail")
public class DetailController extends HttpServlet {

	private ProductService service; 
	
	public DetailController() {
		service = new ProductService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int productId = Integer.parseInt(req.getParameter("productId"));
		Product product = service.getProduct(productId);
		
		req.setAttribute("product", product);
		req.getRequestDispatcher("/WEB-INF/view/user/product/detail.jsp").forward(req, resp);
	}
}
