package com.java.Employe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.Employe.entity.Employee;
import com.java.Employe.service.EmployeManagment;

@SpringBootApplication
public class EmployeeManagementsApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext ctx=SpringApplication.run( EmployeeManagementsApplication.class, args);
		
		EmployeManagment employeManagment=ctx.getBean("employeManagment", EmployeManagment.class);
		
		Employee employee= new Employee("hari", "hari@gmail.com", "hyd");
		
		Employee employee1= new Employee("sowji", "sowji@gmail.com", "mumbai");
		Employee employee2= new Employee("Usha", "usha@gmail.com", "hyd");
		
		employeManagment.Create(employee);
		employeManagment.Create(employee1);
		employeManagment.Create(employee2);
		
	}
	
}
