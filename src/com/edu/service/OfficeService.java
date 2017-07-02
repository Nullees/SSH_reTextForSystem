package com.edu.service;

import java.util.List;

import com.edu.po.Office;
import com.edu.po.Student;

public interface OfficeService {
	//添加教务处人员
	public void addOfficeScheduled(Office o);
	
	//删除教务处人员
	public void deleteStudentScheduled(String o_no);
	
	//查询所有教务处人员
	public List queryAllOfficeScheduled();
	
	//按照o_no查询教务处人员
	public Office queryOfficeScheduledByID(String o_no);
	
	//按照o_no查询目标教务处人员
	public List queryTargetOfficeScheduledByID(String o_no);
	
	//是否允许登陆
	public boolean isOfficeLogin(String o_name,String o_password);
	
	//注册教务处人员
	public boolean addOffice(Office o);
	
	//是否允许教务处人员注册
	public boolean isOfficeRegister(String o_name);
	
	//根据教务处人员的姓名查找教务处人员对象
	public List queryOfficeScheduledByName(String o_name);
	
	//根据教务处人员的姓名，身份证号码，手机号码查找教务处人员对象
	public Office queryOfficeScheduledByNameAndIdentityAndPhone(String o_name,String o_identity,String o_phone);
	
	//更新教务处
	public void updateOfficeScheduled(Office o);
}
