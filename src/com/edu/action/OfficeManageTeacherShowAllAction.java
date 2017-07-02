package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeManageTeacherShowAllAction extends ActionSupport{
	private String o_no;
	
	//业务逻辑组件
	private OfficeService officeService;
	private TeacherService teacherService;
	public String getO_no() {
		return o_no;
	}
	public void setO_no(String o_no) {
		this.o_no = o_no;
	}
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	public String execute()throws Exception{
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		List all=teacherService.queryAllTeacherScheduled();
		
		ServletActionContext.getRequest().setAttribute("all",all);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		return SUCCESS;
	}
}
