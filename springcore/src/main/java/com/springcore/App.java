package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext x =  new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) x.getBean("student1");
        System.out.println(student1);
        Student student2 = (Student) x.getBean("student2");
        System.out.println(student2);
        
    }
}
