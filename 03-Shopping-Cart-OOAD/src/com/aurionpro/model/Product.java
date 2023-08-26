package com.aurionpro.model;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	private double dicountPercent;

	public Product(int productId, String productName, double productPrice, double dicountPercent) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.dicountPercent = dicountPercent;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getDicountPercent() {
		return dicountPercent;
	}

	public void setDicountPercent(double dicountPercent) {
		this.dicountPercent = dicountPercent;
	}

	public double calculateDiscountedPrice() {
		return productPrice - (productPrice * dicountPercent / 100);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", dicountPercent=" + dicountPercent + "]";
	}

}
