package com.example.bugdemo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableRabbit
public class BugdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugdemoApplication.class, args);
	}

}
