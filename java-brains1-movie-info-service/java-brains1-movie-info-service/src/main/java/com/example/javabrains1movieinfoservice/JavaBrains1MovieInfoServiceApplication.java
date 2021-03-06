package com.example.javabrains1movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class JavaBrains1MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBrains1MovieInfoServiceApplication.class, args);
	}

}
