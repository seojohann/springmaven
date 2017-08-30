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

	}
	
	@Test
	public void testMain() throws Exception {
		controller = new HomeController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/main")).andExpect(view().name("home"));
	}
	
	@Test
	public void testHomePage() throws Exception {
		controller = new HomeController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/homepage")).andExpect(view().name("home"));
		
	}
	
	@Test
	public void testDefault() throws Exception {
		controller = new HomeController();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
		
	}
}
