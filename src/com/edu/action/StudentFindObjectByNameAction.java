package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Student;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentFindObjectByNameAction extends ActionSupport{
	private String s_name;
	
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	
	public String execute()throws Exception{
		
		List name=studentService.queryStudentScheduledByName(s_name);
		ServletActionContext.getRequest().setAttribute("name",name);
		return SUCCESS;
	}
}
