package com.simple.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.basic.command.BirthdayVO;
import com.simple.basic.command.LoginVo;
import com.simple.basic.command.MemberVO;


@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	
	@RequestMapping("/join")
	public String quiz1_ok(@ModelAttribute("info") LoginVo vo) {
		
		return "quiz/join";
		
	}
	
	///////////////////////////////////////////////////////////
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	//result 화면요청
	@RequestMapping("/result")
	public String result() {
		return "quiz/result";
	}
	
//	@RequestMapping("/birthForm")
//	public String birthForm(BirthdayVO vo, RedirectAttributes ra) {
//		
////		String year = vo.getYear();
////		String day = vo.getDay();
////		String msg = vo.getMsg();
//
//		ra.addFlashAttribute("year", vo.getYear());
//		ra.addFlashAttribute("day", vo.getDay());
//		ra.addFlashAttribute("msg", vo.getMsg());
//		
//		return "redirect:/quiz/result"; //@RequestMapping("/result") 로 감
//	}
	
	@RequestMapping("/birthForm")
	public String birthForm(@RequestParam("year") String year,
							@RequestParam("month") String month,
							@RequestParam("day") String day,
							@RequestParam("msg") String msg,
							RedirectAttributes ra) {
		
		String str = year + "-" + month + "-" + day + "-" + msg;
		ra.addFlashAttribute("msg", str);

		return "redirect:/quiz/result"; //@RequestMapping("/result") 로 감
	}
	
	
	
}
