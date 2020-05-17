package com.sarsila.store.controller;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/products")
	public ResponseEntity<Object> list() {
		return new ResponseEntity<>(Collections.EMPTY_LIST, HttpStatus.OK);
	}

}
