package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class} )
@EnableJpaRepositories("com.api")
public class ApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

	}

}
