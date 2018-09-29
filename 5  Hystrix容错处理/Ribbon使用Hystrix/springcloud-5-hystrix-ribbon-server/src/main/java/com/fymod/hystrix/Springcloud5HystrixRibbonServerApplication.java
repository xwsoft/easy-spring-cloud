package com.fymod.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Springcloud5HystrixRibbonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springcloud5HystrixRibbonServerApplication.class, args);
	}
}
