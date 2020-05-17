package com.sarsila.store.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarsila.store.service.ProductService;
import com.sarsila.store.service.model.ProductModel;

@RestController
public class ProductController {
	private final ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
		
	}
	
	@GetMapping("/products")
	public ResponseEntity<Object> list() {
		// TODO: convert into pojos
		List<ProductModel> result = service.findAll();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
