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
    
    <title>教务处更新学生信息</title>
    
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
    请输入以下的学生信息，以便更新该学生信息<br />
    <hr>
    <center>
    	<h2>更新学生</h2>
    	<s:form action="officeupdatestudent.action" method="post">
    		<s:set name="s_no" value="#parameters.s_no[0]"></s:set>
    		<s:set name="o_no" value="#parameters.o_no[0]"></s:set>
    		<s:textfield label="学生编号" name="s_no"></s:textfield>  	
    		<s:textfield label="教务处人员编号" name="o_no"></s:textfield>  			
			<s:textfield label="学生姓名" name="s_name"></s:textfield>			
    		<s:textfield label="学生性别" name="s_gender"></s:textfield>  		
    		<s:textfield label="学生出生日期" name="s_birth"></s:textfield>
    		<s:textfield label="学生地址" name="s_address"></s:textfield>
    		<s:textfield label="学生身份证号码" name="s_identity"></s:textfield>
    		<s:textfield label="学生手机号码" name="s_phone"></s:textfield>
    		<s:textfield label="学生入学时间" name="s_intime"></s:textfield>
    		<s:textfield label="学生离校时间" name="s_outtime"></s:textfield>
    		<s:textfield label="学生院系" name="s_college"></s:textfield>
    		<s:textfield label="学生系别" name="s_department"></s:textfield>
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
