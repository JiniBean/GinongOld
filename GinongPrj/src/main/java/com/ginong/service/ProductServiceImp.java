package com.ginong.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.ginong.context.MybatisContext;
import com.ginong.entity.Product;
import com.ginong.repository.ProductRepository;


public class ProductServiceImp implements ProductService {
	
	private ProductRepository repository;
	
	public ProductServiceImp() {
		
		SqlSessionFactory factory = MybatisContext.getFactory();
		SqlSession session = factory.openSession();
		repository = session.getMapper(ProductRepository.class);
	}
	
	public List<Product> getList() {
		List<Product> list= repository.findAll();
		return list;
	}

	public Product getProduct(int productId) {
		Product product = repository.findById(productId);
		
		return product;
	}

}
