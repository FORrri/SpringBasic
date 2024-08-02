package com.simple.basic.command;

public class BirthdayVO {

	private String year;
	private String day;
	private String msg;
	
	public BirthdayVO() {
		
	}

	@Override
	public String toString() {
		return "BirthdayVO [year=" + year + ", day=" + day + ", msg=" + msg + "]";
	}

	public BirthdayVO(String year, String day, String msg) {
		super();
		this.year = year;
		this.day = day;
		this.msg = msg;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
