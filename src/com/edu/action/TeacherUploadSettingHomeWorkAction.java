package com.edu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Teacher;
import com.edu.service.TeacherService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherUploadSettingHomeWorkAction extends ActionSupport{
	//设置数据库保存路径
	private String t_uploadhomework;
	//设置教师字段编号
	private String t_no;
	//设置文件名
	private String title;
	//设置文件
	private File upload;
	//设置上传文件名称
	private String uploadFileName;
	//接受依赖注入的属性
	private String savePath;
	//逻辑业务组件
	TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	//接受依赖注入的方法
    public void setSavePath(String value) {
        this.savePath = value;
    }
    private String getSavePath() throws Exception {
        return ServletActionContext.getRequest().getRealPath(savePath);
    }
	public String getT_uploadhomework() {
		return t_uploadhomework;
	}
	public void setT_uploadhomework(String t_uploadhomework) {
		this.t_uploadhomework = t_uploadhomework;
	}
	public String getT_no() {
		return t_no;
	}
	public void setT_no(String t_no) {
		this.t_no = t_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
    
	public String execute() throws Exception {
		List name=teacherService.queryTargetTeacherScheduled(t_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		
		Teacher t=teacherService.queryTeacherScheduledByID(t_no);
		t.setT_uploadhomework("TeacherUploadHomeWork/"+getUploadFileName());
		teacherService.updateTeacherScheduled(t);
		
        // 以服务器的文件保存地址和原文件名建立上传文件输出流
        FileOutputStream fos = new FileOutputStream(getSavePath() + "//"+ getUploadFileName());
        FileInputStream fis = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        
        //关闭输入输出流
        fis.close();
        
        fos.close();
        
        return SUCCESS;
    }
}
