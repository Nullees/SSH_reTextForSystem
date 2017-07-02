package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Course;
import com.edu.service.CourseService;
import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeAddCourseAction extends ActionSupport{
	private String c_no;
	private String c_name;
	private String c_credit;
	private String c_time;
	private String c_point;
	private String c_type;
	private String t_no;
	private String o_no;
	
	private CourseService courseService;
	private OfficeService officeService;
	
	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_credit() {
		return c_credit;
	}

	public void setC_credit(String c_credit) {
		this.c_credit = c_credit;
	}

	public String getC_time() {
		return c_time;
	}

	public void setC_time(String c_time) {
		this.c_time = c_time;
	}

	public String getC_point() {
		return c_point;
	}

	public void setC_point(String c_point) {
		this.c_point = c_point;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}

	public String getT_no() {
		return t_no;
	}

	public void setT_no(String t_no) {
		this.t_no = t_no;
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
		
		Course c=new Course();
		c.setC_credit(c_credit);
		c.setC_name(c_name);
		c.setC_no(c_no);
		c.setC_point(c_point);
		c.setC_time(c_time);
		c.setC_type(c_type);
		c.setT_no(t_no);
		
		courseService.addCourseScheduled(c);
		
		return SUCCESS;
	}
}
