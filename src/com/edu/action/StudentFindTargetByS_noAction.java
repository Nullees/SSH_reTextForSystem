package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentFindTargetByS_noAction extends ActionSupport{
	private String s_no;
	
	private StudentService studentService;

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String sNo) {
		s_no = sNo;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String execute()throws Exception{
		
		List name=studentService.queryTargetStudentScheduled(s_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		return SUCCESS;
		
	}
}
