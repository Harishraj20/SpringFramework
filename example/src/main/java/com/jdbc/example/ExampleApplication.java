package com.jdbc.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jdbc.example.BeanClass.customers;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);

		JDBCImplementation cd = context.getBean(JDBCImplementation.class);

		for (customers cm1 : cd.fetchCustomers()) {
		System.out.println(cm1);
		}

		customers cm = cd.getCustomersByMobileNumber(966876677L);
		System.out.println(cm);

		for (customers cm2 : cd.fetchByLocation("chennai")) {
			System.out.println(cm2.getName());
		}
		// customers cm1 = new customers("madurai", 27, 987654321, "Nirmal");

		// cd.addCustomers(cm1);

	}

}
