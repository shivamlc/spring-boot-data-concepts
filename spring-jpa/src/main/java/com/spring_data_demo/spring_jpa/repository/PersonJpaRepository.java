package com.spring_data_demo.spring_jpa.repository;

import org.springframework.stereotype.Repository;

import com.spring_data_demo.spring_jpa.entity.PersonEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/*
 * PersonJpaRepository class manages the entity
 * Manages transactions.
 * This is not a Spring Data Jpa repository interface.
 * This is a custom defined Jpa Repository class.
 */
@Repository
@Transactional
public class PersonJpaRepository { 

    @PersistenceContext // all operations within a session are stored in PC.
    EntityManager entityManager; // connects to database, manages enitites and is an interface to PC. 
    // all opetrations go through entity manager.

    public PersonEntity findById(int id)
    {
        return entityManager.find(PersonEntity.class, id);
    }

}
