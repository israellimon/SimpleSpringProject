package org.sf.chapter1.main;

import org.sf.chapter1.service.GreetingMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		GreetingMessageService greetingMessageService;
		
		greetingMessageService = context.getBean("greetingMessageServiceImpl",GreetingMessageService.class);
		System.out.println(greetingMessageService.greetUser());
		
		greetingMessageService = context.getBean("hola",GreetingMessageService.class);
		System.out.println(greetingMessageService.greetUser());
		
		
		
	}

}
