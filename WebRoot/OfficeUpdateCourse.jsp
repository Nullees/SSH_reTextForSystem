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
    
    <title>教务处更新课程</title>
    
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
    请输入以下的课程信息，以便更新该课程信息<br />
    <hr>
    <center>
    	<h2>更新课程</h2>
    	<s:form action="officeupdatecourse.action" method="post">
    		<s:set name="c_no" value="#parameters.c_no[0]"></s:set>
    		<s:set name="o_no" value="#parameters.o_no[0]"></s:set>
    		<s:textfield label="课程编号" name="c_no"></s:textfield>  
    		<s:textfield label="教务处人员编号" name="o_no"></s:textfield>  		
			<s:textfield label="课程名称" name="c_name"></s:textfield>			
    		<s:textfield label="课程成绩" name="c_credit"></s:textfield>  		
    		<s:textfield label="上课时间" name="c_time"></s:textfield>
    		<s:textfield label="上课地点" name="c_point"></s:textfield>
    		<s:textfield label="课程类型" name="c_type"></s:textfield>
    		<s:textfield label="任课老师编号" name="t_no"></s:textfield>
    		<s:submit value="更新"></s:submit>
    		<s:reset value="重置"></s:reset>
    	</s:form>
    </center>
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
