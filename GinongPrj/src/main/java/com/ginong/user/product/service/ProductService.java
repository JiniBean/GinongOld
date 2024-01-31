package com.ginong.user.product.service;

import java.util.List;

import com.ginong.user.product.entity.Product;
import com.ginong.user.product.repository.ProductRepository;


public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService() {
		productRepository = new ProductRepository();
		// TODO Auto-generated constructor stub
	}
	
	public List<Product> getList() {
		List<Product> list= productRepository.findAll();
		return list;
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId);
		
		return product;
	}

}
