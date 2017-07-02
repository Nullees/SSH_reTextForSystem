package com.edu.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edu.dao.TeacherDAO;
import com.edu.po.Teacher;

public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDAO{

	public void deleteTeacher(String t_no) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Teacher.class, t_no));
	}

	public Teacher findTeacher(String t_name) {
		// TODO Auto-generated method stub
		List entitise=getHibernateTemplate().find("from Teacher tea where tea.t_name=?", t_name);
		if(entitise!=null&&entitise.size()>=1){
			return (Teacher)entitise.get(0);
		}
		return null;
	}

	public List queryAllTeacher() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Teacher");
	}

	public Teacher queryTeacherByNameAndIdentityAndPhone(String t_name,
			String t_identity, String t_phone) {
		// TODO Auto-generated method stub
		List<Teacher> entitise=getHibernateTemplate().find("from  Teacher as tea where tea.t_name = ?  and tea.t_identity = ? and tea.t_phone = ?",new String[]{t_name,t_identity,t_phone});
		   if (entitise.size() > 0) {  	
			   Teacher entity = entitise.get(0);  	
		     return entity;  		 
		 }  		 
		 return null;  
	}

	public List queryTragetTeacher(String t_no) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Teacher as tea where tea.t_no=?",t_no); 
	}

	public void saveTeacher(Teacher t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(t);
	}

	public void updateTeacher(Teacher t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(t);
	}

	public Teacher queryTeacherByID(String t_no) {
		// TODO Auto-generated method stub
		List<Teacher> entitise=getHibernateTemplate().find("from Teacher as tea where tea.t_no=?",t_no);  		 
		   if (entitise.size() > 0) {  		 
			   Teacher entity = entitise.get(0);
		     return entity;  		 
		 }  		 
		 return null;  
	}

	public List queryTeacherByName(String t_name) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Teacher as tea where tea.t_name=?",t_name);
	}
	
}
