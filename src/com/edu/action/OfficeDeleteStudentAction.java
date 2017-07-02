package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeDeleteStudentAction extends ActionSupport{
	private String s_no;
	private String o_no;
	//业务逻辑组件
	private StudentService studentService;
	private OfficeService officeService;
	//设置业务逻辑组件
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	
	

	public String getO_no() {
		return o_no;
	}

	public void setO_no(String oNo) {
		o_no = oNo;
	}


	public String execute()throws Exception{
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		
		ServletActionContext.getRequest().setAttribute("name",name);
		
		studentService.deleteStudentScheduled(getS_no());
		
		return SUCCESS;
	}
	
}
