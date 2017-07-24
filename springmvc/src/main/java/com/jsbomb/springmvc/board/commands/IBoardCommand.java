package com.jsbomb.springmvc.board.commands;

import org.springframework.ui.Model;

public interface IBoardCommand {

	public void execute(Model model);
}
