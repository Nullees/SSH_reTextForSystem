package com.edu.action;

import java.util.regex.Pattern;

import com.edu.po.Office;
import com.edu.service.OfficeService;
import com.opensymphony.xwork2.ActionSupport;

public class OfficeRegisterAction extends ActionSupport{
	private String o_name;
	private String o_no;
	private String o_identity;
	private String o_password;
	private String o_repassword;
	private String o_phone;
	
	//业务逻辑组件
	private OfficeService officeService;
	//设置业务逻辑组件
	public void setOfficeService(OfficeService officeService) {
		this.officeService = officeService;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String oName) {
		o_name = oName;
	}
	public String getO_no() {
		return o_no;
	}
	public void setO_no(String oNo) {
		o_no = oNo;
	}
	public String getO_identity() {
		return o_identity;
	}
	public void setO_identity(String oIdentity) {
		o_identity = oIdentity;
	}
	public String getO_password() {
		return o_password;
	}
	public void setO_password(String oPassword) {
		o_password = oPassword;
	}
	public String getO_repassword() {
		return o_repassword;
	}
	public void setO_repassword(String oRepassword) {
		o_repassword = oRepassword;
	}
	public String getO_phone() {
		return o_phone;
	}
	public void setO_phone(String oPhone) {
		o_phone = oPhone;
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
		Office office=new Office();
		
		office.setO_identity(o_identity);
		office.setO_name(o_name);
		office.setO_no(o_no);
		office.setO_password(o_password);
		office.setO_phone(o_phone);
		office.setO_repassword(o_repassword);
		
		//添加教务处人员失败
		if(!officeService.addOffice(office)){
			addActionError("注册失败");
		}else{
			//添加教务处人员成功
			return SUCCESS;
		}
		return ERROR;
		
	}
	
}
