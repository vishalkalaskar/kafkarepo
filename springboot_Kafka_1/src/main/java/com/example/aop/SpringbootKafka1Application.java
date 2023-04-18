package com.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringbootKafka1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafka1Application.class, args);
	}

}
