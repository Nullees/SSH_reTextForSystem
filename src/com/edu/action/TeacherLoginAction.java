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
			this.addFieldError("t_password", "�����������");
		}else if(!Pattern.matches("\\w{6,20}", t_password.trim())){
			this.addFieldError("t_password", "������������ֺ���ĸ������Ϊ6��20֮��");
		}
	}
		public String execute()throws Exception{
			
			if(teacherService.isTeacherLogin(t_name, t_password)){
				List name=teacherService.queryStudentScheduledByName(t_name);
				
				ServletActionContext.getRequest().setAttribute("name",name);
				
				//���Ϊ�Ϸ��û�����request��Χ���������login,��������Ϊtrue
				ServletActionContext.getRequest().setAttribute("teacherlogin","true");
				return SUCCESS;
			}else{
				addActionError("��ʦ�����������벻��ȷ");
			}
		return ERROR;
	
	}
}
