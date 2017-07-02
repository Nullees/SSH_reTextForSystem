package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Teacher;
import com.edu.service.OfficeService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeUpdateTeacherAction extends ActionSupport{
	private String t_no;
	private String t_name;
	private String t_gender;
	private String t_birth;
	private String t_phone;
	private String t_identity;
	private String t_department;
	private String t_post;
	private String o_no;
	
	private TeacherService teacherService;
	private OfficeService officeService;

	public String getT_no() {
		return t_no;
	}

	public void setT_no(String t_no) {
		this.t_no = t_no;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_gender() {
		return t_gender;
	}

	public void setT_gender(String t_gender) {
		this.t_gender = t_gender;
	}

	public String getT_birth() {
		return t_birth;
	}

	public void setT_birth(String t_birth) {
		this.t_birth = t_birth;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

	public String getT_identity() {
		return t_identity;
	}

	public void setT_identity(String t_identity) {
		this.t_identity = t_identity;
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

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
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
		
		Teacher t=new Teacher();
		t.setT_birth(t_birth);
		t.setT_department(t_department);
		t.setT_gender(t_gender);
		t.setT_identity(t_identity);
		t.setT_name(t_name);
		t.setT_no(t_no);
		t.setT_phone(t_phone);
		t.setT_post(t_post);
		
		teacherService.updateTeacherScheduled(t);
		
		return SUCCESS;
	}
}
