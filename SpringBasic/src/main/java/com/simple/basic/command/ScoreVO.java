package com.simple.basic.command;

public class ScoreVO {
	
	private String name;
	private String kor; //공백 문제가 생길수 있기 때문에 int말고 string으로 써주기
	private String eng;
	private String math;
	
	public ScoreVO() {
		
	}

	public ScoreVO(String name, String kor, String eng, String math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}
	
	
	
	
}
