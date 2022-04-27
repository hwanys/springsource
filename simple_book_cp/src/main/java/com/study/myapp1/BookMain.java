package com.study.myapp1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.myapp.dto.BookDTO;
import com.study.myapp.service.BookService;
import com.study.myapp.service.BookServieImpl;

public class BookMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		BookService service = (BookService) ctx.getBean("service");
		
		//자바코드
//		BookService service = new BookServieImpl();
//		List<BookDTO> list = service.getList();
		
		//도서 정보 삽입
		BookDTO insertDto = new BookDTO(2002, "파이썬 데이터 분석", "유광열", 27000);
		System.out.println(service.bookInsert(insertDto)?"삽입성공":"삽입실패");
		
		List<BookDTO> list = service.getList();
		for(BookDTO dto : list) {
			System.out.println(dto);
		}
		
	}
}
