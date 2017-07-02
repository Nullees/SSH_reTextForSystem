package com.edu.dao;

import java.util.List;

import com.edu.po.Course;

public interface CourseDAO {
	//��ӿγ� 
	public void saveCourse(Course c);
	
	//ɾ���γ�
	public void deleteCourse(String c_no);
	
	//���¿γ�
	public void updateCouse(Course c);
	
	//��ѯ����ѧ��
	public List queryAllCourse();
	
	//��ѯĿ��ѧ��
	public List queryTargetCourseByID(String c_no);
	
	//����id��ѯѧ��
	public Course queryCourseByID(String c_no);
	
}
