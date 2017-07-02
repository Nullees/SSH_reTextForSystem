package com.edu.dao;

import java.util.List;

import com.edu.po.Teacher;

public interface TeacherDAO {
	//添加教师
	public void saveTeacher(Teacher t);
	
	//根据教师姓名查找教师
	public Teacher findTeacher(String t_name);
	
	//删除教师
	public void deleteTeacher(String t_no);
	
	//更新教师
	public void updateTeacher(Teacher t);
	
	//查询所有教师
	public List queryAllTeacher();
	
	//查询目标教师
	public List queryTragetTeacher(String t_no);
	
	//按照教师姓名，教师身份证号码和教师电话号码查找教师
	public Teacher queryTeacherByNameAndIdentityAndPhone(String t_name,String t_identity,String t_phone);
	
	//按t_no查询教师
	public Teacher queryTeacherByID(String t_no);
	
	//按照教师姓名查找教师
	public List queryTeacherByName(String t_name);
}
