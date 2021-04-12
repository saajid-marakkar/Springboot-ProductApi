package com.example.ProductApi.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductApi.facade.ProductFacade;
import com.example.ProductApi.model.Product;




@CrossOrigin
@RestController
public class ProductController 
{
	
	
	
	@Autowired
	private ProductFacade productFacade;
	
	
	@PostMapping("/send")
	public Product save(@RequestBody Product product) 
	{
		return productFacade.save(product);
		
	}
	

	@RequestMapping("/getAll") 
	public List<Product> getAll()
	{
		return productFacade.getAll();
	}
	
	
	@RequestMapping("getById/{id}") 
	public Product getProduct(@PathVariable String id)
	{
		return productFacade.getProduct(id);
	}
	
	
	
	@DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id")String id)
	{
		return productFacade.deleteProduct(id);
    }
	
	@PutMapping("/editproduct")
    public Product editProduct(@RequestBody Product newStudent) 
	{
		
		return productFacade.editProduct(newStudent);
		
		
    }

}
