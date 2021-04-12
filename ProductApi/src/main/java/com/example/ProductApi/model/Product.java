package com.example.ProductApi.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "productdetails")
public class Product {
	
	
	@Id
	String id;
	String productName;
	String categoryName;
	
	
	public Product(String id, String productName, String categoryName) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}	
}
