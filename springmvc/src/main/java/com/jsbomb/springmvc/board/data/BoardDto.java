package com.jsbomb.springmvc.board.data;

import java.sql.Timestamp;

public class BoardDto {

	
	int boardId;
	String name;
	String title;
	Timestamp date;
	int hit;
	int group;
	int step;
	int indent;
	
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardDto(int boardId, String name, String title, Timestamp date,
			int hit, int group, int step, int indent) {
		this.boardId = boardId;
		this.name = name;
		this.title = title;
		this.date = date;
		this.hit = hit;
		this.group = group;
		this.step = step;
		this.indent = indent;
	}



	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}


	
	
}
