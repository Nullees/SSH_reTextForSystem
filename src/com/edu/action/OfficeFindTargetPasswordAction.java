package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Office;
import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeFindTargetPasswordAction extends ActionSupport{
	private String o_name;
	private String o_identity;
	private String o_phone;
	
	//设置业务逻辑组件
	private OfficeService officeService;

	

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String oName) {
		o_name = oName;
	}

	public String getO_identity() {
		return o_identity;
	}

	public void setO_identity(String oIdentity) {
		o_identity = oIdentity;
	}

	public String getO_phone() {
		return o_phone;
	}

	public void setO_phone(String oPhone) {
		o_phone = oPhone;
	}

	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	
	public String execute()throws Exception{
		Office o=new Office();
		o.setO_identity(o_identity);
		o.setO_name(o_name);
		o.setO_phone(o_phone);
		
		Office target=officeService.queryOfficeScheduledByNameAndIdentityAndPhone(o_name, o_identity, o_phone);
		if(target!=null){
			String no=target.getO_no();
			List tags=officeService.queryTargetOfficeScheduledByID(no);
			ServletActionContext.getRequest().setAttribute("tags",tags);
			return SUCCESS;
		}
		return ERROR;
	}
}
