package com.study.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.study.dto.RegisterDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";	// /WEB-INF/views/home.jsp -> views/까지 고정.
	}
	
	// redirect 방식으로 움직일 때 값을 전송하는 방법
	// ① rttr.addAttribute("age",10); 주소줄에 age라는 이름으로 10 보내는 방식
	// http:// ~~~~~~~~~ ?age=10
	// path += "?page=+page+"&amount="amount... 했던 부분 대체하는 방법
	
	//② addFlashAttribute("num","15"); 세션 객체(일회성)에 담는 방식
	
	@GetMapping("/doB")
	public String doB(RedirectAttributes rttr) {
		rttr.addAttribute("age",10);	//주소변화일어남. :9090-> :9090/?age=10
		rttr.addAttribute("addr","서울");	//주소창에 값을 여러개 보낼수 있다.
		rttr.addAttribute("name","홍프링");
		
		rttr.addFlashAttribute("num","15");
		return "redirect:/";
	}
	
	
	// 예전방식
	@GetMapping("/doC")
	public ModelAndView doC() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("num",35); // request.setAttribute()
		return mav;
	}
	
//	@GetMapping("/doD")				// 404error :  [/WEB-INF/views/doD.jsp]을(를) 찾을 수 없습니다.
//	public RegisterDTO regist() {
//		return new RegisterDTO();
//	}
	
}





