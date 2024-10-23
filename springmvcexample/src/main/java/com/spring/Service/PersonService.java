package com.spring.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.PersonDao;
import com.spring.Model.Person;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> getAllPersons() {
        return personDao.getPerson();
    }

    public String addPerson(int id, String name, int age, String gender) {
        return personDao.addPerson(id, name, age, gender);
    }

    public Person getById(int id) {
        return personDao.fetchByIdFromRepo(id);
    }
}
