package com.valmiki.jenkines.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinesApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

	@PostConstruct
	public  intt() {
		logger.info("Application Started....");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinesApplication.class, args);
	}

}
