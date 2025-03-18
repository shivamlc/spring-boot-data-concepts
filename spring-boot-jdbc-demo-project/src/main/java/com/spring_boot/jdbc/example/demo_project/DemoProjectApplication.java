package com.spring_boot.jdbc.example.demo_project;

import java.time.Instant;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring_boot.jdbc.example.demo_project.dao.PersonJdbcDao;
import com.spring_boot.jdbc.example.demo_project.entity.PersonEntity;


@SpringBootApplication
public class DemoProjectApplication implements CommandLineRunner{// using Command line runner to execute code at command line

	@Autowired
	PersonJdbcDao personJdbcDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All persons from table -> {}", personJdbcDao.findAll());
		logger.info("User by id 1003-> {}", personJdbcDao.findById(1003));
		logger.info("User by name 'Alex'-> {}", personJdbcDao.findByName("Alex"));
		logger.info("User by location 'Brisbane' and ordered by name-> {}", personJdbcDao.findByLocationAndOrderByNameAsc("Brisbane"));
		logger.info("All persons with name like 'Al'-> {}", personJdbcDao.findBYNameLike("%Al%"));
		logger.info("Delete person with id = 1015-> {}", personJdbcDao.deleteById(1015));
		logger.info("Delete person with id = 1005 or location = Brisbane-> {}", personJdbcDao.deleteByLocationOrId(1005, "Brisbane"));

		PersonEntity newPersonEntity = 
		new PersonEntity(
			2001, 
			"Carlos", 
			"Perth", 
			Date.from(Instant.now())
			);

		logger.info("Insert new person ={},{}", 
		newPersonEntity, personJdbcDao.insertPerson(newPersonEntity));

		newPersonEntity.setName("Carlos B. Nathan");
		newPersonEntity.setLocation("Adelaide");
		newPersonEntity.setBirthDate(Date.from(Instant.now().plusSeconds(1000000000)));

		logger.info("Updating person with details = {},{}", 
		newPersonEntity, personJdbcDao.updatePerson(newPersonEntity));
	}

}
