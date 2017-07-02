package com.edu.serviceimpl;

import java.util.List;

import com.edu.dao.CourseDAO;
import com.edu.po.Course;
import com.edu.service.CourseService;

public class CourseServiceImpl implements CourseService{
	
	private CourseDAO courseDAO;

	public void setCourseDAO(CourseDAO courseDAO) {
		this.courseDAO = courseDAO;
	}

	public void addCourseScheduled(Course c) {
		// TODO Auto-generated method stub
		if(courseDAO.queryCourseByID(c.getC_no())==null){
			courseDAO.saveCourse(c);
		}else{
			System.out.println("该课程已经存在!");
		}
	}

	public void deleteCourseScheduled(String c_no) {
		// TODO Auto-generated method stub
		if(courseDAO.queryCourseByID(c_no)!=null){
			courseDAO.deleteCourse(c_no);
		}else{
			System.out.println("该课程不存在");
		}
	}
	
	//返回了一个List对象的方法
	public List queryAllCourseScheduled() {
		// TODO Auto-generated method stub
		return courseDAO.queryAllCourse();
	}

	public Course queryCourseScheduledByID(String c_no) {
		// TODO Auto-generated method stub
		return courseDAO.queryCourseByID(c_no);
	}

	public List queryTragetCourseScheduled(String c_no) {
		// TODO Auto-generated method stub
		return courseDAO.queryTargetCourseByID(c_no);
	}

	public void updateCourseScheduled(Course c) {
		// TODO Auto-generated method stub
		courseDAO.updateCouse(c);
	}

}
