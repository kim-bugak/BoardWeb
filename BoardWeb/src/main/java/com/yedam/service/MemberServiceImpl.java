package com.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DataSource;
import com.yedam.mapper.StudentMapper;
import com.yedam.vo.MemberVO;
import com.yedam.vo.StudentVO;

public class MemberServiceImpl implements MemberService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

	@Override
	public MemberVO loginCheck(String id, String pw) {
		return mapper.selectMember(id, pw);

	}

	@Override
	public List<MemberVO> memberList(String order, String au) {
		return mapper.memberList(order, au);
	}

	@Override
	public List<StudentVO> studentList() {
		return mapper.studentList();

	}

	@Override
	public boolean removesStudent(String sno) {
		// TODO Auto-generated method stub
		return mapper.deleteStudent(sno) == 1;
	}

	@Override
	public boolean addStudent(StudentVO svo) {
		// TODO Auto-generated method stub
		return mapper.insertStudent(svo)==1;
	}
}