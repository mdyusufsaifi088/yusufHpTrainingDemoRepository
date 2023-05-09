package com.questglobal.restcrud.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("quest_global").apiInfo(apiInfo())
				.select().paths(regex("/api/v1.*")).build();
	}
	
	
	
	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("UserProduct API")
				.description("quest global User Product api Dcumentation using Swagger 2 for Demo Rest Project")
				.license("Quest global Rest api license")
				.version("1.0").build();
	}
	
	
	

}
