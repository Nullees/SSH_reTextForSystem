package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Location;
import com.edu.service.CourseService;
import com.edu.service.LocationService;
import com.edu.service.OfficeService;
import com.edu.service.StudentService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeCountStudentGradeAction extends ActionSupport{
	private String o_no;
	private String s_no;
	
	private LocationService locationService;
	private OfficeService officeService;
	private StudentService studentService;
	private CourseService courseService;
	private TeacherService teacherService;
	
	public String getO_no() {
		return o_no;
	}
	public void setO_no(String o_no) {
		this.o_no = o_no;
	}
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public String execute()throws Exception{
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		List stu=studentService.queryTargetStudentScheduled(s_no);
		
		Location loction=locationService.queryLocationSecheduledByS_no(s_no);
		List loc=locationService.queryTargetLocationSecheduledByS_No(s_no);
		List tea=teacherService.queryTargetTeacherScheduled(loction.getT_no());
		List cou=courseService.queryTragetCourseScheduled(loction.getC_no());
		
		ServletActionContext.getRequest().setAttribute("name",name);
		ServletActionContext.getRequest().setAttribute("stu",stu);
		ServletActionContext.getRequest().setAttribute("tea",tea);
		ServletActionContext.getRequest().setAttribute("cou",cou);
		ServletActionContext.getRequest().setAttribute("loc",loc);
		
		return SUCCESS;
	}
}
