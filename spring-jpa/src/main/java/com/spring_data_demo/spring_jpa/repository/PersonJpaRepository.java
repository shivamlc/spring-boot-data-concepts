package com.spring_data_demo.spring_jpa.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring_data_demo.spring_jpa.entity.PersonEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

    public PersonEntity update(PersonEntity personEntity)
    {
        //merge checks if personEntity has Id or not
        //if Id is missing then it adds id to the entity before updating the record
        return entityManager.merge(personEntity);
    }

    public PersonEntity insert(PersonEntity personEntity)
    {
        //merge checks if personEntity has Id or not
        //if Id is missing then it adds id to the entity before updating the record
        //merge updates records as well as inserts new records
        return entityManager.merge(personEntity);
    }

    public void deleteById(int id)
    {
        PersonEntity personEntity = findById(id);

        entityManager.remove(personEntity);
    }

    public List<PersonEntity> showAll(){
        TypedQuery<PersonEntity> namedTypedQuery = entityManager.createNamedQuery("show_all_persons",
         PersonEntity.class);
        return namedTypedQuery.getResultList();
    }

}
