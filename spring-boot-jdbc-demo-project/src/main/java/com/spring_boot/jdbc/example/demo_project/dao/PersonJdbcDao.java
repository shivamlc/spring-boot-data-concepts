package com.spring_boot.jdbc.example.demo_project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring_boot.jdbc.example.demo_project.entity.PersonEntity;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate; // this is provided by Spring to help connect to database and execute queries

    public List<PersonEntity> findAll(){
        //BeanPropertyRowMapper returns row from table when db table column name 
        //matches java entity field name as it is. This is the default way to 
        //extract data row from table w/o creating custom row mapper.

        //JDBC template uses sql query to retreive data from table.
        return jdbcTemplate.query("select * from person", 
        new BeanPropertyRowMapper<PersonEntity>(PersonEntity.class));
    }


    public PersonEntity findById(int id){
        //BeanPropertyRowMapper returns row from table when db table column name 
        //matches java entity field name as it is. This is the default way to 
        //extract data row from table w/o creating custom row mapper.

        //JDBC template uses sql query to retreive data from table.
        return jdbcTemplate.queryForObject(
            "select * from person where id=?", new Object[] {id}, 
        new BeanPropertyRowMapper<PersonEntity>(PersonEntity.class)
        );
    }

    public List<PersonEntity> findByName(String name){
        //BeanPropertyRowMapper returns row from table when db table column name 
        //matches java entity field name as it is. This is the default way to 
        //extract data row from table w/o creating custom row mapper.

        //JDBC template uses sql query to retreive data from table.
        return jdbcTemplate.query(
            "select * from person where name=?", new Object[] {name}, 
        new BeanPropertyRowMapper<PersonEntity>(PersonEntity.class)
        );
    }

    public List<PersonEntity> findByLocationAndOrderByNameAsc(String location){
        //BeanPropertyRowMapper returns row from table when db table column name 
        //matches java entity field name as it is. This is the default way to 
        //extract data row from table w/o creating custom row mapper.

        //JDBC template uses sql query to retreive data from table.
        return jdbcTemplate.query(
            "select * from person where location=? order by name ASC", new Object[] {location}, 
        new BeanPropertyRowMapper<PersonEntity>(PersonEntity.class)
        );
    }

    public List<PersonEntity> findBYNameLike(String regex){
        //BeanPropertyRowMapper returns row from table when db table column name 
        //matches java entity field name as it is. This is the default way to 
        //extract data row from table w/o creating custom row mapper.

        //JDBC template uses sql query to retreive data from table.
        return jdbcTemplate.query(
            "select * from person where name like ?", new Object[] {regex}, 
        new BeanPropertyRowMapper<PersonEntity>(PersonEntity.class)
        );
    }

}
