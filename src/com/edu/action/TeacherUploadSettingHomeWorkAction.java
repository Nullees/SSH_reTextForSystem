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
	//�������ݿⱣ��·��
	private String t_uploadhomework;
	//���ý�ʦ�ֶα��
	private String t_no;
	//�����ļ���
	private String title;
	//�����ļ�
	private File upload;
	//�����ϴ��ļ�����
	private String uploadFileName;
	//��������ע�������
	private String savePath;
	//�߼�ҵ�����
	TeacherService teacherService;
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	//��������ע��ķ���
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
		
        // �Է��������ļ������ַ��ԭ�ļ��������ϴ��ļ������
        FileOutputStream fos = new FileOutputStream(getSavePath() + "//"+ getUploadFileName());
        FileInputStream fis = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, len);
        }
        
        //�ر����������
        fis.close();
        
        fos.close();
        
        return SUCCESS;
    }
}
