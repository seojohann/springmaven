package com.jsbomb.spring.aop3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(* com.jsbomb.spring.aop3.Performer.perform())")
	public void performance() { }
	
	@Before("performance()")
	public void beforePerformance() {
		System.out.println("taking a seat");
		System.out.println("silences phone");
	}
	
	@After("performance()")
	public void afterPerformance() {
		System.out.println("applaudes");
	}
	
	@After("performance()")
	public void shoutsEncore() {
		System.out.println("audience shouts encore!!");
	}
}
