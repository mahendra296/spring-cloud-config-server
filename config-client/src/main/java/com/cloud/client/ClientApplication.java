package com.cloud.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ClientApplication implements CommandLineRunner {

	private Logger logger= LoggerFactory.getLogger(ClientApplication.class);

	@Value("${demo.username}")
	private String username;

	@Value("${demo.password}")
	private String password;

	@Value("${demo.url}")
	private String url;

	@Value("${test.test}")
	private String test;


	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("=====================>\n ");
		logger.info("User Name is : " + username);
		logger.info("Password is : " + password);
		logger.info("url is : " + url);
		logger.info("test is : " + test);
	}
}
