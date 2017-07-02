package com.edu.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.edu.po.Student;
import com.edu.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentUploadFilesAction extends ActionSupport{
	//设置数据库保存路径
	private String s_path;
	//设置学生字段编号
	private String s_no;
	//设置文件名
	private String title;
	//设置文件
	private File upload;
	//设置上传文件类型
	//private String uploadContentType;
	//设置上传文件名称
    private String uploadFileName;
    
    //接受依赖注入的属性
    private String savePath;
    
    //业务逻辑组件
    private StudentService studentService;
   
    //设置业务逻辑组件的方法
    public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	//接受依赖注入的方法
    public void setSavePath(String value) {
        this.savePath = value;
    }
    private String getSavePath() throws Exception {
        return ServletActionContext.getRequest().getRealPath(savePath);
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
//	public String getUploadContentType() {
//		return uploadContentType;
//	}
//	public void setUploadContentType(String uploadContentType) {
//		this.uploadContentType = uploadContentType;
//	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	
	public String getS_path() {
		return s_path;
	}
	public void setS_path(String sPath) {
		s_path = sPath;
	}
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
	}
	public String execute() throws Exception {
		List name=studentService.queryTargetStudentScheduled(s_no);
		ServletActionContext.getRequest().setAttribute("name",name);
		Student s=studentService.queryStudentScheduledByID(s_no);
		s.setS_path("StudentUpload/"+getUploadFileName());
		studentService.updateStudentScheduled(s);
		
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
