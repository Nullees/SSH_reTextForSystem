package com.edu.dao;

import java.util.List;

import com.edu.po.Course;

public interface CourseDAO {
	//添加课程 
	public void saveCourse(Course c);
	
	//删除课程
	public void deleteCourse(String c_no);
	
	//更新课程
	public void updateCouse(Course c);
	
	//查询所有学生
	public List queryAllCourse();
	
	//查询目标学生
	public List queryTargetCourseByID(String c_no);
	
	//按照id查询学生
	public Course queryCourseByID(String c_no);
	
}
