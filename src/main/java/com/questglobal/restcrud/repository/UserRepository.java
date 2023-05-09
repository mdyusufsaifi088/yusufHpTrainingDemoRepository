package com.questglobal.restcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.questglobal.restcrud.entity.Product;
import com.questglobal.restcrud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//public List<Product> findByUserId(Integer userId);

}
