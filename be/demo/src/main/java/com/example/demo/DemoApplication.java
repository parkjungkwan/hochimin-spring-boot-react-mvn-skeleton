package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		boolean flag = true;
		
		if(flag) {
			System.out.println("aa");
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("aa");
		}
		
		SpringApplication.run(DemoApplication.class, args);
	}

}
