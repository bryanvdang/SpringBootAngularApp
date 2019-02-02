package com.linkedin.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
//will define how the JSON strings in the request body are deserialized from requests in POJOs (Plain Old Java Objects) which we use to model our data. 
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//will define how we serialize our Java objects into a JSON string in the response body. 

@Configuration
public class ApiConfig {
	
	//create a public method, object mapper that returns an object mapper object
	@Bean
	public ObjectMapper objectMapper() {
		//updating so it can parse iso formatted dates
		ObjectMapper objectMapper = new ObjectMapper();
		//register a module with that object mapper called JavaTimeModule
		objectMapper.registerModule(new JavaTimeModule());
		return new ObjectMapper();
	}
	//take the object mapper as a param
	//use the object mapper to create a default PrettyPrinter, which will output a JSON in Human readable format. 
	@Bean
	public ObjectWriter objectWriter(ObjectMapper objectMapper) {
		return objectMapper.writerWithDefaultPrettyPrinter();
	}
}
