package com.example.springjdbc;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> fetchByRole(String role);
    public List<Employee> fetchByExperience(int Experience);
    public Employee fetchById(int id);
    public List<Employee> fetchAll();
    public boolean updateEmployee(Employee emp);
    public boolean deleteEmloyee(int id);
}
