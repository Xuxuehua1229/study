package com.ts.spring.bears;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
       helloWorld.hello();
	}

}
