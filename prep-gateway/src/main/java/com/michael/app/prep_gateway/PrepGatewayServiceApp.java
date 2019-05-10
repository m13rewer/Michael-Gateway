package com.michael.app.prep_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PrepGatewayServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(PrepGatewayServiceApp.class, args);
	}
}
