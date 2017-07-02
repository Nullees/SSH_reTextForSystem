package com.edu.dao;

import java.util.List;

import com.edu.po.Location;

public interface LocationDAO {
	//添加定位字段
	public void saveLocation(Location l);
	
	//删除定位字段
	public void deleteLocation(int l_no);
	
	//更新定位字段
	public void updateLocation(Location l);
	
	//查询所有定位字段
	public List queryAllLocation();
	
	//根据定位编号查询目标定位字段
	public List queryTargetLocationByID(int l_no);
	
	//根据定位编号查询定位字段
	public Location queryLocationByID(int l_no);
	
	//根据学生编号查找定位字段
	public Location queryLocationByS_No(String s_no);
	
	//根据叙述编号查询目标定位字段
	public List queryTargetLocationByS_No(String s_no);
}
