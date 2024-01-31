//package com.ginong.user.product;
//
//import java.io.IOException;
//import java.util.List;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
// @WebServlet("/user/list")
//public class ListServlet extends HttpServlet {
//	
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) 
//			throws ServletException, IOException {
//		
//		ProductRepository repository = new ProductRepository();
//		List<Product> list = repository.findAll();
//		int size = list.size();
//		
//		request.setAttribute("list", list );
//		request
//		.getRequestDispatcher("list.jsp")
//		.forward(request, response);
//		
//		
//		
//	}
// 
//}
