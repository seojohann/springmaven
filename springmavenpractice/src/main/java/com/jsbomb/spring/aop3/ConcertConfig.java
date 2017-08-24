package com.jsbomb.spring.aop3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class ConcertConfig {

	@Bean
	public Audience getAudience() {
		return new Audience();
	}
	
	
}
