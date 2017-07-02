package com.edu.action;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeLoginAction extends ActionSupport{
	private String o_name;
	private String o_password;
	
	private OfficeService officeService;

	

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String o_name) {
		this.o_name = o_name;
	}

	public String getO_password() {
		return o_password;
	}

	public void setO_password(String o_password) {
		this.o_password = o_password;
	}

	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	
	public String execute()throws Exception{
		
		if(officeService.isOfficeLogin(o_name,o_password)){
			
			List name=officeService.queryOfficeScheduledByName(o_name);
			
			ServletActionContext.getRequest().setAttribute("name",name);
			
			//���Ϊ�Ϸ��û�����request��Χ���������login,��������Ϊtrue
			ServletActionContext.getRequest().setAttribute("officelogin","true");
			return SUCCESS;
		}else{
			addActionError("������Ա�����������벻��ȷ");
		}
	return ERROR;
		}
	}

