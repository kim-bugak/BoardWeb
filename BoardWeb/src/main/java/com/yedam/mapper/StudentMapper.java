package com.yedam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.vo.MemberVO;
import com.yedam.vo.StudentVO;

public interface StudentMapper {
	public List<StudentVO> studentList();

	StudentVO selectOne(String sno);

	int insertStudent(StudentVO svo);

	// 로그인체크
	MemberVO selectMember(@Param("id") String id, @Param("pw") String pw);

	// 오름차순
	List<MemberVO> memberList(String order, String au);
	// 사용자 관리자 버튼

	int deleteStudent(String stdNo);
}
