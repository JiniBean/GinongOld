package com.ginong.user.product.entity;

import java.util.Date;

public class Product {

	public Product() {

	}

	private int productId;
	private String category;
	private String korName;
	private String engName;
	private int weight;
	private int quantity;
	private int price;
	private int stock;
	private String img;
	private Date mfg;
	private String exp;
	private String storageType;
	private String desc;
	private String state;
	private int like;
	private int recommendation;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getKorName() {
		return korName;
	}
	public void setKorName(String korName) {
		this.korName = korName;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getMfg() {
		return mfg;
	}
	public void setMfg(Date mfg) {
		this.mfg = mfg;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getStorageType() {
		return storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(int recommendation) {
		this.recommendation = recommendation;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", category=" + category + ", korName=" + korName + ", engName="
				+ engName + ", weight=" + weight + ", quantity=" + quantity + ", price=" + price + ", stock=" + stock
				+ ", img=" + img + ", mfg=" + mfg + ", exp=" + exp + ", storageType=" + storageType + ", desc=" + desc
				+ ", state=" + state + ", like=" + like + ", recommendation=" + recommendation + "]";
	}

	
	
}