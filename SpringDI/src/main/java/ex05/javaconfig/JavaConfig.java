package ex05.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.constructor.Chef;
import ex02.constructor.Hotel;
import ex02.setter.MemberDAO;
import ex02.setter.MyDataSource;

@Configuration //자바 설정파일로 쓸 클래스
public class JavaConfig {
	
	//<bean id="test" class="ex01.SpringTest" scope="prototype"/>
	
	@Bean
	public SpringTest test() {
		return new SpringTest();
	} //위에꺼랑 완전 똑같은 문장임
	
	//<bean id="chef" class="ex02.constructor.Chef"/>
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	//<bean id="hotel" class="ex02.constructor.Hotel">
	//<constructor-arg ref="chef"/>
	//</bean> 생성자 주입
	
	@Bean
	public Hotel hotel() {
		return new Hotel( chef() );
	}

	//	<bean id="ds" class="ex02.setter.MyDataSource">
	//	<property name="url" value="jbbc:orcle:thin:@localhost~~"/>
	//	<property name="uid" value="jspID"/>
	//	<property name="upw" value="jspPW"/>
	//	</bean> setter 주입
	
	@Bean
	public MyDataSource ds() {
		MyDataSource ds = new MyDataSource();
		ds.setUrl("jbbc:orcle:thin:@localhost~~");
		ds.setUid("jpsID");
		ds.setUpw("jpsPW");
		return ds;
	}
	
	//<bean id="memberDAO" class="ex02.setter.MemberDAO">
	//<property name="myDataSource" ref="ds"/>
	//</bean>
	
	@Bean
	public MemberDAO memberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setMyDataSource(ds());
		return dao;
	}
	
	
	

}