package com.edu.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edu.dao.LocationDAO;
import com.edu.po.Course;
import com.edu.po.Location;

public class LocationDAOImpl extends HibernateDaoSupport implements LocationDAO{

	public void deleteLocation(int l_no) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Location.class, l_no));
	}

	public List queryAllLocation() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Location");
	}

	public Location queryLocationByID(int l_no) {
		// TODO Auto-generated method stub
		List<Location> entitise=getHibernateTemplate().find("from Location as loc where loc.l_no=?",l_no);  		 
		   if (entitise.size() > 0) {  		 
			   Location entity = entitise.get(0);
		     return entity;  		 
		 }  		 
		 return null; 
	}

	public List queryTargetLocationByID(int l_no) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Location as loc where loc.l_no=?",l_no); 
	}

	public void saveLocation(Location l) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(l);
	}

	public void updateLocation(Location l) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(l);
	}

	public Location queryLocationByS_No(String s_no) {
		// TODO Auto-generated method stub
		List<Location> entitise=getHibernateTemplate().find("from Location as loc where loc.s_no=?",s_no);  		 
		   if (entitise.size() > 0) {  		 
			   Location entity = entitise.get(0);
		     return entity;  		 
		 }  		 
		 return null; 
	}

	public List queryTargetLocationByS_No(String s_no) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Location as loc where loc.s_no=?",s_no); 
	}
	
}
