package com.spring.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Model.Person;

@Component
public class PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<Person> getPerson() {
        Session session = sessionFactory.getCurrentSession();
        Query<Person> query = session.createQuery("from Person", Person.class);
        return query.getResultList();
    }

    @Transactional
    public String addPerson(int id, String name, int age, String gender) {
        System.out.println("Into addPerson Method");

        try {
            Session session = sessionFactory.getCurrentSession();

            Person person = new Person();
            person.setPersonid(id);
            person.setName(name);
            person.setAge(age);
            person.setGender(gender);

            session.save(person);

            return "success";
        } catch (HibernateException e) {
            System.out.println(e);
            return "Corrupted";
        }
    }

    @Transactional(readOnly = true)
    public Person fetchByIdFromRepo(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Person> query = session.createQuery("from Person where personid = :id", Person.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

}
