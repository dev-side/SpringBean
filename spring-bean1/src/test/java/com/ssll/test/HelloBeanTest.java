package com.ssll.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssll.spring.bean.HelloSpring;

public class HelloBeanTest {
	
	private static ConfigurableApplicationContext framework;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		framework=new ClassPathXmlApplicationContext("application.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		framework.close();
	}
//	@Before
//	public void setUp()throws Exception{
//		bean=framework.getBean("hello", HelloSpring.class);
//	}
	@Test
	public void test() {
		HelloSpring	bean2=framework.getBean("bean4", HelloSpring.class);
		HelloSpring	bean3=framework.getBean("bean3", HelloSpring.class);
		
		assertEquals(bean2.getName(), bean3.getName());
		
		HelloSpring bean1=framework.getBean("bean1",HelloSpring.class);
		assertEquals("Thidar", ");
	}

}
