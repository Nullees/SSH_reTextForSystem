package com.edu.serviceimpl;

import java.util.List;

import com.edu.dao.StudentDAO;
import com.edu.po.Student;
import com.edu.service.StudentService;

public class StudentServiceImpl implements StudentService{
	private StudentDAO studentDAO;
	
	public void setStudentDAO(StudentDAO studentDAO){
		this.studentDAO=studentDAO;
	}
	
	public void addStudentScheduled(Student s) {
		// TODO Auto-generated method stub
		if(studentDAO.queryStudentByID(s.getS_no())==null){
			studentDAO.saveStudent(s);
		}else{
			System.out.println("��ѧ���Ѿ�����!");
		}
	}

	public void deleteStudentScheduled(String s_no) {
		// TODO Auto-generated method stub
		if(studentDAO.queryStudentByID(s_no)!=null){
			studentDAO.deleteStudent(s_no);
		}else{
			System.out.println("��ѧ��������!");
		}
	}

	public boolean isStudentLogin(String s_name, String s_password) {
		// TODO Auto-generated method stub
		Student student=studentDAO.findStudent(s_name);
		//��֤����
		if(student!=null&&s_password.equals(student.getS_password())){
			return true;
		}
		return false;
	}
	
	//��ѯ����ѧ������
	public List queryAllStudentScheduled() {
		// TODO Auto-generated method stub
		return studentDAO.queryAllStudent();
	}

	public Student queryStudentScheduledByID(String s_no) {
		// TODO Auto-generated method stub
		return studentDAO.queryStudentByID(s_no);
	}

	public void updateStudentScheduled(Student s) {
		// TODO Auto-generated method stub
		studentDAO.updateStudent(s);
	}

	public Student queryStudentScheduledByNameAndIdentityAndPhone(
			String s_name, String s_identity, String s_phone) {
		// TODO Auto-generated method stub
		if(s_name!=null&&s_identity!=null&&s_phone!=null){
			return studentDAO.queryStudentByIdentityAndPhoneAndName(s_name, s_identity, s_phone);
		}else{
			System.out.println("�����ҵ�ѧ�����󲻴���");
		}
		return null;
	}

	public List queryTargetStudentScheduled(String s_no) {
		// TODO Auto-generated method stub
		return studentDAO.queryTargetStudent(s_no);
	}

	public List queryStudentScheduledByName(String s_name) {
		// TODO Auto-generated method stub
		return studentDAO.queryStudentByName(s_name);
	}

	public boolean addStudent(Student s) {
		// TODO Auto-generated method stub
		//���Ҹ�ѧ������
		Student oldStudent=studentDAO.findStudent(s.getS_name());
		
		//������ڣ��򷵻�false
		if(oldStudent!=null){
			return false;
		}
		
		//��������ڣ��򷵻�true,���ҽ�����������ݿ���
		studentDAO.saveStudent(s);
		return true;
	}

	public boolean isStudentRegister(String s_name) {
		// TODO Auto-generated method stub
		//���Ҹ�ѧ������
		Student student=studentDAO.findStudent(s_name);
		
		//������ڣ��򷵻�false
		if(student!=null){
			return false;
		}
		
		//���������,�򷵻�true
		return true;
	}
}
