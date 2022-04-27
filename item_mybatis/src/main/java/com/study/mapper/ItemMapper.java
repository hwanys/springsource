package com.study.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.study.dto.ItemDTO;

public interface ItemMapper {
	public int insert(ItemDTO insertDto);	// insert는 0 or 1이니깐 int로 리턴타입
	public ItemDTO select(int num);	// num이 일치하는... -> DTO로 넘겨주기
	public int delete(int num);
	public int update(@Param("num")int num,@Param("psize")String psize,@Param("price")int price);
	public List<ItemDTO> selectAll();	//전체조회도 selectAll로.
}
