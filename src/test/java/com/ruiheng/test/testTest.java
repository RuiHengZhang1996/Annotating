package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.collectiontype.Course;
import com.ruiheng.spring5.collectiontype.Stu;
import com.ruiheng.spring5.factorybean.MyBean;

public class testTest {
	
	/*
	 * @Test public void testCollection() { ApplicationContext context = new
	 * ClassPathXmlApplicationContext("bean1.xml");
	 * 
	 * Stu stu = context.getBean("stu", Stu.class);
	 * 
	 * System.out.println(stu); stu.test(); }
	 */
	
	@Test
	public void testCollection1() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean2.xml");
		
		Course course = context.getBean("myBean", Course.class);
		
		System.out.println(course);
		
	}
}
