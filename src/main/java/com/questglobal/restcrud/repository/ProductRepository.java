package com.questglobal.restcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questglobal.restcrud.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{
	
	
	
	

}
