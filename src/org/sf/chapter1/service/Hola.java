package org.sf.chapter1.service;

import org.springframework.stereotype.Service;

@Service
public class Hola implements GreetingMessageService {

	
	public String greetUser() {
		// TODO Auto-generated method stub
		return "Desde hola";
	}

}
