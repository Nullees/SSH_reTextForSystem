package com.edu.action;

import com.edu.po.Teacher;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeRegisterTeacherAction extends ActionSupport{
	private String t_no;
	private String t_name;
	private String t_gender;
	private String t_birth;
	private String t_phone;
	private String t_identity;
	private String t_department;
	private String t_post;
	private String t_password;
	private String t_repassword;
	
	private TeacherService teacherService;

	public String getT_no() {
		return t_no;
	}

	public void setT_no(String t_no) {
		this.t_no = t_no;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_gender() {
		return t_gender;
	}

	public void setT_gender(String t_gender) {
		this.t_gender = t_gender;
	}

	public String getT_birth() {
		return t_birth;
	}

	public void setT_birth(String t_birth) {
		this.t_birth = t_birth;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

	public String getT_identity() {
		return t_identity;
	}

	public void setT_identity(String t_identity) {
		this.t_identity = t_identity;
	}

	public String getT_department() {
		return t_department;
	}

	public void setT_department(String t_department) {
		this.t_department = t_department;
	}

	public String getT_post() {
		return t_post;
	}

	public void setT_post(String t_post) {
		this.t_post = t_post;
	}

	public String getT_password() {
		return t_password;
	}

	public void setT_password(String t_password) {
		this.t_password = t_password;
	}

	public String getT_repassword() {
		return t_repassword;
	}

	public void setT_repassword(String t_repassword) {
		this.t_repassword = t_repassword;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
//	//����У�鷽��
//	public void validate(){
//		if(o_name==null||"".equals(o_name)){
//			this.addFieldError("o_name", "�û�����������");
//		}else if(!Pattern.matches("\\w{6,20}", o_name.trim())){
//			this.addFieldError("o_name", "�û������������ֺ���ĸ������Ϊ6��20֮��");
//		}
//		if(o_password==null||"".equals(o_password)){
//			this.addFieldError("o_password", "�����������");
//		}else if(!Pattern.matches("\\w{6,20}", o_password.trim())){
//			this.addFieldError("o_password", "������������ֺ���ĸ������Ϊ6��20֮��");
//		}
//		if(o_repassword==null||"".equals(o_repassword)){
//			this.addFieldError("o_repassword", "ȷ�������������");
//		}else if(!Pattern.matches("\\w{6,20}", o_repassword.trim())){
//			this.addFieldError("o_repassword", "ȷ��������������ֺ���ĸ������Ϊ6��20֮��");
//		}
//		if(o_password!=null&&o_repassword!=null&&!o_repassword.equals(o_password)){
//			this.addFieldError("o_repassword", "ȷ����������������ͬ");
//		}
//		if(o_phone.length()!=11){
//			this.addFieldError("o_phone", "��������Ч���ֻ����룬Ӧ��Ϊ11λ�ֻ�");
//		}
//		if(o_identity.length()!=18){
//			this.addFieldError("o_identity", "��������Ч��֤�����룬Ӧ��Ϊ18λ֤��");
//		}
//	}
	
	public String execute()throws Exception{
		Teacher teacher=new Teacher();
		
		teacher.setT_birth(t_birth);
		teacher.setT_department(t_department);
		teacher.setT_gender(t_gender);
		teacher.setT_identity(t_identity);
		teacher.setT_name(t_name);
		teacher.setT_no(t_no);
		teacher.setT_password(t_password);
		teacher.setT_repassword(t_repassword);
		teacher.setT_phone(t_phone);
		teacher.setT_post(t_post);
		
		//��ӽ�ʦʧ��
		if(!teacherService.addTeacher(teacher)){
			addActionError("ע��ʧ��");
		}else{
			//��ӽ�ʦ�ɹ�
			return SUCCESS;
		}
		return ERROR;
	}

	
}
