package com.jsbomb.spittr.web.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsbomb.spittr.web.data.Spitter;
import com.jsbomb.spittr.web.data.SpitterRepository;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	private SpitterRepository spitterRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	public SpitterController() {
	}
	
//	@Autowired
//	public SpitterController(SpitterRepository repository) {
//		this.spitterRepository = repository;
//	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegisterationForm(Model model) {
		model.addAttribute("spitter", new Spitter());
		return "registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String processRegistration(
			@Valid Spitter spitter, Errors errors) {
		
		if (errors.hasErrors()) {
			return "registerForm";
		}
		
		logger.info("spitter before save = " + spitter.getUsername());
//		spitterRepository.save(spitter);
		
		logger.info("spitter saved = " + spitter.getUsername());
		return "redirect:/spitter/" + spitter.getUsername();
	}
	
	@RequestMapping(value="/{username}", method=RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String username,
			Model model) {
		Spitter spitter = spitterRepository.findByUserName(username);
		model.addAttribute(spitter);
		return "profile";
	}
}
