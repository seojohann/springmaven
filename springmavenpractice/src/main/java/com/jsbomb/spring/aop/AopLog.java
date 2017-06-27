package com.jsbomb.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopLog {

	@Pointcut("within(com.jsbomb.spring.aop.*)")
	public void pointCutMethod() {
		
	}
	
	@Around("pointCutMethod()")
	public Object printLog(ProceedingJoinPoint point) throws Throwable {
		String signature = point.getSignature().toShortString();
		long time = System.currentTimeMillis();
		System.out.println(signature + " start at " + time);
		
		try {
			Object obj = point.proceed();
			return obj;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			long end = System.currentTimeMillis();
			System.out.println(signature + " end at " + end + " took " + (end - time)); 
		}
	}
	
	@Before("within(com.jsbomb.spring.aop.*)")
	public void beforeAdvice() {
		System.out.println("before advice");
	}
}
