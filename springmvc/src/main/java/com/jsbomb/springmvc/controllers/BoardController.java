package com.jsbomb.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsbomb.springmvc.model.MemberModel;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	@RequestMapping(value={"/view"}, method = RequestMethod.GET)
	public String boardView() {
		
		return "view";
	}
	
	@RequestMapping(value="/content")
	public String boardContent(Model model) {
		
		model.addAttribute("content", "this is the content");
		
		return "content";
	}
	
	@RequestMapping(value="/reply")
	public String boardReply(Model model) {
		
		return "reply";
	}
	
	@RequestMapping(value="/getUserInfo")
	public String getUserInfo(HttpServletRequest servletReq, Model model) {
		
		String id = servletReq.getParameter("id");
		String password = servletReq.getParameter("password");
		
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		
		
		return "getUserInfo";
	}
	
	@RequestMapping(value="/getUserInfo2")
	public String getUserInfo2(@RequestParam("id") String id,
			@RequestParam("password") String password, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		
		return "getUserInfo";
	}
	
	@RequestMapping("/detailedUser")
	public String getUserInfo3(MemberModel memberModel) {
		
		return "detailedUser";
	}
}
