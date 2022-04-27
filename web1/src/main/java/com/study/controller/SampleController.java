package com.study.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.dto.UserDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j		//log사용 가능
@RequestMapping("/sample/*")	//http://localhost:9090/sample/** -> 9090까지는 고정이고, 그 뒤의 내용들.
public class SampleController {
	
	// 앞쪽 고정 : /WEB-INF/views
	// 뒤쪽 고정 : .jsp
	
	// 컨트롤러의 리턴 타입이 void 인 경우
	// http://localhost:9090/ 다음 부분이 jsp 페이지를 찾는데 사용됨
	
	// 컨트롤러의 리턴 타입이 String인 경우
	// return 값 만을 가지고 jsp 페이지를 찾음
	
	
//	@RequestMapping(path = "/basic", method=RequestMethod.GET)	//http://localhost:9090/sample/basic (주소를 앞에 지정한부분부터 연결.)
	@GetMapping("/basic")	//위의것도 가능, 이렇게도 간단하게 가능
	public void basic(@ModelAttribute("page") int page,Model model) {
		log.info("basic....");
		
		//page 변수값을 jsp 보여주기
		model.addAttribute("page",page);
	}
	
	// @RequestMapping("/login") : GET + POST 둘 다 허용
	// @RequestMapping(path = "/login", method = RequestMethod.GET) : GET만 허용
	
//	@RequestMapping(path = "/login", method = RequestMethod.GET)	//http://localhost:9090/sample/basic
	@GetMapping("/login")
	public void login() {
		log.info("login....");	// WEB-INF/views/sample/login.jsp
	}
	
	// Controller 파라미터 수집
	// ① 변수명 사용
	// ② ~DTO 객체 사용(jsp 에서 값이 유지됨)
	// ③ HttpServletRequest 객체 사용(필요할 경우만-대부분 사용 잘 안함 - spring 활용하면 편함)
	
	// @RequestParam("이름") : 파라미터로 사용된 변수의 이름과 전달되는 파라미터의 이름이 다른 경우 사용

//	① 변수명 사용
//	@RequestMapping(path = "/login", method = RequestMethod.POST)	//http://localhost:9090/sample/basic
//	@PostMapping("login")
//	public void loginPost(String userid,String password,String addr,int age) {	//인자값 login.jsp와 맞춰주기(name="" 부분)
//		log.info("login POST.... "+userid+" "+password+" "+addr+" "+age);	// WEB-INF/views/sample/login.jsp
//	}
	
//	② ~DTO 객체 사용 방식
//	@PostMapping("login")
//	public void loginPost(UserDTO userDto) {	//인자값 login.jsp와 맞춰주기
//		log.info("login POST.... "+userDto.getUserid()+" "+userDto.getPassword()+" "+userDto.getAddr()+" "+userDto.getAge());	// WEB-INF/views/sample/login.jsp
//	}
	
//	③ HttpServletRequest 객체 사용(필요할 경우만-대부분 사용 잘 안함)
//	@PostMapping("login")
//	public void loginPost(HttpServletRequest request) {
//		String userid = request.getParameter("userid");
//		String password = request.getParameter("password");
//		String addr = request.getParameter("addr");
//		int age = Integer.parseInt(request.getParameter("age"));
//		log.info("login POST.... "+userid+" "+password+" "+addr+" "+age);	// WEB-INF/views/sample/login.jsp
//	}
	
//	@RequestMapping(path = "/doA", method=RequestMethod.GET)	//http://localhost:9090/sample/doA
//	@GetMapping("/doA")
//	public void doA(String userid) {
//		log.info("doA..."+userid); // WEB-INF/views/sample/doA.jsp
//	}
	
	// value 도 허용함.(이건 좀 예전방식)
//	@RequestMapping(value = "/insert", method=RequestMethod.GET) //http://localhost:9090/sample/insert
//	@GetMapping("/insert")
//	public String insert(@RequestParam("ids") ArrayList<String> ids) {	//@RequestParam()
//		log.info("insert..."+ids);
//		return "insert";	// WEB-INF/views/insert.jsp  -> sample 생략
//	}
	
}










