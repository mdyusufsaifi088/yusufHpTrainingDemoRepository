package com.questglobal.restcrud.dto;

import com.questglobal.restcrud.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
	
	
	private User user;

}
