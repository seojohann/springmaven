package com.jsbomb.spittr;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import com.jsbomb.spittr.web.controller.SpittController;
import com.jsbomb.spittr.web.data.Spitt;
import com.jsbomb.spittr.web.data.SpittRepository;

public class SpittControllerTest {

	
	@Test
	public void showRecentSpittsTest() throws Exception {
		List<Spitt> expectedSpitts = createSpittList(20);
		SpittRepository mockRepository = Mockito.mock(SpittRepository.class);
		Mockito.when(mockRepository.findSpitts(Long.MAX_VALUE, 20))
			.thenReturn(expectedSpitts);
		
		SpittController controller =
				new SpittController(mockRepository);
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(
						new InternalResourceView(
								"/WEB-INF/views/spitts.jsp"))
				.build();
		
		mockMvc.perform(get("/spitts"))
			.andExpect(view().name("spitts"))
			.andExpect(model().attributeExists("spittList"))
			.andExpect(model().attribute("spittList",
					Matchers.hasItems(expectedSpitts.toArray())));
	}
	
	@Test
	public void showPagedSpittsTest() throws Exception {
		List<Spitt> expectedSpitts = createSpittList(50);
		SpittRepository mockRepository = Mockito.mock(SpittRepository.class);
		Mockito.when(mockRepository.findSpitts(238900, 50))
			.thenReturn(expectedSpitts);
		
		SpittController controller =
				new SpittController(mockRepository);
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
				.setSingleView(
						new InternalResourceView(
								"/WEB-INF/views/spitts.jsp"))
				.build();
		
		mockMvc.perform(get("/spitts?max=238900&count=50"))
			.andExpect(view().name("spitts"))
			.andExpect(model().attributeExists("spittList"))
			.andExpect(model().attribute("spittList",
					Matchers.hasItems(expectedSpitts.toArray())));
	}
	
	@Test
	public void spittTest() throws Exception {
		Spitt expectedSpitt = new Spitt("Hello", new Date());
		SpittRepository mockRepository = Mockito.mock(SpittRepository.class);
		Mockito.when(mockRepository.findSpitt(12345)).thenReturn(expectedSpitt);
		
		SpittController controller = new SpittController(mockRepository);
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		mockMvc.perform(get("/spitts/12345"))
			.andExpect(view().name("spitt"))
			.andExpect(model().attributeExists("spitt"))
			.andExpect(model().attribute("spitt", expectedSpitt));
	}
	
	private List<Spitt> createSpittList(int count) {
		List<Spitt> spitts = new ArrayList<Spitt>();
		
		for (int ind = 0; ind < count; ind++) {
			spitts.add(new Spitt("Spitt " + ind, new Date()));
		}
		
		return spitts;
	}
}
