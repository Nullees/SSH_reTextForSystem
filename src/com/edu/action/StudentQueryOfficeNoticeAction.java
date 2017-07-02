package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentQueryOfficeNoticeAction extends ActionSupport{
	private String s_no;
	private StudentService studentService;
	private OfficeService officeService;
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	
	public String execute()throws Exception{
		List name=studentService.queryTargetStudentScheduled(s_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		List off=officeService.queryAllOfficeScheduled();
		ServletActionContext.getRequest().setAttribute("off",off);
		return SUCCESS;
	}
}
