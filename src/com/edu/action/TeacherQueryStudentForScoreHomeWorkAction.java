package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.StudentService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherQueryStudentForScoreHomeWorkAction extends ActionSupport{
	private String s_name;
	private String s_college;
	private String s_department;
	private String t_no;
	private TeacherService teacherService;
	private StudentService studentService;
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_college() {
		return s_college;
	}
	public void setS_college(String s_college) {
		this.s_college = s_college;
	}
	public String getS_department() {
		return s_department;
	}
	public void setS_department(String s_department) {
		this.s_department = s_department;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public String getT_no() {
		return t_no;
	}
	public void setT_no(String t_no) {
		this.t_no = t_no;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public String execute()throws Exception{
		List tea=teacherService.queryTargetTeacherScheduled(t_no);
		
		//将所有学生查询出来，存储在List类型的对象里面
		List stu=studentService.queryAllStudentScheduled();
		
		ServletActionContext.getRequest().setAttribute("stu",stu);
		ServletActionContext.getRequest().setAttribute("tea",tea);
		return SUCCESS;	
	}
}
