package com.example.finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class })
public class FinanceMangementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceMangementSystemApplication.class, args);
	}

}
