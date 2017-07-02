package com.edu.dao;

import java.util.List;

import com.edu.po.Teacher;

public interface TeacherDAO {
	//��ӽ�ʦ
	public void saveTeacher(Teacher t);
	
	//���ݽ�ʦ�������ҽ�ʦ
	public Teacher findTeacher(String t_name);
	
	//ɾ����ʦ
	public void deleteTeacher(String t_no);
	
	//���½�ʦ
	public void updateTeacher(Teacher t);
	
	//��ѯ���н�ʦ
	public List queryAllTeacher();
	
	//��ѯĿ���ʦ
	public List queryTragetTeacher(String t_no);
	
	//���ս�ʦ��������ʦ���֤����ͽ�ʦ�绰������ҽ�ʦ
	public Teacher queryTeacherByNameAndIdentityAndPhone(String t_name,String t_identity,String t_phone);
	
	//��t_no��ѯ��ʦ
	public Teacher queryTeacherByID(String t_no);
	
	//���ս�ʦ�������ҽ�ʦ
	public List queryTeacherByName(String t_name);
}
