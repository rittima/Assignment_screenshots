package com.javabrains.springsecurityfacebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EnableOAuth2Client
public class SpringsecurityFacebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityFacebookApplication.class, args);
	}

}
