package com.edu.dao;

import java.util.List;

import com.edu.po.Office;

public interface OfficeDAO {
	//添加教务处人员
	public void saveOffice(Office o);
	
	//删除教务处人员
	public void deleteOffice(String o_no);
	
	//查询所有教务处人员
	public List queryAllOffice();
	
	//根据o_no查询教务处人员
	public Office queryOfficeByID(String o_no);
	
	//更新教务处
	public void updateOffice(Office o);
	
	//根据o_no查询目标教务处人员
	public List queryTargetOfficeByID(String o_no);
	
	//根据教务处人员姓名查找学生
	public Office findOffice(String o_name);
	
	//根据教务处人员姓名，教务处人员身份证号码，教务处人员电话号码查找教务处人员
	public Office queryStudentByIdentityAndPhoneAndName(String o_name,String o_identity,String o_phone);
	
	//根据教务处人员姓名查找教务处人员
	public List queryOfficeByName(String o_name);
	
	
}
