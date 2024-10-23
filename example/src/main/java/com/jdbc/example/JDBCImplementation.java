package com.jdbc.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.example.BeanClass.customers;

@Repository
public class JDBCImplementation implements CustomerDao {
    public JDBCImplementation(JdbcTemplate jdbctemplate) {
        this.jdbctemplate = jdbctemplate;
    }

    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    public JdbcTemplate getJdbctemplate() {
        return jdbctemplate;
    }

    private final String sqlQuery = "SELECT * FROM customers";

    private final String sqlQueryByNum = "SELECT * FROM customers WHERE mobilenumber = ?";

    private final String Sqlbylocation = "SELECT * FROM customers WHERE location = ?";

    private final String insertQuery = "INSERT INTO customers (name, age, mobilenumber, location) VALUES (?, ?, ?, ?)";

    @Override
    public List<customers> fetchCustomers() {
        return jdbctemplate.query(sqlQuery, new CustomersMapper());
    }

    @Override
    public customers getCustomersByMobileNumber(Long mobilenum) {
        return jdbctemplate.queryForObject(sqlQueryByNum, new CustomersMapper(), mobilenum);
    }

    @Override
    public List<customers> fetchByLocation(String location) {
        return jdbctemplate.query(Sqlbylocation, new CustomersMapper(), location);
    }

    @Override
    public boolean addCustomers(customers customer) {
        int rowsAffected = jdbctemplate.update(insertQuery, customer.getName(), customer.getAge(),
                customer.getMobileNumber(), customer.getLocation());
        return rowsAffected > 0;
    }
}
