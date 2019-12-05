package kr.or.ksmart.ksmart_mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.ksmart_mybatis.vo.Member;

@Mapper
public interface MemberMapper {
	
	//전체 회원 리스트 조회
	public List<Member> getMemberList();
	
	//회원가입
	public int addMember(Member member);
	
	//회원아이디 파라미터
	public Member getMemberById(String memberId);
	
	//회원수정 처리
	public int modifyMember(Member member);
	
	//회원아이디 파라미터
	public Member selectByMember(String memberId);
	
	//회원삭제 처리
	public int deleteMember(Member member);
	
	//전체 회원검색
	
	public List<Member> getMemberSearchList(String sk, String sv);
}
