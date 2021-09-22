package net.scit.pp.dao;

import net.scit.pp.vo.Member;

public interface MemberMapper {
	// 회원가입
	public int insertMember(Member member) throws Exception;
	
	// 회원정보수정
	public int updateMember(Member member) throws Exception;
	
	// 로그인 / 아이디 중복확인
	public Member selectMember(Member member) throws Exception;

	public Member selectOne(String userid) throws Exception;
}
