package com.simple.basic.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper //왠만하면 달아주기(mapper라는 뜻)
public interface TestMapper {
	
	public String getTime();

}