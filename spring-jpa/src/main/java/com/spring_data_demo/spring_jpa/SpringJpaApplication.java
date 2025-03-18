package com.spring_data_demo.spring_jpa;

import java.time.Instant;
import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring_data_demo.spring_jpa.entity.PersonEntity;
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

		PersonEntity nPersonEntity = new PersonEntity();
		nPersonEntity.setId(1);
		nPersonEntity.setLocation("Brisbane");
		nPersonEntity.setName("Marcus");
		nPersonEntity.setBirthdate(Date.from(Instant.now()));

		logger.info("Insert person without id-> {}", personJpaRepository.insert(
			new PersonEntity("Mark", "Sydney",Date.from(Instant.now()))));
		
		logger.info("Insert second person without id-> {}", personJpaRepository.insert(
				new PersonEntity("Sid", "Melbourne",Date.from(Instant.now()))));
	
		
		logger.info("Update person with id 1 -> {}", 
			personJpaRepository.update(nPersonEntity));

		logger.info("Delete person with id 1");
		personJpaRepository.deleteById(1);

		logger.info("Insert third person without id-> {}", personJpaRepository.insert(
				new PersonEntity("Amy", "Perth",Date.from(Instant.now()))));

		logger.info("Insert fourth person without id-> {}", personJpaRepository.insert(
				new PersonEntity("Suz", "Melbourne",Date.from(Instant.now()))));

		logger.info("Show all persons-> {}", personJpaRepository.showAll());
		
	
	

	}

}
