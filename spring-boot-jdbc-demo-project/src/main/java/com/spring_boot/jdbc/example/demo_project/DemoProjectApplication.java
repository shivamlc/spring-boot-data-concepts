package com.spring_boot.jdbc.example.demo_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring_boot.jdbc.example.demo_project.dao.PersonJdbcDao;


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
	}

}
