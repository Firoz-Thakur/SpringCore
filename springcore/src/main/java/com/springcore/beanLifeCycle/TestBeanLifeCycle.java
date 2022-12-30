package com.springcore.beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifeCycle/lifeCycleConfig.xml");
		Example ex = (Example) context.getBean("example");
		System.out.println(ex);
		
	}

}
