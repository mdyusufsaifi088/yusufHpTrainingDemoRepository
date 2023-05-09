package com.questglobal.restcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootRestCrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCrudProjectApplication.class, args);
	}

}
