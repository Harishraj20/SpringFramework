package com.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Model.Employee;
import com.practice.Service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Employee API";
    }

    @GetMapping("sortedEmployees")
    @ResponseBody
    public List<Employee> getSortedEmployees() {
        List<Employee> emp = service.fetchAll();
        System.out.println(emp);
        return service.fetchAll();
    }

    @PostMapping("addEmployees")
    public String addEmployee(
            @RequestParam("empId") int id,
            @RequestParam("empname") String name,
            @RequestParam("empage") int age,
            @RequestParam("emprole") String role,
            @RequestParam("empsalary") int salary) {

        Employee emp = new Employee(age, id, name, role, salary);
        String msg = service.AddEmployee(emp);
        return msg;
    }

    @GetMapping("/sortedEmployees/{id}")
    public List<Employee> fetchById(@PathVariable int id) {
        return service.fetchById(id);
    }

}
