package com.edu.dao;

import java.util.List;

import com.edu.po.Student;


public interface StudentDAO {
	//���ѧ��
	public void saveStudent(Student s);
	
	//����ѧ����������ѧ��
	public Student findStudent(String s_name);
	
	//ɾ��ѧ��
	public void deleteStudent(String s_no);
	
	//����ѧ��
	public void updateStudent(Student s);
	
	//��ѯ����ѧ��
	public List queryAllStudent();
	
	//��ѯĿ��ѧ��
	public List queryTargetStudent(String s_no);
	
	//��s_no��ѯѧ��
	public Student queryStudentByID(String s_no);
	
	//����ѧ��������ѧ�����֤���룬ѧ���绰�������ѧ��
	public Student queryStudentByIdentityAndPhoneAndName(String s_name,String s_identity,String s_phone);
	
	//����ѧ����������ѧ��
	public List queryStudentByName(String s_name);
}
