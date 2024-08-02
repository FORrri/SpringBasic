package com.simple.basic.service.score.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.basic.command.ScoreVO;

@Repository("y") //구현체에다가 레파지토리 적어주기 //반드시 component-scan에 의하여 읽혀야함
public class ScoreDAOImpl implements ScoreDAO {
	
	
	//DB로 가정
	ArrayList<ScoreVO> list = new ArrayList<>();
	

	@Override
	public void regist(ScoreVO vo) {
		System.out.println("repository layer:" + vo);
		//DB처리.....
		list.add(vo); //insert완료
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
		return list;
	}
	
	



}
