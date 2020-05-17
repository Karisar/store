package com.sarsila.store.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sarsila.store.repository.ProductRepository;
import com.sarsila.store.service.model.ProductModel;

@Service
public class ProductService {
	
	private final ProductRepository repository;

	public ProductService(ProductRepository repository) {
		this.repository = repository;
		
	}
	
	public List<ProductModel> findAll() {
		return repository.findAll();
	}
}
