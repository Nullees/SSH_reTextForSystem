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
	
//	//输入校验方法
//	public void validate(){
//		if(o_name==null||"".equals(o_name)){
//			this.addFieldError("o_name", "用户名必须输入");
//		}else if(!Pattern.matches("\\w{6,20}", o_name.trim())){
//			this.addFieldError("o_name", "用户名必须是数字和字母，长度为6到20之间");
//		}
//		if(o_password==null||"".equals(o_password)){
//			this.addFieldError("o_password", "密码必须输入");
//		}else if(!Pattern.matches("\\w{6,20}", o_password.trim())){
//			this.addFieldError("o_password", "密码必须是数字和字母，长度为6到20之间");
//		}
//		if(o_repassword==null||"".equals(o_repassword)){
//			this.addFieldError("o_repassword", "确认密码必须输入");
//		}else if(!Pattern.matches("\\w{6,20}", o_repassword.trim())){
//			this.addFieldError("o_repassword", "确认密码必须是数字和字母，长度为6到20之间");
//		}
//		if(o_password!=null&&o_repassword!=null&&!o_repassword.equals(o_password)){
//			this.addFieldError("o_repassword", "确认密码和密码必须相同");
//		}
//		if(o_phone.length()!=11){
//			this.addFieldError("o_phone", "请输入有效的手机号码，应该为11位手机");
//		}
//		if(o_identity.length()!=18){
//			this.addFieldError("o_identity", "请输入有效的证件号码，应该为18位证件");
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
		
		//添加教师失败
		if(!teacherService.addTeacher(teacher)){
			addActionError("注册失败");
		}else{
			//添加教师成功
			return SUCCESS;
		}
		return ERROR;
	}

	
}
