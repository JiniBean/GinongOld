//package com.ginong.user.old;
//
//public class ProductList {
//	private Product[] products;
//	private int count;
//	private int idx;
//	
//	public ProductList() {
//		count = 1;
//		idx = 0;
//		products = new Product[count];
//	}
//	
//	public void add(Product product) {
//		
//		if( !(products[count-1]==null) ) {
//			Product[] temp = new Product[count+1];
//			
//			for(int i=0; i<count; i++)
//				temp[i] = products[i];
//			products = temp;
//			count++;
//		}
//		
//		products[idx] = product;
//		idx++;
//	}
//	
//	public int size() {
//		return count;
//	}
//
//	public Product get(int i) {
//		Product product = products[i];
//		return product;
//	}
//
//
//	public int getCount() {
//		return count;
//	}
//
//	public void setCount(int count) {
//		this.count = count;
//	}
//
//	public int getIdx() {
//		return idx;
//	}
//
//	public void setIdx(int idx) {
//		this.idx = idx;
//	}
//
//	
//}
