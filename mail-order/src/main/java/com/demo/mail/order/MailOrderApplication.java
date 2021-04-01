package com.demo.mail.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MailOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailOrderApplication.class, args);
	}

}
