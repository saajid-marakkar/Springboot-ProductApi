package com.example.ProductApi.facade;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.ProductApi.model.Product;

public interface ProductFacade {
	
	/**
	 * 
	 * @param product
	 * @return Product
	 */
	public Product save(Product product);
	
	/**
	 * 
	 * @return List<Product>
	 */
	public List<Product> getAll();
	
	/**
	 * 
	 * @param id
	 * @return Product
	 */
	public Product getProduct(String id);
	
	/**
	 * 
	 * @param id
	 * @return ResponseEntity<HttpStatus>
	 */
	public ResponseEntity<HttpStatus> deleteProduct(String id);
	
	/**
	 * 
	 * @param newProduct
	 * @return Product
	 */
	public Product editProduct(Product newProduct);

}
