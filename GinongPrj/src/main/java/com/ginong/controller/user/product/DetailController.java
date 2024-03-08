package com.ginong.controller.user.product;

import java.io.IOException;

import com.ginong.entity.Product;
import com.ginong.service.ProductService;
import com.ginong.service.ProductServiceImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product/detail")
public class DetailController extends HttpServlet {

	private ProductService service; 
	
	public DetailController() {
		service = new ProductServiceImp();
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
