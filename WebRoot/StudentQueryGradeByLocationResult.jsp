<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生根据定位信息查询成绩结果</title>
    
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
  		<s:iterator value="#request.name" id="student">
   	你好,<s:property value="#student.s_name"/>
   	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     &nbsp;&nbsp;          &nbsp;       &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
    <a href="index.jsp">退出登录</a>
   	
   
   <hr>
    <a href="studentfindobjectbyname.action?s_no=<s:property value='#student.s_no'/>">上传作业</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="courseshowAll.action?s_no=<s:property value='#student.s_no'/>">选课</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="studentquerygradebyloction.action?s_no=<s:property value='#student.s_no'/>">查询成绩</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="studentdownloadhomeworkfromteacher.action?s_no=<s:property value='#student.s_no'/>">下载教师所布置的作业</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	<a href="studentqueryofficenotice.action?s_no=<s:property value='#student.s_no'/>">查看公告板</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <hr>
   <center>
   <s:iterator value="#request.tar" id="location">
   <h2>你好,你所选课程的成绩为：<s:property value="#location.l_grade"/></h2>
   
   <h2>学年：<s:property value="#location.l_year"/></h2>
   
   <h2>学期：<s:property value="#location.l_term"/></h2>
   
   <h2>是否重修：<s:property value="#location.l_rebulid"/></h2>
   </s:iterator>
   
   </center>
   <hr>
	<center>
    	 Copyright &copy;2014-2015 BAWSI
   			 All rights reserved.Used with permission.<br/>
   			 780840384@qq.com<br />
   			 计算机科学与技术系<br />张晓灵 1208010131<br/>王玉婷 1208010124<br/>张观凤 1208010128<br/>
   			 2015-06-08
    </center>
    </s:iterator>
  </body>
</html>
