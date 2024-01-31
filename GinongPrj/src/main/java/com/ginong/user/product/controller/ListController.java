package com.ginong.user.product.controller;

import java.io.IOException;
import java.util.List;

import com.ginong.user.product.entity.Product;
import com.ginong.user.product.service.ProductService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product/list")
public class ListController extends HttpServlet{
	
	private ProductService service;
	
	public ListController() {
		service = new ProductService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Product> list = service.getList();
		
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("/WEB-INF/view/user/product/list.jsp").forward(req, resp);
	}
}