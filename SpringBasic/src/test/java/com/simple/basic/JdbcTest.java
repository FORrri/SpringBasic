package com.simple.basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.test.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) //junit을 스프링 테스트 코드로 실행시킴
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //내가 동작시킬 스프링 설정파일의 절대경로(root-context.xml)
public class JdbcTest {
	
	//DB연결
	@Autowired
	DataSource ds; //root-context.xml에 선언되어 있는 디비정보를 담은 객체
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	TestMapper testMapper; // TestMapper - 인터페이스라서 bean 생성 불가
	
//	@Test //test코드로 동작 - DataSource 사용

	public void testCode01( ) {
		
		try {
			
			Connection conn = ds.getConnection();
			PreparedStatement pstmt = 
			conn.prepareStatement("select sysdate as time from dual");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String time = rs.getString("time");
				System.out.println(time);
			}
			
			conn.close();
			pstmt.close();
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		//System.out.println("hello world!");
	}

//	@Test //sqlSessionFactory 사용
	public void testCode02() {
		System.out.println(sqlSessionFactory);
	}
	
	@Test
	public void testCode03() {
		String time = testMapper.getTime(); //추상메서드
		System.out.println(time);
	}
	
}