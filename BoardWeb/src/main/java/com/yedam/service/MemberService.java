package com.yedam.service;

import java.util.List;

import com.yedam.vo.MemberVO;
import com.yedam.vo.StudentVO;

public interface MemberService {
    MemberVO loginCheck(String id, String pw);
    List<MemberVO> memberList(String order, String au);
//    List<MemberVO> memberList(String res, String orderBy);
    
    // 학생목록조회.
    List<StudentVO> studentList();
    boolean removesStudent(String sno);
    boolean addStudent(StudentVO svo);
}