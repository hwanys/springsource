package com.study.mapper;

import org.apache.ibatis.annotations.Insert;

public interface SampleMapper1 {
	//간단한 sql구문이라 xml사용 안하기러~!!
	
	@Insert("insert into tbl_sample1(col1) values(#{data})")
	public int insertCol1(String data);
}
