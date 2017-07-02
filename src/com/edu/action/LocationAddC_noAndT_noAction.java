package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Location;
import com.edu.service.LocationService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class LocationAddC_noAndT_noAction extends ActionSupport{
	private String c_no;
	private String t_no;
	private String s_no;
	
	private LocationService ls;
	private StudentService studentService;
	
	public void setLocationService(LocationService ls){
		this.ls=ls;
	}
	
	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public String getT_no() {
		return t_no;
	}

	public void setT_no(String t_no) {
		this.t_no = t_no;
	}
	
	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String execute()throws Exception{
		List name=studentService.queryTargetStudentScheduled(s_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		Location l=new Location();
		l.setC_no(c_no);
		l.setT_no(t_no);
		l.setS_no(s_no);
		/*l.setL_grade(98);
		l.setL_rebulid("·ñ");
		l.setL_term("´óÈý");
		l.setL_year("2015");
		l.setS_no("10001");*/
		
		ls.addLocationScheduled(l);
		
		return SUCCESS;
	}
}
