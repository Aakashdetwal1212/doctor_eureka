package com.example.us;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringUrekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUrekaserverApplication.class, args);
	}

}
