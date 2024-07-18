package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.StudentVO;

public interface StudentMapper {
	public List<StudentVO> studentList();
	StudentVO selectOne(String sno);
	int insertStudent(StudentVO svo);
	// insert, update, delete => 변경처리된 건수 반환값으로 지정
//	int insertStudent(StudentVO svo);
//	int updateStudent(StudentVO svo);// 학생번호기준 -> 연락처변경
//	int deleteStudent(String stdNO);
//	
	
}
