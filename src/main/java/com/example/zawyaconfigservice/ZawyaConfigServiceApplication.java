package com.example.zawyaconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZawyaConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZawyaConfigServiceApplication.class, args);
	}

}
