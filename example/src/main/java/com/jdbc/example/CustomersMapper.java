package com.jdbc.example;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jdbc.example.BeanClass.customers;

public class CustomersMapper implements RowMapper<customers>{

    @Override
    public customers mapRow(ResultSet rs, int arg1) throws SQLException {

        String name = rs.getString("name");
        int age = rs.getInt("age");
        long mobilenumber = rs.getLong("mobilenumber");
        String location = rs.getString("location");

        customers cm = new customers(location, age, mobilenumber, name);

        return cm;
    }

}
