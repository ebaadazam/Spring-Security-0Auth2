package com.ebaad.SpringSecurityOAuth2Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityOAuth2ProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOAuth2ProjectApplication.class, args);
	}
}
