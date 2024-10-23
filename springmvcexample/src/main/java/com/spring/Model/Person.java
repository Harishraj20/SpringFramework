package com.spring.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    @Id
    private int personid;
    private String name;
    private int age;
    private String gender;

    public Person(){

    }
    public Person(int personid, String name, int age, String gender) {
        this.personid = personid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public int getPersonid() {
        return personid;
    }
    public void setPersonid(int personid) {
        this.personid = personid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [personid=" + personid + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
    
}
