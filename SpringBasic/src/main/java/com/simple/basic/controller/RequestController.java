package com.simple.basic.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.basic.command.MemberVO;

@Controller
@RequestMapping("/request") //이 컨트롤러 모든 요청경로 앞에 /request를 붙이겠다
public class RequestController {
	
//	//void형은 들어온 요청 경로가, 나가는 경로가 됩니디(화면경로)
//	@RequestMapping("/req_ex01")
//	public void ex01() {
//		//void 보다는 String 으로 지정하는거 추천
//	}
	
	@RequestMapping("/req_ex01")
	public String ex01() {
		
		return "/req_ex01"; //화면경로
	}
	
	//@RequestMapping(value="/basic", method=RequestMethod.GET) //get만 혀용함
	//@RequestMapping(value="/basic", method=RequestMethod.POST) //post만 허용함
	//@RequestMapping(value="/basic") // get,post 둘다 허용함
	
	@RequestMapping({"/basic", "/basic2"})
	public String basic() {
		
		System.out.println("basic요청 실행됨");
		return null;
	}
	
	//@GetMapping("/basic3") //@RequestMapping + get만 허용
	@PostMapping("/basic3") //@RequestMapping + post만 허용
	public String basic3() {
		
		System.out.println("basic3요청 실행됨");
		return null;
	}
	
	/////////////////////////////////////////////////
	
	//ex02화면요청
	@GetMapping("/req_ex02")
	public String ex02() {
		return "request/req_ex02";
	}
	
	//request 객체로 값 받기
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(HttpServletRequest request) {
//		
//		
//		System.out.println(request.getParameter("id"));
//		System.out.println(request.getParameter("pw"));
//		System.out.println(request.getParameterValues("inter"));
//		
//		//잘~~~~~ 처리해서 ~~~~
//		//결과화면
//		return "request/req_ex02_ok";
//		
//		
//	}
	
	//@RequestParam방식 - 반드시 값을 화면에서 넘겨야함 (체크안하면 400오류)
	//required = false 는 값이 없더라도 통과하게 됩니다.
	//defaultValue는 값이 없을때 기본값을 지정할 수 있습니다.
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestParam("id") String x, //id를 받아서 x맵핑
//						@RequestParam("pw") String y,
//						@RequestParam(value="inter", required=false, defaultValue = "") ArrayList<String> list) { 
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(list);
//
//		//잘~~~~~ 처리해서 ~~~
//		//결과화면
//		return "request/req_ex02_ok";
		
		
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(MemberVO vo) { 

		System.out.println(vo.toString());
		

		//잘~~~~~ 처리해서 ~~~
		//결과화면
		return "request/req_ex02_ok";
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
