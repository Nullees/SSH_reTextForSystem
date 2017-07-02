package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Teacher;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherFindTargetAction extends ActionSupport{
	private String t_name;
	private String t_identity;
	private String t_phone;
	
	//业务逻辑组件
	private TeacherService teacherService;
	
	//设置业务逻辑组件
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_identity() {
		return t_identity;
	}

	public void setT_identity(String t_identity) {
		this.t_identity = t_identity;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}
	
	public String execute()throws Exception{
		Teacher t=new Teacher();
		t.setT_name(t_name);
		t.setT_identity(t_identity);
		t.setT_phone(t_phone);
		
		Teacher target=teacherService.queryTeacherScheduledByNameAndIdentityAndPhone(t_name, t_identity, t_phone);
		
		if(target!=null){
			String no=target.getT_no();
			
			List tags=teacherService.queryTargetTeacherScheduled(no);
			
			ServletActionContext.getRequest().setAttribute("tags",tags);
			
			return SUCCESS;
		}
		return ERROR;
	}
	
}
