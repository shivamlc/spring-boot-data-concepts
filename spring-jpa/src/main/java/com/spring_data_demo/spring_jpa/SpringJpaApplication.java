package com.spring_data_demo.spring_jpa;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring_data_demo.spring_jpa.repository.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner{

	@Autowired
	PersonJpaRepository personJpaRepository;

	org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User by id 1003-> {}", personJpaRepository.findById(1003));
	
	}

}
