package com.study.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.study.dto.PersonDTO;

public interface PersonMapper {
	
	// #{id},#{name} -> ? 변경 되는 부분(#으로 무조건 들어오고)
	// insert into person(id,name) values(?,?)
//	@Insert("insert into person(id,name) values(#{id},#{name})")	//수행하고자 하는 것만 어노테이션 사용함.
//	public int insertPerson(@Param("id") String id,@Param("name") String name);
	
	public int insert(@Param("id") String id,@Param("name") String name);
	public int update(@Param("id") String id,@Param("name") String name);
	public int delete(String id);
	public PersonDTO select(String id);
}

