package com.edu.action;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherLoginAction extends ActionSupport{
	private String t_name;
	private String t_password;
	
	private TeacherService teacherService;

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_password() {
		return t_password;
	}

	public void setT_password(String t_password) {
		this.t_password = t_password;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	public void validate(){
		if(t_password==null||"".equals(t_password)){
			this.addFieldError("t_password", "密码必须输入");
		}else if(!Pattern.matches("\\w{6,20}", t_password.trim())){
			this.addFieldError("t_password", "密码必须是数字和字母，长度为6到20之间");
		}
	}
		public String execute()throws Exception{
			
			if(teacherService.isTeacherLogin(t_name, t_password)){
				List name=teacherService.queryStudentScheduledByName(t_name);
				
				ServletActionContext.getRequest().setAttribute("name",name);
				
				//如果为合法用户，在request范围中添加属性login,其属性名为true
				ServletActionContext.getRequest().setAttribute("teacherlogin","true");
				return SUCCESS;
			}else{
				addActionError("教师姓名或者密码不正确");
			}
		return ERROR;
	
	}
}
