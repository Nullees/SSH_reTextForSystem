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
    
    <title>教务处人员注册</title>
    
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
  <hr/>
  <a href="index.jsp">返回主页</a>
  <hr/>
    <center>
    	<h2>用户注册</h2>
    	<div id="result" style="color:red"></div>
    		<s:form action="officeregister.action" method="post">
    			<s:textfield name="o_no" label="编号" ></s:textfield>
    			<s:textfield name="o_name" label="名称" ></s:textfield>
    			<s:password name="o_password" label="密码"></s:password>
    			<s:password name="o_repassword" label="确认密码"></s:password>
				<s:textfield name="o_phone" label="手机号"></s:textfield>
				<s:textfield name="o_identity" label="证件号"></s:textfield>
				<s:submit value="注册"></s:submit>
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
