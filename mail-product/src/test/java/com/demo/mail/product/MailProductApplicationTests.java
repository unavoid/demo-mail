package com.demo.mail.product;

import com.demo.mail.product.entity.BrandEntity;
import com.demo.mail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {

	}

}
