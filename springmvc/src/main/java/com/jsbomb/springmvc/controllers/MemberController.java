package com.jsbomb.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsbomb.springmvc.model.MemberModel;
import com.jsbomb.springmvc.model.MemberValidator;

@Controller
@RequestMapping(value="/board")
public class MemberController {

	@RequestMapping(value={"/view"}, method = RequestMethod.GET)
	public String boardView() {
		
		return "board/view";
	}
	
	@RequestMapping(value="/content", method = RequestMethod.GET)
	public String boardContent(Model model) {
		
		model.addAttribute("content", "this is the content");
		
		return "board/content";
	}
	
	@RequestMapping(value="/reply", method = RequestMethod.GET)
	public String boardReply(Model model) {
		
		return "board/reply";
	}
	
	@RequestMapping(value="/getUserInfo", method = RequestMethod.GET)
	public String getUserInfo(HttpServletRequest servletReq, Model model) {
		
		String id = servletReq.getParameter("id");
		String password = servletReq.getParameter("password");
		
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		
		
		return "board/getUserInfo";
	}
	
	@RequestMapping(value="/getUserInfo2", method = RequestMethod.GET)
	public String getUserInfo2(@RequestParam("id") String id,
			@RequestParam("password") String password, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("password", password);
		
		return "board/getUserInfo";
	}
	
	@RequestMapping(value="/inputInfo", method=RequestMethod.GET)
	public String inputInfo() {
		return "board/inputInfo";
	}
	
	@RequestMapping(value="/detailedUser", method = RequestMethod.GET)
	public String getUserInfo3(@ModelAttribute(value="member") MemberModel memberModel) {
		System.out.println("getUserInfo3 called ReqMethod.GET");

		return "board/detailedUser";
	}
	
	@RequestMapping(value="/detailedUser", method = RequestMethod.POST)
	public String getDetailedUser(@ModelAttribute("member") MemberModel memberModel,
			BindingResult result) {
		System.out.println("getDetailedUser called ReqMethod.POST");

		
		MemberValidator validator = new MemberValidator();
		validator.validate(memberModel, result);
		
		if (result.hasErrors()) {
			System.out.println("getDetailedUser called but there's error");
			return "redirect:inputInfo";
		}
		
		return "board/detailedUser";
	}
	
	@RequestMapping(value="/detailedUser2", method = RequestMethod.POST)
	public String getDetailedUser2(@ModelAttribute("member") @Valid MemberModel memberModel,
			BindingResult result) {
		System.out.println("getDetailedUser2 called ReqMethod.POST");
		
		if (result.hasErrors()) {
			System.out.println("getDetailedUser2 called but there's error");
			return "redirect:inputInfo";
		}
		
		return "board/detailedUser";
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new MemberValidator());
		
	}
}
