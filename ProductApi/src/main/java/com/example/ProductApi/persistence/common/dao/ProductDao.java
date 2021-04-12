package com.example.ProductApi.persistence.common.dao;
import com.example.ProductApi.model.Product;
import java.util.List;

public interface ProductDao {
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
	public void deleteProduct(String id);
	
	/**
	 * 
	 * @param newProduct
	 * @return Product
	 */
	public Product editProduct(Product newProduct);

}
