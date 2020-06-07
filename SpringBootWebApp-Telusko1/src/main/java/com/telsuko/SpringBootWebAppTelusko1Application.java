package com.telsuko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.controller")
public class SpringBootWebAppTelusko1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppTelusko1Application.class, args);
	}

}
