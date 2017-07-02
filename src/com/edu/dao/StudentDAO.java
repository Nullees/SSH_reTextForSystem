package com.edu.dao;

import java.util.List;

import com.edu.po.Student;


public interface StudentDAO {
	//添加学生
	public void saveStudent(Student s);
	
	//根据学生姓名查找学生
	public Student findStudent(String s_name);
	
	//删除学生
	public void deleteStudent(String s_no);
	
	//更新学生
	public void updateStudent(Student s);
	
	//查询所有学生
	public List queryAllStudent();
	
	//查询目标学生
	public List queryTargetStudent(String s_no);
	
	//按s_no查询学生
	public Student queryStudentByID(String s_no);
	
	//按照学生姓名，学生身份证号码，学生电话号码查找学生
	public Student queryStudentByIdentityAndPhoneAndName(String s_name,String s_identity,String s_phone);
	
	//按照学生姓名查找学生
	public List queryStudentByName(String s_name);
}
