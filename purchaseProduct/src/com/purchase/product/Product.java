package com.purchase.product;

import java.util.List;

public class Product {
	private String productId, productName, productCategory;
	private Double price;
	List<String> availableCity;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<String> getAvailableCity() {
		return availableCity;
	}

	public void setAvailableCity(List<String> availableCity) {
		this.availableCity = availableCity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", price=" + price + ", availableCity=" + availableCity + "]";
	}

}
