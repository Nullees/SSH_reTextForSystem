package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeDeleteTeacherAction extends ActionSupport{
	private String t_no;
	private String o_no;
	
	//业务逻辑组件
	private TeacherService teacherService;
	private OfficeService officeService;
	
	public String getT_no() {
		return t_no;
	}

	public void setT_no(String t_no) {
		this.t_no = t_no;
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
		
		teacherService.deleteTeacherScheduled(getT_no());
		
		return SUCCESS;
	}
}
