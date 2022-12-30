package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

// @Component removing this for the use of bean annotaion

public class Student {

	
	private Smosa smosa;
	
	public Student(Smosa smosa) {
		super();
		this.smosa = smosa;
	}

	public void study()
	{
		this.smosa.display();
		System.out.println("student is reading");
	}
}
