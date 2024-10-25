package com.example.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringjdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);

		JDBCImplementations imps = context.getBean(JDBCImplementations.class);

		// List<Employee> list = imps.fetchByExperience(14);

		// for (Employee emp : list) {
		// 	System.out.println(emp);
		// }


		boolean result = imps.deleteEmloyee(11);

		if(result){
			System.out.println("Deleted SuccessFully!");
		}else{
			System.out.println("Couldn't Perform delete Operation!!");
		}
	}

}
