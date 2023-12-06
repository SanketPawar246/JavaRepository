package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// create IOC container
//		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext(
//				"src/main/java/com/nt/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		// get target spring bean class obj
		Object obj = ctx.getBean("wmg");
		// type casting with sub class
		WishMessageGenerator generator = (WishMessageGenerator) obj;

		// invoke the b.method
		String resultMsg = generator.generateMessage("raja");
		System.out.println("Result Message is :: " + resultMsg);

		// close the container

	}

}
