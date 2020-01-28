package com.appsdev.app.api.zuul.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MobileAppApiZuulApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppApiZuulApigatewayApplication.class, args);
	}

}
