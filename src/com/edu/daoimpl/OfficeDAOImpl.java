package com.edu.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edu.dao.OfficeDAO;
import com.edu.po.Office;
import com.edu.po.Student;

public class OfficeDAOImpl extends HibernateDaoSupport implements OfficeDAO{

	public void deleteOffice(String o_no) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Office.class, o_no));
	}

	public List queryAllOffice() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Office");
	}

	public Office queryOfficeByID(String o_no) {
		// TODO Auto-generated method stub
		List<Office> entitise=getHibernateTemplate().find("from Office as off where off.o_no=?",o_no);  		 
		   if (entitise.size() > 0) {  		 
			   Office entity = entitise.get(0);
		     return entity;  		 
		 }  		 
		 return null;  
	}

	public List queryTargetOfficeByID(String o_no) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Office as off where off.o_no=?",o_no); 
	}

	public void saveOffice(Office o) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(o);
	}

	public Office findOffice(String o_name) {
		// TODO Auto-generated method stub
		List entitise=getHibernateTemplate().find("from Office off where off.o_name=?", o_name);
		if(entitise!=null&&entitise.size()>=1){
			return (Office)entitise.get(0);
		}
		return null;
	}

	public List queryOfficeByName(String o_name) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Office as off where off.o_name=?",o_name);
	}

	public Office queryStudentByIdentityAndPhoneAndName(String o_name,
			String o_identity, String o_phone) {
		// TODO Auto-generated method stub
		List<Office> entitise=getHibernateTemplate().find("from  Office as off where off.o_name = ?  and off.o_identity = ? and off.o_phone = ?",new String[]{o_name,o_identity,o_phone});
		   if (entitise.size() > 0) {  	
			   Office entity = entitise.get(0);  	
		     return entity;  		 
		 }  		 
		 return null;
	}
	
	
	//保存更新内容
	public void updateOffice(Office o) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(o);
	}

}
