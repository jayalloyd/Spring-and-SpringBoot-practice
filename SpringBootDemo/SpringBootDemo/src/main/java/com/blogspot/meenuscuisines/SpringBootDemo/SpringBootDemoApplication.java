package com.blogspot.meenuscuisines.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		System.out.println("Hello World");
		ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
		Alien obj=context.getBean(Alien.class);
		obj.code();
	}
}
