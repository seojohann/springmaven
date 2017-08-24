package com.jsbomb.spring.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jsbomb.spring.aop3.Audience;
import com.jsbomb.spring.aop3.Encoreable;
import com.jsbomb.spring.aop3.Performer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.jsbomb.spring.aop3.ConcertConfig.class)
public class ConcertTest {

	
	@Autowired
	Performer performer;
	
	@Autowired
	Encoreable encoreable;
	
	@Test
	public void testPerformance() {
		
		performer.perform();
		
		
//		encoreable.performEncore();
	}

}
