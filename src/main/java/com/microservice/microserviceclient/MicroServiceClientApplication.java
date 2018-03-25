package com.microservice.microserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceClientApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceClientApplication.class, args);
	}
}
