package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.StudentService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentDownloadHomeworkFromTeacherAction extends ActionSupport{
	private String t_name;
	private String t_uploadhomework;
	private String t_department;
	private String t_post;
	private String s_no;
	
	private TeacherService teacherService;
	private StudentService studentService;
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_uploadhomework() {
		return t_uploadhomework;
	}
	public void setT_uploadhomework(String t_uploadhomework) {
		this.t_uploadhomework = t_uploadhomework;
	}
	public String getT_department() {
		return t_department;
	}
	public void setT_department(String t_department) {
		this.t_department = t_department;
	}
	public String getT_post() {
		return t_post;
	}
	public void setT_post(String t_post) {
		this.t_post = t_post;
	}
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String execute()throws Exception{
		List dow=teacherService.queryAllTeacherScheduled();
		List stu=studentService.queryTargetStudentScheduled(s_no);
		
		ServletActionContext.getRequest().setAttribute("dow",dow);
		ServletActionContext.getRequest().setAttribute("stu",stu);
		
		return SUCCESS;
	}
}
