package com.edu.action;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentLogingAction extends ActionSupport{
	private String s_name;
	private String s_password;
	
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_password() {
		return s_password;
	}

	public void setS_password(String s_password) {
		this.s_password = s_password;
	}

	
	
	public void validate(){
		if(s_password==null||"".equals(s_password)){
			this.addFieldError("s_password", "密码必须输入");
		}else if(!Pattern.matches("\\w{6,20}", s_password.trim())){
			this.addFieldError("s_password", "密码必须是数字和字母，长度为6到20之间");
		}
	}
	
	public String execute()throws Exception{
		
		
		if(studentService.isStudentLogin(s_name, s_password)){
			List name=studentService.queryStudentScheduledByName(s_name);
			
			ServletActionContext.getRequest().setAttribute("name",name);
			
			//如果为合法用户，在request范围中添加属性login,其属性名为true
			ServletActionContext.getRequest().setAttribute("studentlogin","true");
			return SUCCESS;
		}else{
			addActionError("学生姓名或者密码不正确");
		}
	return ERROR;
}
}
