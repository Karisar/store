package com.sarsila.store.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sarsila.store.service.model.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel, Long>{
	@Override
	List<ProductModel> findAll();
}
