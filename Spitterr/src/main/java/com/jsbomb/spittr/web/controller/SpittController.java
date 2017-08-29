package com.jsbomb.spittr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsbomb.spittr.web.data.Spitt;
import com.jsbomb.spittr.web.data.SpittRepository;

@Controller
@RequestMapping("/spitts")
public class SpittController {

	private static final String MAX_LONG_AS_STRING = "9223372036854775807";
//			Long.toString(Long.MAX_VALUE);
	
	private SpittRepository spittRepository;
	
	@Autowired
	public SpittController(SpittRepository repository) {
		this.spittRepository = repository;
	}
	
//	@RequestMapping(method=RequestMethod.GET)
//	public String spitts(Model model) {
//		model.addAttribute(spittRepository.findSpitts(Long.MAX_VALUE, 20));
//		
//		return "spitts";
//	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Spitt> spitts(
			@RequestParam(value="max",
				defaultValue=MAX_LONG_AS_STRING) long max,
			@RequestParam(value="count", defaultValue="20") int count) {
		
		return spittRepository.findSpitts(max, count);
	}
	
	@RequestMapping(value="/{spittId}", method=RequestMethod.GET)
	public String showSpitt(
			@RequestParam("spitt_id") long spittId, Model model) {
		model.addAttribute(spittRepository.findSpitt(spittId));
		return "spitt";
	}
}