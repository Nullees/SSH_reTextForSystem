package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Office;
import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeAddNoticeAction extends ActionSupport{
	private String o_no;
	private String o_notice;
	
	private OfficeService officeService;

	public String getO_no() {
		return o_no;
	}

	public void setO_no(String o_no) {
		this.o_no = o_no;
	}

	public String getO_notice() {
		return o_notice;
	}

	public void setO_notice(String o_notice) {
		this.o_notice = o_notice;
	}

	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	
	public String execute()throws Exception{
		List name=officeService.queryTargetOfficeScheduledByID(o_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		//定义了一个Office类对象o，对象接受根据教务处人员编号进行查询的目标对象
		Office o=officeService.queryOfficeScheduledByID(o_no);
		
		//对象设置页面传递过来的公告内容
		o.setO_notice(getO_notice());
		
		//执行更新语句，将公告内容存入数据库。实现了增加操作
		officeService.updateOfficeScheduled(o);
		
		
		return SUCCESS;
	}
}
