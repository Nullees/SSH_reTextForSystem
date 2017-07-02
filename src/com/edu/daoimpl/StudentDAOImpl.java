package com.edu.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.edu.dao.StudentDAO;
import com.edu.po.Student;

public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO{

	public void deleteStudent(String s_no) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(Student.class,s_no));
	}

	public Student findStudent(String s_name) {
		// TODO Auto-generated method stub
		List entitise=getHibernateTemplate().find("from Student stu where stu.s_name=?", s_name);
		if(entitise!=null&&entitise.size()>=1){
			return (Student)entitise.get(0);
		}
		return null;
	}
	
	
	//调用Hibernate对象执行HQL语句查询所有学生对象，返回一个List对象结果
	public List queryAllStudent() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Student");
	}

	public Student queryStudentByID(String s_no) {
		// TODO Auto-generated method stub
		List<Student> entitise=getHibernateTemplate().find("from Student as stu where stu.s_no=?",s_no);  		 
		   if (entitise.size() > 0) {  		 
			   Student entity = entitise.get(0);
		     return entity;  		 
		 }  		 
		 return null;  
	}

	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(s);
	}

	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(s);
	}

	public Student queryStudentByIdentityAndPhoneAndName(String s_name,
			String s_identity, String s_phone) {
		// TODO Auto-generated method stub
		List<Student> entitise=getHibernateTemplate().find("from  Student as stu where stu.s_name = ?  and stu.s_identity = ? and stu.s_phone = ?",new String[]{s_name,s_identity,s_phone});
		   if (entitise.size() > 0) {  	
			   Student entity = entitise.get(0);  	
		     return entity;  		 
		 }  		 
		 return null;  
	}

	public List queryTargetStudent(String s_no) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Student as stu where stu.s_no=?",s_no); 
	}

	public List queryStudentByName(String s_name) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Student as stu where stu.s_name=?",s_name);
	}
	
}
