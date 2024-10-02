package com.nisum.vibe.cart.discover_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VibeCartDiscoverRegistryApp {

	public static void main(String[] args) {
		SpringApplication.run(VibeCartDiscoverRegistryApp.class, args);
	}
}
