package com.margieblair;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//If you are using @SpringBootApplication then by default auto-configure feature is enabled automatically. So, adding explicitly @EnableAutoConfiguration annotation has no value added.

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
