package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
    Student student= (Student) context.getBean("student"); 	
    System.out.println(student.getStudentName());
    System.out.println(student.getCity());
    System.out.println(student.getZ());
    System.out.println(student.getStringName());
    System.out.println(student.getAddress());
    System.out.println(student.getAddress().getClass().getName());
    System.out.println(student);
	}
}
