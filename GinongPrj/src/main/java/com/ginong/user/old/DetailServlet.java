//package com.ginong.user.old;
//
//import java.io.IOException;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@WebServlet("/menu/detail")
//public class DetailServlet extends HttpServlet {
//
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//
//		ProductRepository repository = new ProductRepository();
//		System.out.println(request.getParameter("id"));
//		int id = Integer.parseInt(request.getParameter("id"));
//		System.out.println("야호");
//
//		Product product = repository.findById(id);
//		
//		
//		request.setAttribute("product", product);
//		request.
//				getRequestDispatcher("detail.jsp")
//				.forward(request, response);
//		
//	}
//}
