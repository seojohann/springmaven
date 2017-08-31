package com.jsbomb.spittr;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.jsbomb.spittr.web.controller.SpitterController;
import com.jsbomb.spittr.web.data.Spitter;
import com.jsbomb.spittr.web.data.SpitterRepository;

public class SpitterControllerTest {

	@Test
	public void showRegistrationTest() throws Exception {
		SpitterRepository mockRepository =
				Mockito.mock(SpitterRepository.class);
		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		mockMvc.perform(get("/spitter/register"))
			.andExpect(view().name("registerForm"));
	}
	
	@Test
	public void processRegistrationTest() throws Exception {
		SpitterRepository mockRepository =
				Mockito.mock(SpitterRepository.class);
		
		Spitter unsaved = 
				new Spitter("jbauer", "24hours", "Jack", "Bauer",
						"jbauer@24hours.com");
		Spitter saved = 
				new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer",
						"jbauer@24hours.com");
		
		when(mockRepository.save(unsaved)).thenReturn(saved);
		
		SpitterController controller = new SpitterController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		mockMvc.perform(post("/spitter/register")
			.param("firstName", "Jack")
			.param("lastName", "Bauer")
			.param("username", "jbauer")
			.param("password", "24hours")
			.param("email", "jbauer@24hours.com"))
			.andExpect(redirectedUrl("/spitter/jbauer"));
		
		verify(mockRepository, atLeastOnce()).save(unsaved);
	}
}
