package com.ginong.repository;

import java.util.List;

import com.ginong.entity.Product;

public interface ProductRepository {

	public List<Product> findAll();
	public Product findById(int productId);
}
