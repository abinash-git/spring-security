package com.neosoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableOAuth2Sso
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.neosoft.dao"})
@EntityScan("com.neosoft.model")
@ComponentScan(basePackages= {"com.neosoft"})
//@EnableDiscoveryClient

public class SpringBootSecurityOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityOAuth2Application.class, args);
	}
}




