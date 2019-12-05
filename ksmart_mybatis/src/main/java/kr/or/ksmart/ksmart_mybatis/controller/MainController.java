package kr.or.ksmart.ksmart_mybatis.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model, HttpSession session) {
		model.addAttribute("layout", "thymeleaf layout");
		System.out.println("session값 확인 : ->" + session.getAttribute("SID"));
		return "index";
	}
	
}
