package com.jsbomb.spring.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan(basePackages="com.jsbomb.spring.admin")
public class Main {

	@Autowired
	private AdminProp adminProp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext appContext =
//				new AnnotationConfigApplicationContext();
				new AnnotationConfigApplicationContext(Main.class,
//						AdminConfig.class);
						AdminPropDev.class, AdminPropRel.class);
		appContext.getEnvironment().setActiveProfiles("rel");
//		appContext.register(Main.class, AdminConfig.class, AdminPropDev.class, AdminPropRel.class);
//		appContext.refresh();
		
		Main main = appContext.getBean(Main.class);
		main.run();
		
		appContext.close();
	}

	private void run() {
		System.out.println("admin Id = " + adminProp.getAdminId());
		System.out.println("admin pw = " + adminProp.getAdminPw());
		System.out.println(" ip = " + adminProp.getIp());
		System.out.println(" port = " + adminProp.getPort());
	}
}
