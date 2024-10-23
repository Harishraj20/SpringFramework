package com.jdbc.example;

import java.util.List;

import com.jdbc.example.BeanClass.customers;

public interface CustomerDao {

    public List<customers> fetchCustomers();

    public customers getCustomersByMobileNumber(Long mobilenum);

    public List <customers> fetchByLocation(String location);

    public boolean addCustomers(customers customer);

}
