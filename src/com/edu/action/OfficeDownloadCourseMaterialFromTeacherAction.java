package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeDownloadCourseMaterialFromTeacherAction extends ActionSupport{
	private String t_name;
	private String t_uploadcoursematerial;
	private String t_department;
	private String t_post;
	private String o_no;
	
	private OfficeService officeService;
	private TeacherService teacherService;
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_uploadcoursematerial() {
		return t_uploadcoursematerial;
	}
	public void setT_uploadcoursematerial(String t_uploadcoursematerial) {
		this.t_uploadcoursematerial = t_uploadcoursematerial;
	}
	public String getT_department() {
		return t_department;
	}
	public void setT_department(String t_department) {
		this.t_department = t_department;
	}
	public String getT_post() {
		return t_post;
	}
	public void setT_post(String t_post) {
		this.t_post = t_post;
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
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	public String execute()throws Exception{
		List dow=teacherService.queryAllTeacherScheduled();
		List off=officeService.queryTargetOfficeScheduledByID(o_no);
		ServletActionContext.getRequest().setAttribute("dow",dow);
		ServletActionContext.getRequest().setAttribute("off",off);
		
		return SUCCESS;
		
	}
}
