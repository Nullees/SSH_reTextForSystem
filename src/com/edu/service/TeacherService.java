package com.edu.service;

import java.util.List;

import com.edu.po.Teacher;

public interface TeacherService {
	//��ӽ�ʦ
	public void addTeacherScheduled(Teacher t);
	
	//ɾ����ʦ
	public void deleteTeacherScheduled(String t_no);
	
	//����ѧ��
	public void updateTeacherScheduled(Teacher t);
	
	//��ѯ����ѧ��
	public List queryAllTeacherScheduled();
	
	//��ѯĿ���ʦ
	public List queryTargetTeacherScheduled(String t_no);
	
	//��id��ѯ��ʦ
	public Teacher queryTeacherScheduledByID(String t_no);
	
	//�Ƿ������½
	public boolean isTeacherLogin(String t_name,String t_password);
	
	//���ݽ�ʦ��������ʦ���֤���룬��ʦ�ֻ������ѯĿ���ʦ
	public Teacher queryTeacherScheduledByNameAndIdentityAndPhone(String t_name,String t_identity,String t_phone);
	
	//���ݽ�ʦ���������ҽ�ʦ����
	public List queryStudentScheduledByName(String t_name);
	
	//�Ƿ������ʦ����ע��
	public boolean isTeacherRegister(String t_name);
	
	//ע���ʦ
	public boolean addTeacher(Teacher t);
}
