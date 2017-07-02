package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherFindTargetInUploadCourseByT_NoAction extends ActionSupport{
	private String t_no;
	private TeacherService teacherService;
	public String getT_no() {
		return t_no;
	}
	public void setT_no(String t_no) {
		this.t_no = t_no;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	public String execute()throws Exception{
		List tea=teacherService.queryTargetTeacherScheduled(t_no);
		ServletActionContext.getRequest().setAttribute("tea",tea);
		return SUCCESS;
	}
}
