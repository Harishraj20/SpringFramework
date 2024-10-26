package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Employee;
import com.example.Repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> fetchEmployee(){
        
        return repo.findAll();
    }

    public List<Employee> fetchSortedEmployee(){
        return repo.findAllEmployeesSortedByAge();
    }
    public List<Employee> fetchAll(){
        return repo.findAll();
    }

    public String AddEmployee(Employee emp){
        System.out.println("Into Add Employee Method");
        try{
            repo.save(emp);
            System.out.println("Added Successfully");
            return "Added Successfully";

        }catch(Exception e){
            System.out.println(e);
            return "Error occured";

        }

    }

    public void deleteEmployeeById(int id) {
        repo.deleteById(id);
    }
}
