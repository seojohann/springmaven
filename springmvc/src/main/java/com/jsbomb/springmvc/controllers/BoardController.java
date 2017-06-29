package com.jsbomb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board/*")
public class BoardController {

	@RequestMapping(value={"/board", "/board/view"}, method = RequestMethod.GET)
	public String boardView() {
		
		return "view";
	}
	
	@RequestMapping(value="/board/content")
	public String boardContent(Model model) {
		
		model.addAttribute("content", "this is the content");
		
		return "content";
	}
	
	@RequestMapping(value="/board/reply")
	public String boardReply(Model model) {
		
		return "reply";
	}
}
