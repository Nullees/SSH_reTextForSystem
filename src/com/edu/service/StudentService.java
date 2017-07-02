package com.edu.service;

import java.util.List;

import com.edu.po.Student;


public interface StudentService {
	//添加学生
	public void addStudentScheduled(Student s);
	
	//删除学生
	public void deleteStudentScheduled(String s_no);
	
	//更新学生
	public void updateStudentScheduled(Student s);
	
	//查询所有学生
	public List queryAllStudentScheduled();
	
	//查询目标学生
	public List queryTargetStudentScheduled(String s_no);
	
	//按id查询学生
	public Student queryStudentScheduledByID(String s_no);
	
	//是否允许登陆
	public boolean isStudentLogin(String s_name,String s_password);
	
	//根据学生的姓名，身份证号码，手机号码查找学生对象
	public Student queryStudentScheduledByNameAndIdentityAndPhone(String s_name,String s_identity,String s_phone);
	
	//根据学生的姓名查找学生对象
	public List queryStudentScheduledByName(String s_name);
	
	//注册教务处人员
	public boolean addStudent(Student s);
	
	//是否允许教务处人员注册
	public boolean isStudentRegister(String s_name);
}
