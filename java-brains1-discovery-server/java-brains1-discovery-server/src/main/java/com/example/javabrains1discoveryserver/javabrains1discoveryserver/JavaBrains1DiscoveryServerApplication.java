package com.example.javabrains1discoveryserver.javabrains1discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JavaBrains1DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBrains1DiscoveryServerApplication.class, args);
	}

}
