package com.simple.basic.service.score.impl;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.basic.command.ScoreVO;

@Repository("y") //구현체에다가 레파지토리 적어주기 
				 //반드시 component-scan에 의하여 읽혀야함
public class ScoreDAOImpl implements ScoreDAO {
	
	
	//DB로 가정
	//ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Autowired
	DataSource ds;
	
	@Override
	public void regist(ScoreVO vo) {
		System.out.println("repository layer:" + vo);
		//insert작업...
		//list.add(vo); //insert완료
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
		//select작업...
		return null;
	}
	
	@Override
	public void delete(int sno) {
		//remove 작업....
		//list.remove(sno); //인덱스번호로 삭제
	}
}
