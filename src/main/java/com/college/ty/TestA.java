package com.college.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=new 
				ClassPathXmlApplicationContext("my_conf1.xml");
		Student student = (Student) configurableApplicationContext.getBean("myStudent");
		student.run();
		
		Teacher teacher = (Teacher) configurableApplicationContext.getBean("myStudent");
		teacher.read();
	}

}
