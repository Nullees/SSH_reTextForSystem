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
    
    <title>教师下载学生作业</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	<center>	
   		<h1>学生作业下载</h1>
   			<a href="StudentUpload/xx.xls">下载学生作业</a>
   	</center>
	
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
    	<a href="teacherqueryofficenotice.action?t_no=<s:property value='#teacher.t_no'/>">查看公告板</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	<hr/>
   	<center>
   		<h2>学生作业列表</h2>
   		<table border="1">
   			<tr>
   				<td>学生姓名</td>
   				<td>学生所属学院</td>
   				<td>学生所属系别</td>
   				<td>学生作业</td>
   			</tr>
   			<s:iterator value="#request.dow" id="file">
   				<tr>
   					<td><s:property value="#file.s_name"/></td>
   					<td><s:property value="#file.s_college"/></td>
   					<td><s:property value="#file.s_department"/></td>
   					<td><a href="<s:property value="#file.s_path"/>">下载学生作业</a></td>
   				</tr>
   			</s:iterator>
   		</table>
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
