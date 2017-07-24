package com.jsbomb.springmvc.board.commands;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.jsbomb.springmvc.board.data.BoardDao;
import com.jsbomb.springmvc.board.data.BoardDto;

public class ContentCommand implements IBoardCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map <String, Object> modelMap = model.asMap();
		HttpServletRequest request = (HttpServletRequest)modelMap.get("request");
		String boardId = request.getParameter("boardId");
		
		BoardDao boardDao = new BoardDao();
//		BoardDto boardDto = dao.getContentView();
		
	}

}
