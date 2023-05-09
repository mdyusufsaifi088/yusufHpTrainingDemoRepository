package com.questglobal.restcrud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questglobal.restcrud.entity.Product;
import com.questglobal.restcrud.entity.User;
import com.questglobal.restcrud.exception.ProductNotFoundException;
import com.questglobal.restcrud.repository.ProductRepository;
import com.questglobal.restcrud.repository.UserRepository;

import java.util.*;

@Service
public class UserProductService {
	
	

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductRepository productRepository;
	
	
	Logger log =LoggerFactory.getLogger(UserProductService.class);
	

	public User saveUserWIthProduct(User user) {
		log.info("UserProductService : saveUserWIthProduct execution started");
		return userRepository.save(user);
		
		
	}

	public java.util.List<User> findAllUsers() {
		return userRepository.findAll();

	}

	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	public Product getProductById(Integer productId) throws ProductNotFoundException {

		Product product = productRepository.findById(productId).get();
		if (product != null) {
			return product;
		}

		else {
			throw new ProductNotFoundException("Product not found  with id :" + productId);
		}

	}

	public String deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		return "user deleted with id : " + userId;
	}

}
