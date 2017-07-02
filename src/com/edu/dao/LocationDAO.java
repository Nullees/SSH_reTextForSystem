package com.edu.dao;

import java.util.List;

import com.edu.po.Location;

public interface LocationDAO {
	//��Ӷ�λ�ֶ�
	public void saveLocation(Location l);
	
	//ɾ����λ�ֶ�
	public void deleteLocation(int l_no);
	
	//���¶�λ�ֶ�
	public void updateLocation(Location l);
	
	//��ѯ���ж�λ�ֶ�
	public List queryAllLocation();
	
	//���ݶ�λ��Ų�ѯĿ�궨λ�ֶ�
	public List queryTargetLocationByID(int l_no);
	
	//���ݶ�λ��Ų�ѯ��λ�ֶ�
	public Location queryLocationByID(int l_no);
	
	//����ѧ����Ų��Ҷ�λ�ֶ�
	public Location queryLocationByS_No(String s_no);
	
	//����������Ų�ѯĿ�궨λ�ֶ�
	public List queryTargetLocationByS_No(String s_no);
}
