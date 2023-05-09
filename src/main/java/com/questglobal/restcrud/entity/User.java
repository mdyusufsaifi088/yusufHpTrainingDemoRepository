package com.questglobal.restcrud.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	
	@Id
	@GeneratedValue
	private Integer userId;
	
	private String name;
	
	
	private String email;
	
	@OneToMany(targetEntity = Product.class,cascade=CascadeType.PERSIST,orphanRemoval = true)
	@JoinColumn(name="up_fk", referencedColumnName="userId")
	private java.util.List<Product> product;


	
	
	
	
	
	

}
