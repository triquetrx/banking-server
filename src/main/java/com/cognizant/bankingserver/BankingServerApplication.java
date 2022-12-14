package com.cognizant.bankingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingServerApplication.class, args);
	}

}
