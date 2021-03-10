package com.maddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SchoolManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
		BCryptPasswordEncoder code = new BCryptPasswordEncoder();
		String password = "admin";
		String hashedPassword = code.encode(password);
		//System.out.println(hashedPassword);
	}

}
