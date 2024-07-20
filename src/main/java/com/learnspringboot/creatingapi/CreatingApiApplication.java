package com.learnspringboot.creatingapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreatingApiApplication {

	private static Logger logger = LoggerFactory.getLogger(CreatingApiApplication.class);
	
	public static void main(String[] args) {
		logger.info("Hey Vishwa! How are you?");
		SpringApplication.run(CreatingApiApplication.class, args);
	}

}
