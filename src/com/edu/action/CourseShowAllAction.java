package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.CourseService;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class CourseShowAllAction extends ActionSupport{
	private String s_no;
	private StudentService studentService;
	
	private CourseService courseService;

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	public String getS_no() {
		return s_no;
	}

	public void setS_no(String sNo) {
		s_no = sNo;
	}

	public String execute()throws Exception{
		//查询目标学生字段
		List name=studentService.queryTargetStudentScheduled(s_no);
		
		//查询所有学生字段
		List studentall=studentService.queryAllStudentScheduled();
		
		//查询所有课程字段
		List courseall=courseService.queryAllCourseScheduled();
		
		ServletActionContext.getRequest().setAttribute("name",name);
		ServletActionContext.getRequest().setAttribute("studentall",studentall);
		ServletActionContext.getRequest().setAttribute("courseall",courseall);
		return SUCCESS;
	}

	
}
