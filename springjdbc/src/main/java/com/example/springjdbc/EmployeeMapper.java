package com.example.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {


    @SuppressWarnings("null")
	@Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

        int id = Integer.parseInt(rs.getString("employee_Id"));
        String name = rs.getString("employee_name");
        int experience = Integer.parseInt(rs.getString("emp_experience"));
        String role = rs.getString("emp_role");
        int salary = Integer.parseInt(rs.getString("emp_salary"));

        Employee emp = new Employee(id, name, experience, role, salary);

        return emp;
    }

}
