package com.java4s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootApp {
	public static void main(String[] args) {
		System.out.println("B4 run()  provider........................!");
		SpringApplication.run(SpringBootApp.class, args);
		System.out.println("After run() provider............!");
	}
}
