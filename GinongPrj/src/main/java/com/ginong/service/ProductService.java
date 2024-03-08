package com.ginong.service;

import java.util.List;

import com.ginong.entity.Product;
import com.ginong.repository.ProductRepository;


public interface ProductService {
	
	public List<Product> getList();

	public Product getProduct(int productId);

}
