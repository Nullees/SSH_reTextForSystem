package com.edu.service;

import java.util.List;

import com.edu.po.Location;

public interface LocationService {
	//��Ӷ�λ�ֶ�
	public void addLocationScheduled(Location l);
	
	//ɾ����λ�ֶ�
	public void deleteLocationScheduled(int l_no);
	
	//���¶�λ�ֶ�
	public void updateLocationSecheduled(Location l);
	
	//��ѯ���ж�λ�ֶ�
	public List queryAllLocationSecheduled();
	
	//��ѯĿ�궨λ�ֶ�
	public List queryTargetLocationSecheduledByID(int l_no);
	
	//����l_no��ѯ��λ�ֶ�
	public Location queryLocationSecheduledByID(int l_no);
	
	//����s_no��ѯ��λ�ֶ�
	public Location queryLocationSecheduledByS_no(String s_no);
	
	//����s_no��ѯĿ�궨λ�ֶ�
	public List queryTargetLocationSecheduledByS_No(String s_no);
}
