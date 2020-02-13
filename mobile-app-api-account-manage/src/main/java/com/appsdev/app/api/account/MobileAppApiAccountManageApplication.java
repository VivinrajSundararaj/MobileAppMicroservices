package com.appsdev.app.api.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MobileAppApiAccountManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppApiAccountManageApplication.class, args);
	}

}
