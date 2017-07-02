package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Student;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentFindTargetAction extends ActionSupport{
	private String s_name;
	private String s_identity;
	private String s_phone;
	
	//设置业务逻辑组件
	private StudentService studentService;
	
	
	
	//设置业务逻辑组件方法
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_identity() {
		return s_identity;
	}
	public void setS_identity(String s_identity) {
		this.s_identity = s_identity;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	
	public String execute()throws Exception{
		Student s=new Student();
		s.setS_name(s_name);
		s.setS_identity(s_identity);
		s.setS_phone(s_phone);
		
		Student target=studentService.queryStudentScheduledByNameAndIdentityAndPhone(s_name, s_identity, s_phone);
		
		if(target!=null){
			String no=target.getS_no();
			
			List tags=studentService.queryTargetStudentScheduled(no);
			
			ServletActionContext.getRequest().setAttribute("tags",tags);
			
			return SUCCESS;
		}
		return ERROR;
	}
	
}
