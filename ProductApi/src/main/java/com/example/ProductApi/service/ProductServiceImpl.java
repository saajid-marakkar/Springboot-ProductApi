package com.example.ProductApi.service;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ProductApi.model.Product;
import com.example.ProductApi.persistence.common.dao.ProductDao;




@Service
public class ProductServiceImpl implements ProductService {

	
	
	
	@Autowired
	private ProductDao productDao;
	
	
	/**
	 * 
	 * @param product
	 * @return
	 */
	@Override
	public Product save(Product product) 
	{
		return productDao.save(product);
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public List<Product> getAll()
	{ 
		return productDao.getAll();
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public ResponseEntity<HttpStatus> deleteProduct(String id) 
	{
		try
	    {
			productDao.deleteProduct(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	    catch(Exception e)
	    {
	         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Product getProduct(String id) 
	{
		return productDao.getProduct(id);
	}
	
	/**
	 * 
	 * @param newProduct
	 * @return
	 */
	@Override
	public Product editProduct(Product newProduct) 
	{
		return productDao.editProduct(newProduct);
	 }
}
