package ezen.springmvc.domain.member.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ezen.springmvc.domain.member.dto.Member;
import ezen.springmvc.domain.member.mapper.MemberMapper;

/**
 * 회원 관련 비즈니스 메소드 구현
 */
@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired //스프링핵심기능 DI, @Service + @Autowired 으로 의존성 끝  
	private MemberMapper memberMapper;
	
	@Override
	public List<Member> getMembers() {
		//추가기능구현가능
		//
		
		return memberMapper.findByAll();
	}

	@Override
	public Member getMember(String id) {
		return memberMapper.findById(id);
	}
	
}







