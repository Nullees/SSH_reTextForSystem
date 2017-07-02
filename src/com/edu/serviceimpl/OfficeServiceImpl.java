package com.edu.serviceimpl;

import java.util.List;

import com.edu.dao.OfficeDAO;
import com.edu.po.Office;
import com.edu.service.OfficeService;

public class OfficeServiceImpl implements OfficeService{
	private OfficeDAO officeDAO;

	public void setOfficeDAO(OfficeDAO officeDAO) {
		this.officeDAO = officeDAO;
	}

	public void addOfficeScheduled(Office o) {
		// TODO Auto-generated method stub
		if(officeDAO.queryOfficeByID(o.getO_no())==null){
			officeDAO.saveOffice(o);
		}else{
			System.out.println("该教务处人员已经存在!");
		}
	}

	public void deleteStudentScheduled(String o_no) {
		// TODO Auto-generated method stub
		if(officeDAO.queryOfficeByID(o_no)!=null){
			officeDAO.deleteOffice(o_no);
		}else{
			System.out.println("该教务处人员不存在!");
		}
	}

	public List queryAllOfficeScheduled() {
		// TODO Auto-generated method stub
		return officeDAO.queryAllOffice();
	}

	public Office queryOfficeScheduledByID(String o_no) {
		// TODO Auto-generated method stub
		return officeDAO.queryOfficeByID(o_no);
	}

	public List queryTargetOfficeScheduledByID(String o_no) {
		// TODO Auto-generated method stub
		return officeDAO.queryTargetOfficeByID(o_no);
	}

	public boolean isOfficeLogin(String o_name, String o_password) {
		// TODO Auto-generated method stub
		Office office=officeDAO.findOffice(o_name);
		//验证密码
		if(office!=null&&o_password.equals(office.getO_password())){
			return true;
		}
		return false;
	}

	public List queryOfficeScheduledByName(String o_name) {
		// TODO Auto-generated method stub
		return officeDAO.queryOfficeByName(o_name);
	}

	public Office queryOfficeScheduledByNameAndIdentityAndPhone(String o_name,
			String o_identity, String o_phone) {
		// TODO Auto-generated method stub
		if(o_name!=null&&o_identity!=null&&o_phone!=null){
			return officeDAO.queryStudentByIdentityAndPhoneAndName(o_name, o_identity, o_phone);
		}else{
			System.out.println("所查找的教务处人员对象不存在");
		}
		return null;
	}

	public boolean addOffice(Office o) {
		// TODO Auto-generated method stub
		//查找该教务处人员名称
		Office oldOffice=officeDAO.findOffice(o.getO_name());
		
		//如果存在，则返回false
		if(oldOffice!=null){
			return false;
		}
		
		//如果不存在，则返回true,并且将对象存入数据库中
		officeDAO.saveOffice(o);
		return true;
	}

	public boolean isOfficeRegister(String o_name) {
		// TODO Auto-generated method stub
		//查找该教务处人员名称
		Office office=officeDAO.findOffice(o_name);
		
		//如果存在，则返回false
		if(office!=null){
			return false;
		}
		
		//如果不存在，则返回true
		return true;
	}
	
	//更新教务处人员字段
	public void updateOfficeScheduled(Office o) {
		// TODO Auto-generated method stub
		officeDAO.updateOffice(o);
	}
	
	
	
}
