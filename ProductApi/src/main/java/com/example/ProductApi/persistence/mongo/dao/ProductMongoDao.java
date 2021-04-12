package com.example.ProductApi.persistence.mongo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ProductApi.model.Product;
import com.example.ProductApi.persistence.common.dao.ProductDao;
import com.example.ProductApi.persistence.mongo.repository.ProductRepository;

import java.util.List;


@Component("ProductMongoDao")
public class ProductMongoDao implements ProductDao {

	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Product save(Product product) 
	{
		return productRepository.save(product);
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public List<Product> getAll()
	{ 
		return productRepository.findAll();
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public void deleteProduct(String id) 
	{
		productRepository.deleteById(id);
	  
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Product getProduct(String id) 
	{
		return productRepository.findById(id).orElse(null);
	}
	
	/**
	 * 
	 * @param newProduct
	 * @return
	 */
	@Override
	public Product editProduct(Product newProduct) 
	{
		Product oldProduct = productRepository.findById(newProduct.getId()).orElse(null);
		oldProduct.setProductName(newProduct.getProductName());    
		oldProduct.setCategoryName(newProduct.getCategoryName());
	    productRepository.save(oldProduct);
	    return oldProduct;
	 }
}
