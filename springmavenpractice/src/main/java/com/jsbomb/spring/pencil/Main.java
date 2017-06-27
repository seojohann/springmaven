package com.jsbomb.spring.pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configXml = "classpath:META-INF/pencilconfig.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configXml);
		
		Pencil pencil = context.getBean("pencil2b", Pencil.class);
		pencil.write();
		
		pencil = context.getBean("pencil4b", Pencil.class);
		pencil.write();
		
		pencil = (Pencil)context.getBean("pencil4bwitheraser");
		pencil.write();
		
	}

}
