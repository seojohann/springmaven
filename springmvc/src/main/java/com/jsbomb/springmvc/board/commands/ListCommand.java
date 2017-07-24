package com.jsbomb.springmvc.board.commands;

import java.util.List;

import org.springframework.ui.Model;

import com.jsbomb.springmvc.board.data.BoardDao;
import com.jsbomb.springmvc.board.data.BoardDto;

public class ListCommand implements IBoardCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		BoardDao boardDao = new BoardDao();
		List<BoardDto> dtoList = boardDao.list();
		
		model.addAttribute("list", dtoList);
	}

}
