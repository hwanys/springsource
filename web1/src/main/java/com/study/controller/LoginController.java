package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.study.dto.UserDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {
	
//	@RequestMapping(path = "/login", method = RequestMethod.GET)	
	// http://localhost:9090/login
	@GetMapping("/login")
	public String login() {				// String으로 바꾼이유..? 
		log.info("login....");	// WEB-INF/views/sample/login.jsp
		
		return "sample/login";
	}
	
//	@RequestMapping(path = "/login", method = RequestMethod.POST)	//http://localhost:9090/sample/basic
//	@PostMapping("login")
//	public void loginPost(String userid,String password,String addr,int age) {	//인자값 login.jsp와 맞춰주기(name="" 부분)
//		log.info("login POST.... "+userid+" "+password+" "+addr+" "+age);	// WEB-INF/views/sample/login.jsp
//	}
	
	@PostMapping("/login")
	public String loginPost(@ModelAttribute("user") UserDTO userDto) {	
		log.info("login POST.... "+userDto.getUserid()+" "+userDto.getPassword()+" "+userDto.getAddr()+" "+userDto.getAge());	// WEB-INF/views/sample/login.jsp
		
		return "sample/logout";		//jsp 찾으러감.
		
//		return "home";		// forward방식 (home으로 가지만 주소창은 /login으로 나옴 
		// redirect: - sendRedirect (내용과 주소창 일치)
//		return "redirect:/";	// 가야할 경로로 찍기(get 방식)
	}
	
	
//	@PostMapping("/login")
//	public void loginPost(HttpServletRequest request) {
//		String userid = request.getParameter("userid");
//		String password = request.getParameter("password");
//		String addr = request.getParameter("addr");
//		int age = Integer.parseInt(request.getParameter("age"));
//		log.info("login POST.... "+userid+" "+password+" "+addr+" "+age);	// WEB-INF/views/sample/login.jsp
//	}
	
	

}
