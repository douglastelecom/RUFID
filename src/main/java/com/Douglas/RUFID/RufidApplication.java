package com.Douglas.RUFID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RufidApplication {

	public static void main(String[] args) {
		SpringApplication.run(RufidApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}
}
