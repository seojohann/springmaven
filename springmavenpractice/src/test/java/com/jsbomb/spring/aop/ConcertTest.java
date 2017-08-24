package com.jsbomb.spring.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jsbomb.spring.aop3.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=com.jsbomb.spring.aop3.ConcertConfig.class)
public class ConcertTest {

	
	@Autowired
	Performance performance;
	
	@Test
	public void testPerformance() {
		
		performance.perform();
	}

}
