package com.simple.basic.service.score;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.basic.command.ScoreVO;
import com.simple.basic.service.score.impl.ScoreDAO;

@Service("x") //구현체에다가 서비스 적어주기 //반드시 component-scan에 의하여 읽혀야함
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	@Qualifier("y")
	ScoreDAO scoreDAO;

	@Override
	public void regist(ScoreVO vo) {
		//System.out.println("service layer:" + vo);
		//DAO계층으로....
		scoreDAO.regist(vo);
		
	}
	
	@Override
	public ArrayList<ScoreVO> getScore() {
		return scoreDAO.getScore();
	}
	

	
	
}