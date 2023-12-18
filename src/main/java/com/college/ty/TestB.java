package com.college.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=new 
				ClassPathXmlApplicationContext("my_conf2.xml");
		
		Teacher teacher = (Teacher) configurableApplicationContext.getBean("myTeacher");
		teacher.read();
		Student student = (Student) configurableApplicationContext.getBean("myStudent");
		student.run();
	}

}
