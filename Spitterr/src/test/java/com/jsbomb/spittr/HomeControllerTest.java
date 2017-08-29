package com.jsbomb.spittr;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.jsbomb.spittr.web.controller.HomeController;

public class HomeControllerTest {

	HomeController controller;
	MockMvc mockMvc;
	
	@Before
	public void beforeHomeTest() {
		controller = new HomeController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void testHome() throws Exception {
		mockMvc.perform(get("/home")).andExpect(view().name("home"));
	}
	
	@Test
	public void testHomePage() throws Exception {
		
		mockMvc.perform(get("/homepage")).andExpect(view().name("home"));
		
	}
	
	@Test
	public void testDefault() throws Exception {

		mockMvc.perform(get("/")).andExpect(view().name("home"));
		
	}
}
