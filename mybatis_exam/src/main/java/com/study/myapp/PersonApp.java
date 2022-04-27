package com.study.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.service.PersonService;

public class PersonApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		PersonService service = (PersonService) ctx.getBean("person");
//		System.out.println(service.insertPerson("tmdghks123", "곽승환"));
		
		System.out.println(service.selectPerson("tmdghks123"));
		
		//수정
		System.out.println(service.updatePerson("hong123", "홍동길")?"수정성공":"수정실패");
		System.out.println(service.selectPerson("hong123"));
		
		//삭제
		System.out.println(service.deletePerson("hong123")?"삭제성공":"삭제실패");
		System.out.println(service.selectPerson("hong123"));
	}
}
