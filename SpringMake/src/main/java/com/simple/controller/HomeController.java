package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//컨트롤러 역할을 수행
@Controller
public class HomeController {
	
	@RequestMapping("/test/aaa")
	public String home() {
		
		System.out.println("컨트롤러 지나가요~");
		
		//return "/WEB-INF/views/home.jsp";
		return "home";
	}
	
	
}