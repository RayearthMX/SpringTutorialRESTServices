package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.nonrest.payroll", "com.example.springTutorialRESTServices"})
public class SpringTutorialRestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialRestServicesApplication.class, args);
	}

}
