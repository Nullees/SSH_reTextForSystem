package com.edu.service;

import java.util.List;

import com.edu.po.Course;

public interface CourseService {
	//添加课程
	public void addCourseScheduled(Course c);
	
	//删除课程
	public void deleteCourseScheduled(String c_no);
	
	//更新课程
	public void updateCourseScheduled(Course c);
	
	//查询所有课程
	public List queryAllCourseScheduled();
	
	//查询目标课程
	public List queryTragetCourseScheduled(String c_no);
	
	//按照id查询课程
	public Course queryCourseScheduledByID(String c_no);
	
}
