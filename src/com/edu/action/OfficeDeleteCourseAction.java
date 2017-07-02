package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.CourseService;
import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeDeleteCourseAction extends ActionSupport{
	private String c_no;
	private String o_no;
	
	//业务逻辑组件
	private CourseService courseService;
	private OfficeService officeService;
	
	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	
	public String getO_no() {
		return o_no;
	}

	public void setO_no(String oNo) {
		o_no = oNo;
	}

	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}

	public String execute()throws Exception{
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		courseService.deleteCourseScheduled(getC_no());
		
		return SUCCESS;
	}
}
