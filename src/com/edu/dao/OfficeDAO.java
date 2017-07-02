package com.edu.dao;

import java.util.List;

import com.edu.po.Office;

public interface OfficeDAO {
	//��ӽ�����Ա
	public void saveOffice(Office o);
	
	//ɾ��������Ա
	public void deleteOffice(String o_no);
	
	//��ѯ���н�����Ա
	public List queryAllOffice();
	
	//����o_no��ѯ������Ա
	public Office queryOfficeByID(String o_no);
	
	//���½���
	public void updateOffice(Office o);
	
	//����o_no��ѯĿ�������Ա
	public List queryTargetOfficeByID(String o_no);
	
	//���ݽ�����Ա��������ѧ��
	public Office findOffice(String o_name);
	
	//���ݽ�����Ա������������Ա���֤���룬������Ա�绰������ҽ�����Ա
	public Office queryStudentByIdentityAndPhoneAndName(String o_name,String o_identity,String o_phone);
	
	//���ݽ�����Ա�������ҽ�����Ա
	public List queryOfficeByName(String o_name);
	
	
}
