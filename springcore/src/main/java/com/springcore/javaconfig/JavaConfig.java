package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

// now we can also remove the @componentScan we were using this to scan the package
// and whereever it found component it will create the object of that class
// but now we are not following @component way to  create the object so we can remove this too.
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	@Bean // this object will go to ioc container in the form of bean and we may ask for this object
	// in our main class as a get bean
	//now the object name will be our method name 
	public Student getStudent()
	{
		
		Student student = new Student(getSmosa());
		return student;
	}
	
	@Bean
	public Smosa getSmosa()
	{
		return new Smosa();
	}
	
}
