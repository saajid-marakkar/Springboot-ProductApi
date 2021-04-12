package com.example.ProductApi.persistence.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.example.ProductApi.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	
}
