package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Student;
import com.edu.service.OfficeService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeUpdateStudentAction extends ActionSupport{
	private String s_no;
	private String s_name;
	private String s_gender;
	private String s_birth;
	private String s_address;
	private String s_identity;
	private String s_phone;
	private String s_intime;
	private String s_outtime;
	private String s_college;
	private String s_department;
	private String o_no;
	
	private StudentService studentService;
    private OfficeService officeService;
    
	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_gender() {
		return s_gender;
	}

	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}

	public String getS_birth() {
		return s_birth;
	}

	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getS_identity() {
		return s_identity;
	}

	public void setS_identity(String s_identity) {
		this.s_identity = s_identity;
	}

	public String getS_phone() {
		return s_phone;
	}

	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}

	public String getS_intime() {
		return s_intime;
	}

	public void setS_intime(String s_intime) {
		this.s_intime = s_intime;
	}

	public String getS_outtime() {
		return s_outtime;
	}

	public void setS_outtime(String s_outtime) {
		this.s_outtime = s_outtime;
	}

	public String getS_college() {
		return s_college;
	}

	public void setS_college(String s_college) {
		this.s_college = s_college;
	}

	public String getS_department() {
		return s_department;
	}

	public void setS_department(String s_department) {
		this.s_department = s_department;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
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
		
		Student s=new Student();
		s.setS_address(s_address);
		s.setS_birth(s_birth);
		s.setS_college(s_college);
		s.setS_department(s_department);
		s.setS_gender(s_gender);
		s.setS_identity(s_identity);
		s.setS_intime(s_intime);
		s.setS_name(s_name);
		s.setS_no(s_no);
		s.setS_outtime(s_outtime);
		s.setS_phone(s_phone);
		
		studentService.updateStudentScheduled(s);
		
		return SUCCESS;
	}
}
