package com.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.Model.Person;
import com.spring.Service.PersonService;

@Controller
public class controller {

    @Autowired
    private PersonService service;

    @GetMapping("/")
    public String welcome() {
        return "user";
    }

    @GetMapping("addperson")
    @ResponseBody
    public List<Person> displayList() {
        return service.getAllPersons();
    }

    @GetMapping("includePerson")
    public String addPerson(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("gender") String gender) {
        String msg = service.addPerson(id, name, age, gender);
        return msg;
    }

    @GetMapping("/addperson/{id}")
    @ResponseBody
    public Person fetchById(@PathVariable("id") int id) {
        Person msg = service.getById(id);
        return msg;
    }
}
