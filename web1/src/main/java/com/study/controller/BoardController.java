package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/board/*")
public class BoardController {
	
	@GetMapping("/insert")
	public void insert() {
		log.info("board insert...");
	}
	
//	@GetMapping("/modify")
//	public void modify() {
//		log.info("board modify...");
//	}
//	
//	@GetMapping("/read")
//	public void read() {
//		log.info("board read...");
//	}
	
	@GetMapping(path = {"/modify","/read"})
	public void read() {
		log.info("board read or modify 요청");
	} 
	
	@GetMapping("/list")
	public void list() {
		log.info("board list...");
	}
	
	
	
	
	
	
}














