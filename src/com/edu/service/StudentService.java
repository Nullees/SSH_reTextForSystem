package com.edu.service;

import java.util.List;

import com.edu.po.Student;


public interface StudentService {
	//���ѧ��
	public void addStudentScheduled(Student s);
	
	//ɾ��ѧ��
	public void deleteStudentScheduled(String s_no);
	
	//����ѧ��
	public void updateStudentScheduled(Student s);
	
	//��ѯ����ѧ��
	public List queryAllStudentScheduled();
	
	//��ѯĿ��ѧ��
	public List queryTargetStudentScheduled(String s_no);
	
	//��id��ѯѧ��
	public Student queryStudentScheduledByID(String s_no);
	
	//�Ƿ������½
	public boolean isStudentLogin(String s_name,String s_password);
	
	//����ѧ�������������֤���룬�ֻ��������ѧ������
	public Student queryStudentScheduledByNameAndIdentityAndPhone(String s_name,String s_identity,String s_phone);
	
	//����ѧ������������ѧ������
	public List queryStudentScheduledByName(String s_name);
	
	//ע�������Ա
	public boolean addStudent(Student s);
	
	//�Ƿ����������Աע��
	public boolean isStudentRegister(String s_name);
}
