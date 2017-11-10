package com.deepak.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deepak.spring.model.Employee;

/**
 * @author Deepak
 *
 */
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		emp.setEmpId(1001);
		emp.setFirstName("Deepak");
		emp.setLastName("Mishra");
		emp.setEmail("deepakmishra6844@gmail.com");
		emp.setAge(26);
		emp.setSalary(20000);
		emp.setAddress("Lucknow");
		System.out.println("ID: " + emp.getEmpId());
		System.out.println("First Name: " + emp.getFirstName());
		System.out.println("Email: " + emp.getEmail());
		System.out.println("Age: " + emp.getAge());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Address: " + emp.getAddress());
		emp.throwException();
	}

}
