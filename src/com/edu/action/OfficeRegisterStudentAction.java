package com.edu.action;

import com.edu.po.Student;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeRegisterStudentAction extends ActionSupport{
	private String s_no;
	private String s_name;
	private String s_gender;
	private String s_birth;
	private String s_address;
	private String s_identity;
	private String s_phone;
	private String s_intime;
	private String s_outtime;
	private String s_college;
	private String s_department;
	private String s_password;
	private String s_repassword;
	
	private StudentService studentService;

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_gender() {
		return s_gender;
	}

	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}

	public String getS_birth() {
		return s_birth;
	}

	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getS_identity() {
		return s_identity;
	}

	public void setS_identity(String s_identity) {
		this.s_identity = s_identity;
	}

	public String getS_phone() {
		return s_phone;
	}

	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}

	public String getS_intime() {
		return s_intime;
	}

	public void setS_intime(String s_intime) {
		this.s_intime = s_intime;
	}

	public String getS_outtime() {
		return s_outtime;
	}

	public void setS_outtime(String s_outtime) {
		this.s_outtime = s_outtime;
	}

	public String getS_college() {
		return s_college;
	}

	public void setS_college(String s_college) {
		this.s_college = s_college;
	}

	public String getS_department() {
		return s_department;
	}

	public void setS_department(String s_department) {
		this.s_department = s_department;
	}

	public String getS_password() {
		return s_password;
	}

	public void setS_password(String s_password) {
		this.s_password = s_password;
	}

	public String getS_repassword() {
		return s_repassword;
	}

	public void setS_repassword(String s_repassword) {
		this.s_repassword = s_repassword;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
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
		Student student=new Student();
		
		student.setS_address(s_address);
		student.setS_birth(s_birth);
		student.setS_college(s_college);
		student.setS_department(s_department);
		student.setS_gender(s_gender);
		student.setS_identity(s_identity);
		student.setS_intime(s_intime);
		student.setS_name(s_name);
		student.setS_no(s_no);
		student.setS_outtime(s_outtime);
		student.setS_password(s_password);
		student.setS_phone(s_phone);
		student.setS_repassword(s_repassword);
		
		//添加学生失败
		if(!studentService.addStudent(student)){
			addActionError("注册失败");
		}else{
			//添加学生成功
			return SUCCESS;
		}
		return ERROR;
	}
}
