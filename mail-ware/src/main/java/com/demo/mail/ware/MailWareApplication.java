package com.demo.mail.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MailWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailWareApplication.class, args);
	}

}
