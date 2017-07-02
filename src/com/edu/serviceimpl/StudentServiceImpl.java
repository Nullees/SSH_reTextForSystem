package com.edu.serviceimpl;

import java.util.List;

import com.edu.dao.StudentDAO;
import com.edu.po.Student;
import com.edu.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO){
		this.studentDAO=studentDAO;
	}
	
	public void addStudentScheduled(Student s) {
		// TODO Auto-generated method stub
		if(studentDAO.queryStudentByID(s.getS_no())==null){
			studentDAO.saveStudent(s);
		}else{
			System.out.println("该学生已经存在!");
		}
	}

	public void deleteStudentScheduled(String s_no) {
		// TODO Auto-generated method stub
		if(studentDAO.queryStudentByID(s_no)!=null){
			studentDAO.deleteStudent(s_no);
		}else{
			System.out.println("该学生不存在!");
		}
	}

	public boolean isStudentLogin(String s_name, String s_password) {
		// TODO Auto-generated method stub
		Student student=studentDAO.findStudent(s_name);
		//验证密码
		if(student!=null&&s_password.equals(student.getS_password())){
			return true;
		}
		return false;
	}
	
	//查询所有学生对象
	public List queryAllStudentScheduled() {
		// TODO Auto-generated method stub
		return studentDAO.queryAllStudent();
	}

	public Student queryStudentScheduledByID(String s_no) {
		// TODO Auto-generated method stub
		return studentDAO.queryStudentByID(s_no);
	}

	public void updateStudentScheduled(Student s) {
		// TODO Auto-generated method stub
		studentDAO.updateStudent(s);
	}

	public Student queryStudentScheduledByNameAndIdentityAndPhone(
			String s_name, String s_identity, String s_phone) {
		// TODO Auto-generated method stub
		if(s_name!=null&&s_identity!=null&&s_phone!=null){
			return studentDAO.queryStudentByIdentityAndPhoneAndName(s_name, s_identity, s_phone);
		}else{
			System.out.println("所查找的学生对象不存在");
		}
		return null;
	}

	public List queryTargetStudentScheduled(String s_no) {
		// TODO Auto-generated method stub
		return studentDAO.queryTargetStudent(s_no);
	}

	public List queryStudentScheduledByName(String s_name) {
		// TODO Auto-generated method stub
		return studentDAO.queryStudentByName(s_name);
	}

	public boolean addStudent(Student s) {
		// TODO Auto-generated method stub
		//查找该学生名称
		Student oldStudent=studentDAO.findStudent(s.getS_name());
		
		//如果存在，则返回false
		if(oldStudent!=null){
			return false;
		}
		
		//如果不存在，则返回true,并且将对象存入数据库中
		studentDAO.saveStudent(s);
		return true;
	}

	public boolean isStudentRegister(String s_name) {
		// TODO Auto-generated method stub
		//查找该学生名称
		Student student=studentDAO.findStudent(s_name);
		
		//如果存在，则返回false
		if(student!=null){
			return false;
		}
		
		//如果不存在,则返回true
		return true;
	}
}
