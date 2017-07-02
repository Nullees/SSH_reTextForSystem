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
		
		//������һ��Office�����o��������ܸ��ݽ�����Ա��Ž��в�ѯ��Ŀ�����
		Office o=officeService.queryOfficeScheduledByID(o_no);
		
		//��������ҳ�洫�ݹ����Ĺ�������
		o.setO_notice(getO_notice());
		
		//ִ�и�����䣬���������ݴ������ݿ⡣ʵ�������Ӳ���
		officeService.updateOfficeScheduled(o);
		
		
		return SUCCESS;
	}
}
