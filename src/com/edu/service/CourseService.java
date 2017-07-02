package com.edu.service;

import java.util.List;

import com.edu.po.Course;

public interface CourseService {
	//��ӿγ�
	public void addCourseScheduled(Course c);
	
	//ɾ���γ�
	public void deleteCourseScheduled(String c_no);
	
	//���¿γ�
	public void updateCourseScheduled(Course c);
	
	//��ѯ���пγ�
	public List queryAllCourseScheduled();
	
	//��ѯĿ��γ�
	public List queryTragetCourseScheduled(String c_no);
	
	//����id��ѯ�γ�
	public Course queryCourseScheduledByID(String c_no);
	
}
