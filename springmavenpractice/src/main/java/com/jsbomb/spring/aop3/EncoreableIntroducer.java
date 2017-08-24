package com.jsbomb.spring.aop3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

	@DeclareParents(value="com.jsbomb.spring.aop3.Performer+",
			defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
