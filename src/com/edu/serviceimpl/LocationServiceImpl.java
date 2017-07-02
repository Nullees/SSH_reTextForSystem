package com.edu.serviceimpl;

import java.util.List;

import com.edu.dao.LocationDAO;
import com.edu.po.Location;
import com.edu.service.LocationService;

public class LocationServiceImpl implements LocationService{
	
	private LocationDAO locationDAO;

	public void setLocationDAO(LocationDAO locationDAO) {
		this.locationDAO = locationDAO;
	}

	public void addLocationScheduled(Location l) {
		// TODO Auto-generated method stub
		if(locationDAO.queryLocationByID(l.getL_no())==null){
			locationDAO.saveLocation(l);
		}else{
			System.out.println("该定位信息已经存在!");
		}
	}

	public void deleteLocationScheduled(int l_no) {
		// TODO Auto-generated method stub
		if(locationDAO.queryLocationByID(l_no)!=null){
			locationDAO.deleteLocation(l_no);
		}else{
			System.out.println("不存在该定位信息!");
		}
	}

	public List queryAllLocationSecheduled() {
		// TODO Auto-generated method stub
		return locationDAO.queryAllLocation();
	}

	public Location queryLocationSecheduledByID(int l_no) {
		// TODO Auto-generated method stub
		return locationDAO.queryLocationByID(l_no);
	}

	public List queryTargetLocationSecheduledByID(int l_no) {
		// TODO Auto-generated method stub
		return locationDAO.queryTargetLocationByID(l_no);
	}

	public void updateLocationSecheduled(Location l) {
		// TODO Auto-generated method stub
		locationDAO.updateLocation(l);
	}

	public Location queryLocationSecheduledByS_no(String s_no) {
		// TODO Auto-generated method stub
		return locationDAO.queryLocationByS_No(s_no);
	}

	public List queryTargetLocationSecheduledByS_No(String s_no) {
		// TODO Auto-generated method stub
		return locationDAO.queryTargetLocationByS_No(s_no);
	}
	
}
