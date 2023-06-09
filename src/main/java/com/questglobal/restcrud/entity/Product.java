package com.questglobal.restcrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	
	
	@Id
	private Integer productId;
	
	private String productName;
	
	
	private Integer productQty;
	
	private Integer productPrice;
	
	

}
