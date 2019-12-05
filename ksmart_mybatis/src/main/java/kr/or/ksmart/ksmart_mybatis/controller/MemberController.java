package kr.or.ksmart.ksmart_mybatis.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ksmart.ksmart_mybatis.service.MemberService;
import kr.or.ksmart.ksmart_mybatis.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//01로그인화면
	@GetMapping("/login")
	public String login() {
		
		return "/login/login";
	}
	
	//02로그인처리
	@PostMapping("/login")
	public String loging(Member member, HttpSession session, ServletResponse response) throws IOException {
		session.setAttribute("SID", member.getMemberId());
		System.out.println("member 로그인 ->" + member.toString());
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('로그인을 성공하셨습니다.');"
				+ " location.href='/';</script>");
		out.flush();
		return "redirect:/";
	}
	
	//03로그아웃처리
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//04컨테이너 get방식에 주소요청을 정의
	@GetMapping("/memberList")
	public String getmemberList(Model model) {
		
		model.addAttribute("memberList", memberService.getMemberList());
		
		return "/member/memberList"; 
	}
	//05회원가입화면
	@GetMapping("/memberInsert")
	public String addMember() {
		return "/member/memberInsert"; 
	}
	
	
	//06회원가입처리
	@PostMapping("/memberInsert")
	public String addMember(Member member) {
		System.out.println("member 가입==>" + member.toString());
		memberService.addMember(member);
		
		return "redirect:/memberList"; 
	}
	
	//07회원수정 화면
	@GetMapping("/updateM")
	public String updateM(
			@RequestParam(value="memberId") String memberId, Model model) {
		System.out.println("memberId->" + memberId);
		memberService.selectByMember(memberId);
		model.addAttribute("member", memberService.selectByMember(memberId));
		return "/member/updateM";
	}
	
	//08회원수정 처리
	@PostMapping("/updateM")
	public String modifyMember(Member member) {
		System.out.println("member 수정==>" + member.toString());
		memberService.modifyMember(member);
		return "redirect:/memberList";
	}
	
	
	//09회원삭제화면?
	@GetMapping("/deleteM")
	public String deleteMember(@RequestParam(value="memberId") String memberId, Model model) {
		System.out.println("memberId->" + memberId);
		memberService.selectByMember(memberId);
		model.addAttribute("member", memberService.selectByMember(memberId));
		return "/member/memberList";
	}
	
	//10회원삭제 처리
	@PostMapping("/deleteM")
	public String deleteMember(Member member) {
		System.out.println("member 삭제==>" + member.toString());
		return "redirect:/memberList";
	}
	
	//11회원검색
	@PostMapping("/memberList")
	public String getMemberSearchList(
			 @RequestParam(value="sk") String sk
			,@RequestParam(value="sv") String sv
			,Model model){
		List<Member> list = memberService.getMemberSearchList(sk, sv);
		model.addAttribute("memberList", list);
		return "/member/memberList";
	}
	
	
	
}







































