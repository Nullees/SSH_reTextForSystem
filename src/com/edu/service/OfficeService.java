package com.edu.service;

import java.util.List;

import com.edu.po.Office;
import com.edu.po.Student;

public interface OfficeService {
	//��ӽ�����Ա
	public void addOfficeScheduled(Office o);
	
	//ɾ��������Ա
	public void deleteStudentScheduled(String o_no);
	
	//��ѯ���н�����Ա
	public List queryAllOfficeScheduled();
	
	//����o_no��ѯ������Ա
	public Office queryOfficeScheduledByID(String o_no);
	
	//����o_no��ѯĿ�������Ա
	public List queryTargetOfficeScheduledByID(String o_no);
	
	//�Ƿ������½
	public boolean isOfficeLogin(String o_name,String o_password);
	
	//ע�������Ա
	public boolean addOffice(Office o);
	
	//�Ƿ����������Աע��
	public boolean isOfficeRegister(String o_name);
	
	//���ݽ�����Ա���������ҽ�����Ա����
	public List queryOfficeScheduledByName(String o_name);
	
	//���ݽ�����Ա�����������֤���룬�ֻ�������ҽ�����Ա����
	public Office queryOfficeScheduledByNameAndIdentityAndPhone(String o_name,String o_identity,String o_phone);
	
	//���½���
	public void updateOfficeScheduled(Office o);
}
