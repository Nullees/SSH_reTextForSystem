package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeManageStudentInShowAllAction extends ActionSupport{
	private String o_no;
	
	//业务逻辑组件
	private OfficeService officeService;
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public String getO_no() {
		return o_no;
	}
	public void setO_no(String o_no) {
		this.o_no = o_no;
	}
	
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	public String execute()throws Exception{
		//调用业务逻辑组件获得所有的学生对象
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		List all=studentService.queryAllStudentScheduled();
		
		ServletActionContext.getRequest().setAttribute("all",all);
		ServletActionContext.getRequest().setAttribute("name",name);
		return SUCCESS;
	}
}
