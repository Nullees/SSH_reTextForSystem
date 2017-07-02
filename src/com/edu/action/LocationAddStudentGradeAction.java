package com.edu.action;

import com.edu.po.Location;
import com.edu.service.LocationService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class LocationAddStudentGradeAction extends ActionSupport{
	private int l_grade;
	private String l_rebulid;
	private String l_term;
	private String l_year;
	private String s_no;
	
	private StudentService studentService;
	private LocationService locationService;
	
	public int getL_grade() {
		return l_grade;
	}
	public void setL_grade(int l_grade) {
		this.l_grade = l_grade;
	}
	public String getL_rebulid() {
		return l_rebulid;
	}
	public void setL_rebulid(String l_rebulid) {
		this.l_rebulid = l_rebulid;
	}
	public String getL_term() {
		return l_term;
	}
	public void setL_term(String l_term) {
		this.l_term = l_term;
	}
	public String getL_year() {
		return l_year;
	}
	public void setL_year(String l_year) {
		this.l_year = l_year;
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
	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}
	
	public String execute()throws Exception{
		Location l=locationService.queryLocationSecheduledByS_no(s_no);
		l.setL_grade(l_grade);
		l.setL_rebulid(l_rebulid);
		l.setL_term(l_term);
		l.setL_year(l_year);
		locationService.updateLocationSecheduled(l);
		
		return SUCCESS;
	}
}
