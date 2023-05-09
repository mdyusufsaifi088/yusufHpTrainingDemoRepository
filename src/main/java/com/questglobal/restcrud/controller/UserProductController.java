package com.questglobal.restcrud.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.questglobal.restcrud.entity.Product;
import com.questglobal.restcrud.entity.User;
import com.questglobal.restcrud.exception.ProductNotFoundException;
import com.questglobal.restcrud.service.UserProductService;

@RestController
@RequestMapping("/api/v1")
public class UserProductController {
	
	
	 Logger log = LoggerFactory.getLogger(UserProductController.class);

	
	
	@Autowired
	private UserProductService userProductService;

	@PostMapping("/addUser")
	public ResponseEntity<User> saveUser(@RequestBody User User) {
		return  new ResponseEntity<User>(userProductService.saveUserWIthProduct(User),HttpStatus.CREATED);
	}

	@GetMapping("/findAllUser")
	public ResponseEntity<List<User>> findAllUsers() {
		return ResponseEntity.ok(userProductService.findAllUsers());
	}

	@GetMapping("/findAllProduct")
	public ResponseEntity<List<Product>> findAllProduct(){
		return ResponseEntity.ok(userProductService.findAllProduct());
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId) {
		return ResponseEntity.ok(userProductService.deleteUser(userId));
	}
	
	
	
	
    @GetMapping("/findProductbyId/{productId}")
	public  ResponseEntity<Product> getProductById(@PathVariable Integer productId) throws ProductNotFoundException{
			return ResponseEntity.ok(userProductService.getProductById(productId));
			
		}
    
    
}


