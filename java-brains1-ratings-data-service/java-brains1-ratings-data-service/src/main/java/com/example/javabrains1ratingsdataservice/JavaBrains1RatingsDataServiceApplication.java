package com.example.javabrains1ratingsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JavaBrains1RatingsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBrains1RatingsDataServiceApplication.class, args);
	}

}
