package com.edu.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.service.LocationService;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class LocationShowTargetByS_NoAction extends ActionSupport{
	private String s_no;
	private String t_no;
	private TeacherService teacherService;
	
	private LocationService locationService;
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}
	public String getT_no() {
		return t_no;
	}
	public void setT_no(String t_no) {
		this.t_no = t_no;
	}
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	public String execute()throws Exception{
		System.out.println("���յ���s_no������ֵ��:"+s_no);
		System.out.println("���յ���t_no������ֵ��:"+t_no);
		List tea=teacherService.queryTargetTeacherScheduled(t_no);
		List loc=locationService.queryTargetLocationSecheduledByS_No(s_no);
		System.out.println("�������ҵõ���location������:"+loc);
		System.out.println("�������ҵõ���teacher������:"+tea);
		ServletActionContext.getRequest().setAttribute("loc",loc);
		ServletActionContext.getRequest().setAttribute("tea",tea);
		return SUCCESS;
	}
	
}