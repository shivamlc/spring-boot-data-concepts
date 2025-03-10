package com.spring_boot.jdbc.example.demo_project.entity;

import java.util.Date;

public class PersonEntity {
    private int id;
    private String name;
    private String location;
    private Date birthDate;

    public PersonEntity(){

    }
    public PersonEntity(int id, String name, String location, Date birthDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    //when toString() method is overridem, then instead of object hash value, the value returned by the toString() method is printed
    @Override
    public String toString(){
        return String.format("\nPerson : [id = %s, name = %s, location = %s, birthDate = %s]", id, name, location, birthDate);
    }

}
