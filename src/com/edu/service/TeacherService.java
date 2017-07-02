package com.edu.service;

import java.util.List;

import com.edu.po.Teacher;

public interface TeacherService {
	//添加教师
	public void addTeacherScheduled(Teacher t);
	
	//删除教师
	public void deleteTeacherScheduled(String t_no);
	
	//更新学生
	public void updateTeacherScheduled(Teacher t);
	
	//查询所有学生
	public List queryAllTeacherScheduled();
	
	//查询目标教师
	public List queryTargetTeacherScheduled(String t_no);
	
	//按id查询教师
	public Teacher queryTeacherScheduledByID(String t_no);
	
	//是否允许登陆
	public boolean isTeacherLogin(String t_name,String t_password);
	
	//根据教师姓名，教师身份证号码，教师手机号码查询目标教师
	public Teacher queryTeacherScheduledByNameAndIdentityAndPhone(String t_name,String t_identity,String t_phone);
	
	//根据教师的姓名查找教师对象
	public List queryStudentScheduledByName(String t_name);
	
	//是否允许教师进行注册
	public boolean isTeacherRegister(String t_name);
	
	//注册教师
	public boolean addTeacher(Teacher t);
}
