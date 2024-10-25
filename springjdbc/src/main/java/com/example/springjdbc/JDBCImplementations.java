package com.example.springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JDBCImplementations implements EmployeeDAO {

    @Autowired
    JdbcTemplate template;
    private final String query1 = "SELECT * FROM employee WHERE emp_role = ?";
    private final String query2 = "SELECT * FROM employee WHERE emp_experience = ?";
    private final String query3 = "SELECT * FROM employee";
    private final String query4 = "SELECT * FROM employee WHERE employee_Id = ?";
    private final String query5 = "UPDATE employee SET employee_name = ?, emp_experience = ?, emp_role = ?, emp_salary = ? WHERE id = ?";
    private final String deletequery = "DELETE FROM employee WHERE employee_Id = ?";

    @Override
    public List<Employee> fetchByRole(String role) {

        return template.query(query1, new EmployeeMapper(), role);
    }

    @Override
    public List<Employee> fetchByExperience(int Experience) {

        return template.query(query2, new EmployeeMapper(), Experience);

    }

    @Override
    public Employee fetchById(int id) {

        return template.queryForObject(query4, new EmployeeMapper(), id);

    }

    @Override
    public List<Employee> fetchAll() {

        return template.query(query3, new EmployeeMapper());

    }

    @Override
    public boolean updateEmployee(Employee emp) {
        int rowsAffected = template.update(query5, emp.getName(), emp.getExperience(), emp.getRole(), emp.getSalary(),
                emp.getId());

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteEmloyee(int id) {

        int rowsAffected = template.update(deletequery, id);
        System.out.println(rowsAffected);
        return rowsAffected > 0;
    }

}
