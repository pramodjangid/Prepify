package com.prepify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.prepify")
public class PrepifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrepifyApplication.class, args);
	}

}
