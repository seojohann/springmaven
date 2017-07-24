package com.jsbomb.springmvc.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jsbomb.springmvc.board.commands.ContentCommand;
import com.jsbomb.springmvc.board.commands.DeleteCommand;
import com.jsbomb.springmvc.board.commands.IBoardCommand;
import com.jsbomb.springmvc.board.commands.ListCommand;
import com.jsbomb.springmvc.board.commands.ModifyCommand;
import com.jsbomb.springmvc.board.commands.ReplyCommand;
import com.jsbomb.springmvc.board.commands.ReplyViewCommand;
import com.jsbomb.springmvc.board.commands.WriteCommand;

@Controller
public class BoardController {

	IBoardCommand command;
	
	@RequestMapping(value="/list")
	public String displayList(Model model) {
		
		command = new ListCommand();
		command.execute(model);
		
		return "mvcBoard/list";
	}
	
	@RequestMapping(value="/write_view")
	public String displayWriteView(Model model) {
		
		return "mvcBoard/writeview";
	}
	
	@RequestMapping(value="/write")
	public String write(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new WriteCommand();
		command.execute(model);
		
		return "redirect:mvcBoard/list";
	}
	
	@RequestMapping(value="/view")
	public String contentView(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new ContentCommand();
		command.execute(model);
		
		return "mvcBoard/view";
		
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new ModifyCommand();
		command.execute(model);
		
		return "redirect:mvcBoard/list";
	}
	
	@RequestMapping(value="/reply_view")
	public String replyView(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new ReplyViewCommand();
		command.execute(model);
		
		return "mvcBoard/replyView";
	}
	
	@RequestMapping(value="/reply")
	public String reply(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new ReplyCommand();
		command.execute(model);
		
		return "redirect:mvcBoard/list";
	}
	
	@RequestMapping(value="/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		command = new DeleteCommand();
		command.execute(model);
		
		return "redirect:mvcBoard/delete";
	}
}
