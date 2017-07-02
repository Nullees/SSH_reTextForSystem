package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherQueryOfficeNoticeAction extends ActionSupport{
	private String t_no;
	private TeacherService teacherService;
	private OfficeService officeService;
	public String getT_no() {
		return t_no;
	}
	public void setT_no(String t_no) {
		this.t_no = t_no;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	
	public String execute()throws Exception{
		List name=teacherService.queryTargetTeacherScheduled(t_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		List off=officeService.queryAllOfficeScheduled();
		ServletActionContext.getRequest().setAttribute("off",off);
		return SUCCESS;
	}
}
