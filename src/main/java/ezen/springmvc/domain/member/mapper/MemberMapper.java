package ezen.springmvc.domain.member.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ezen.springmvc.domain.member.dto.Member;
import ezen.springmvc.domain.member.dto.MemberSearchCondition;

//@Repository
@Mapper //선언만해줘면 알아서 구현해주고 구현체 사용가능(구현체 내가 안만듦!!!!)
public interface MemberMapper {
	public List<Member> findByAll();
	public Member findById(String id);
	public List<Member> findByAgeRange(@Param("begin") int begin, @Param("end") int end); //@Param로인해parameter두개이상일때 기존에 map으로 전달했었는데 param두개이상 전달 가능해짐, 즉 알아서 맵으로 만들어줌
	public List<Member> findByNameLike(String name);
	public void create(Member member);
	public void update(Member member);
	
	//고급 예제!!!!!!!
	// 검색 타입별 회원 검색
	public List<Member> findBySearchType(@Param("type") String type, @Param("value") String value);
	// 통합 검색
	public List<Member> findBySearchAll(String value);
	// 검색 옵션별 통합 검색
	public List<Member> findBySearchAllOption(MemberSearchCondition searchCondition); //조건의 맞는 결과물 list로 반환
}
