package com.edu.serviceimpl;

import java.util.List;

import com.edu.dao.TeacherDAO;
import com.edu.po.Teacher;
import com.edu.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{
	private TeacherDAO teacherDAO;
	
	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	public void addTeacherScheduled(Teacher t) {
		// TODO Auto-generated method stub
		if(teacherDAO.queryTeacherByID(t.getT_no())==null){
			teacherDAO.saveTeacher(t);
		}else{
			System.out.println("该教师已经存在!");
		}
	}

	public void deleteTeacherScheduled(String t_no) {
		// TODO Auto-generated method stub
		if(teacherDAO.queryTeacherByID(t_no)!=null){
			teacherDAO.deleteTeacher(t_no);
		}else{
			System.out.println("该教师不存在!");
		}
	}

	public boolean isTeacherLogin(String t_name, String t_password) {
		// TODO Auto-generated method stub
		Teacher teacher=teacherDAO.findTeacher(t_name);
		
		//验证密码
		if(teacher!=null&&t_password.equals(teacher.getT_password())){
			return true;
		}
		return false;
	}

	public List queryAllTeacherScheduled() {
		// TODO Auto-generated method stub
		return teacherDAO.queryAllTeacher();
	}

	public List queryTargetTeacherScheduled(String t_no) {
		// TODO Auto-generated method stub
		return teacherDAO.queryTragetTeacher(t_no);
	}

	public Teacher queryTeacherScheduledByID(String t_no) {
		// TODO Auto-generated method stub
		return teacherDAO.queryTeacherByID(t_no);
	}

	public void updateTeacherScheduled(Teacher t) {
		// TODO Auto-generated method stub
		teacherDAO.updateTeacher(t);
	}

	
	public Teacher queryTeacherScheduledByNameAndIdentityAndPhone(
			String t_name, String t_identity, String t_phone) {
		// TODO Auto-generated method stub
		if(t_name!=null&&t_identity!=null&&t_phone!=null){
			return teacherDAO.queryTeacherByNameAndIdentityAndPhone(t_name, t_identity, t_phone);
		}else{
			System.out.println("所查找的教师对象不存在");
		}
		return null;
	}

	public List queryStudentScheduledByName(String t_name) {
		// TODO Auto-generated method stub
		return teacherDAO.queryTeacherByName(t_name);
	}

	public boolean addTeacher(Teacher t) {
		// TODO Auto-generated method stub
		//查找该教师名称
		Teacher oldTeacher=teacherDAO.findTeacher(t.getT_name());
		
		//如果存在，则返回false
		if(oldTeacher!=null){
			return false;
		}
		
		//如果不存在，则返回true,并且将对象存入数据库中
		teacherDAO.saveTeacher(t);
		return true;
	}

	public boolean isTeacherRegister(String t_name) {
		// TODO Auto-generated method stub
		//查找该教师名称
		Teacher teacher=teacherDAO.findTeacher(t_name);
		
		//如果存在，则返回false
		if(teacher!=null){
			return false;
		}
		
		//如果不存在，则返回true
		return true;
	}
	
}
