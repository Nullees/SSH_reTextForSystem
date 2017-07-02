package com.edu.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edu.dao.CourseDAO;
import com.edu.po.Course;

public class CourseDAOImpl extends HibernateDaoSupport implements CourseDAO{

	public void deleteCourse(String c_no) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Course.class, c_no));
	}
	
	//List对象方法，调用Hibernate语句查询数据库，返回得到Dao类型的字段
	public List queryAllCourse() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Course");
	}

	public Course queryCourseByID(String c_no) {
		// TODO Auto-generated method stub
		List<Course> entitise=getHibernateTemplate().find("from Course as cou where cou.c_no=?",c_no);  		 
		   if (entitise.size() > 0) {  		 
			   Course entity = entitise.get(0);
		     return entity;  		 
		 }  		 
		 return null; 
	}

	public List queryTargetCourseByID(String c_no) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Course as cou where cou.c_no=?",c_no); 
	}

	public void saveCourse(Course c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(c);
	}

	public void updateCouse(Course c) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(c);
	}

}
