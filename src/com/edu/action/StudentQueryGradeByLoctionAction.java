package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.LocationService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentQueryGradeByLoctionAction extends ActionSupport{
	private String s_no;
	
	LocationService locationService;
	StudentService studentService;
	
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public String execute()throws Exception{
		List name=studentService.queryTargetStudentScheduled(s_no);
		List tar=locationService.queryTargetLocationSecheduledByS_No(s_no);
		
		ServletActionContext.getRequest().setAttribute("tar",tar);
		ServletActionContext.getRequest().setAttribute("name",name);
		return SUCCESS;
	}
}
