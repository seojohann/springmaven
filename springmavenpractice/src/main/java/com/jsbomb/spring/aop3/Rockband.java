package com.jsbomb.spring.aop3;

import org.springframework.stereotype.Component;

@Component
public class Rockband implements Performer {

	@Override
	public void perform() {

		System.out.println("Rockband performs!!");
	}

}
