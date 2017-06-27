package com.jsbomb.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopLog {

	public AopLog() {}
	
	@Pointcut("execution(* com.jsbomb.spring.aop.Person.getInfo())")
	public void pointCutMethod() {
		
	}
	
	@Around("pointCutMethod()")
	public void printLog(ProceedingJoinPoint point) throws Throwable {
		String signature = point.getSignature().toShortString();
		long time = System.currentTimeMillis();
		System.out.println(signature + " start at " + time);
		
		try {
			point.proceed();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			long end = System.currentTimeMillis();
			System.out.println(signature + " end at " + end + " took " + (end - time)); 
		}
	}
	
	@Before("pointCutMethod()")
	public void beforeAdvice() {
		System.out.println("before advice");
	}
}
