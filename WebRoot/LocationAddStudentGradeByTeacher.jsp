<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教师输入学生成绩</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <img alt="松田教务系统" src="Img/index.jpg">
    <hr>
    	<s:iterator value="#request.tea" id="teacher">
    	你好,<s:property value="#teacher.t_name"/>
   	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     &nbsp;&nbsp;          &nbsp;       &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
    <a href="index.jsp">退出登录</a>
    <hr>
    	<a href="studentShowAll.action?t_no=<s:property value='#teacher.t_no'/>">查询学生花名册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="teacherdownloadfilesfromstudent.action?t_no=<s:property value='#teacher.t_no'/>">下载学生作业</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="teacherfindtargetbyt_no.action?t_no=<s:property value='#teacher.t_no'/>">布置作业</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="teacherfindtargetinuploadCoursebyt_no.action?t_no=<s:property value='#teacher.t_no'/>">上传课程资料</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="teacherquerystudentforscorehomework.action?t_no=<s:property value='#teacher.t_no'/>">学生作业成绩登记</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	<hr/>
   	
   <center>
   		<s:iterator value="#request.loc" id="location">
   		<h2>你好，请输入学生编号:<s:property value="#location.s_no"/>学生的成绩</h2>
   		<s:form action="locationaddstudentgrade.action" method="post" name="s_no">
   		<s:iterator value="#request.loc" id="location">
   			你好，请输入学生编号:<s:property value="#location.s_no"/>学生的成绩
   			<s:textfield label="学生编号" name="s_no" value="%{#location.s_no}" ></s:textfield>
   		</s:iterator>
    		<s:textfield label="成绩" name="l_grade"></s:textfield>
    	 	<s:textfield label="学年" name="l_year"></s:textfield>
    		<s:textfield label="学期" name="l_term"></s:textfield>
    		<s:textfield label="是否重修" name="l_rebulid"></s:textfield>
    		<s:submit value="提交"></s:submit>
    		<s:reset value="重置"></s:reset>
    	</s:form>
    	</s:iterator>
   </center>
   </s:iterator>
   <hr>
	<center>
    	 Copyright &copy;2014-2015 BAWSI
   			 All rights reserved.Used with permission.<br/>
   			 780840384@qq.com<br />
   			 计算机科学与技术系<br />张晓灵 1208010131<br/>王玉婷 1208010124<br/>张观凤 1208010128<br/>
   			 2015-06-08
    </center>
  </body>
</html>
