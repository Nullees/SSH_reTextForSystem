package com.edu.service;

import java.util.List;

import com.edu.po.Location;

public interface LocationService {
	//添加定位字段
	public void addLocationScheduled(Location l);
	
	//删除定位字段
	public void deleteLocationScheduled(int l_no);
	
	//更新定位字段
	public void updateLocationSecheduled(Location l);
	
	//查询所有定位字段
	public List queryAllLocationSecheduled();
	
	//查询目标定位字段
	public List queryTargetLocationSecheduledByID(int l_no);
	
	//根据l_no查询定位字段
	public Location queryLocationSecheduledByID(int l_no);
	
	//根据s_no查询定位字段
	public Location queryLocationSecheduledByS_no(String s_no);
	
	//根据s_no查询目标定位字段
	public List queryTargetLocationSecheduledByS_No(String s_no);
}
