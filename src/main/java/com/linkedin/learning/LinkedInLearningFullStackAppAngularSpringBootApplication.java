package com.linkedin.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
//will intelligently configure beans that you are likely to need in your Spring application context. 
@ComponentScan
//will enable automatic scanning for configuration classes to wire up in your spring application context. 
public class LinkedInLearningFullStackAppAngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedInLearningFullStackAppAngularSpringBootApplication.class, args);
	}

}