package kr.or.ksmart.ksmart_mybatis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.ksmart_mybatis.mapper.MemberMapper;
import kr.or.ksmart.ksmart_mybatis.vo.Member;
@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper; 
	
	//회원리스트
	public List<Member> getMemberList(){
		return memberMapper.getMemberList();
		
	}
	
	//회원가입
	public int addMember(Member member) {
		
		return memberMapper.addMember(member);
		
	}
	
	//회원 아이디
	public Member getMemberById(String memberId) {
		return memberMapper.getMemberById(memberId);
	}
	
	//회원수정
	public int modifyMember(Member member) {
		return memberMapper.modifyMember(member);
	}
	
	//회원수정_선생님
	public Member selectByMember(String memberId) {
		return memberMapper.selectByMember(memberId);
	}
	
	//회원삭제 처리
	public int deleteMember(Member member) {
		return memberMapper.deleteMember(member);
	}
	
	//회원검색 처리
	public List<Member> getMemberSearchList(String sk, String sv){
		List<Member> list = memberMapper.getMemberSearchList(sk, sv);
		return list;
	}
}























