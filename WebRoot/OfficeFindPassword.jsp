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
    
    <title>教务处人员找回密码</title>
    
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
    	<h1>教务处人员找回密码</h1>
    		<h2>按照要求输入以下信息，系统将自动检验，匹配无错将返回教务处人员密码</h2>
    		<s:form action="officefindtargetpassword.action" method="post">
    			<s:textfield label="教务人员姓名" name="o_name"></s:textfield>
    			<s:textfield label="教务人员身份证号码" name="o_identity"></s:textfield>
    			<s:textfield label="教务人员手机号码" name="o_phone"></s:textfield>
    			<s:submit value="提交"></s:submit>
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
