package com.example.ProductApi.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.ProductApi.model.Product;
import com.example.ProductApi.service.ProductServiceImpl;

@Component
public class ProductFacadeImpl implements ProductFacade {
	
	
	@Autowired
	private ProductServiceImpl productService;
	
	
	/**
	 * 
	 */
	@Override
	public Product save(Product product) 
	{
		return productService.save(product);
	}
	
	/**
	 * 
	 */
	@Override
	public List<Product> getAll()
	{
		return productService.getAll();
	}
	
	/**
	 * 
	 */
	@Override
	public Product getProduct(String id)
	{
		return productService.getProduct(id);
	}
	
	/**
	 * 
	 */
	@Override
	public ResponseEntity<HttpStatus> deleteProduct(String id)
	{
		return productService.deleteProduct(id);
	}
	
	/**
	 * 
	 */
	@Override
	public Product editProduct(Product newProduct)
	{
		return productService.editProduct(newProduct);
	}
}
