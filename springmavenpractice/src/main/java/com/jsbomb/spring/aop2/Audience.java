package com.jsbomb.spring.aop2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

	@Pointcut("execution(* com.jsbomb.spring.aop2.Performance.perform())")
	public void performance() { }
	
	@Before("performance()")
	public void silencePhone() {
		System.out.println("silencing phones");
	}
	
	@Before("performance()")
	public void takeSeat() {
		System.out.println("taking seat");
	}
	
	@AfterReturning("performance()")
	public void appluase() {
		System.out.print("clap clap clap");
	}
}
