package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.CourseService;
import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeManageCourseShowAllAction extends ActionSupport{
	private String o_no;
	
	private OfficeService officeService;
	private CourseService courseService;
	public String getO_no() {
		return o_no;
	}
	public void setO_no(String o_no) {
		this.o_no = o_no;
	}
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	public String execute()throws Exception{
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		List all=courseService.queryAllCourseScheduled();
		
		ServletActionContext.getRequest().setAttribute("all",all);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		return SUCCESS;
	}
}
