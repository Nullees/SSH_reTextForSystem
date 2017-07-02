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
    
    <title>教务处管理教师</title>
    
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
    <s:iterator value="#request.name" id="office">
    你好,<s:property value="#office.o_name"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     &nbsp;&nbsp;          &nbsp;       &nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;		
    <a href="index.jsp">退出登录</a>
    <hr>
    	<a href="officefindobjectbyo_no.action?o_no=<s:property value="#office.o_no"/>">注册学生</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="officefindobjectbyo_nointeacherregister.action?o_no=<s:property value="#office.o_no"/>">注册教师</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="officemanagestudentinshowall.action?o_no=<s:property value="#office.o_no"/>">管理学生信息</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="officemanageteachershowall.action?o_no=<s:property value="#office.o_no"/>">管理教师信息</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="officemanagecourseshowall.action?o_no=<s:property value="#office.o_no"/>">管理课程信息</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="officedownloadcoursematerialfromteacher.action?o_no=<s:property value="#office.o_no"/>">下载教师课程资料</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="officecountstudentinshowall.action?o_no=<s:property value="#office.o_no"/>">统计学生成绩</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="officefindobejectinaddnotice.action?o_no=<s:property value="#office.o_no"/>">发布公告</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <hr>
      <center>
      	<table border="1">
    		<tr>
    			<td>教师编号</td>
    			<td>教师姓名</td>
    			<td>教师性别</td>
    			<td>教师出生日期</td>
    			<td>教师手机号码</td>
    			<td>教师身份证号码</td>
    			<td>教师所属部门</td>
    			<td>教师类型</td>
    			<td>是否删除</td>
    			<td>进行更新</td>
    		</tr>
    		<s:iterator value="#request.all" id="teacher">
    			<tr>
    				<td><s:property value="#teacher.t_no"/></td>
    				<td><s:property value="#teacher.t_name"/></td>
    				<td><s:property value="#teacher.t_gender"/></td>
    				<td><s:property value="#teacher.t_birth"/></td>
    				<td><s:property value="#teacher.t_phone"/></td>
    				<td><s:property value="#teacher.t_identity"/></td>
    				<td><s:property value="#teacher.t_department"/></td>
    				<td><s:property value="#teacher.t_post"/></td>
    				<td><a href="officedeleteteacher.action?t_no=<s:property value='#teacher.t_no'/>&o_no=<s:property value='#office.o_no'/>">删除</a></td>
    				<td><a href="OfficeUpdateTeacher.jsp?t_no=<s:property value='#teacher.t_no'/>&o_no=<s:property value='#office.o_no'/>">更新</a></td>
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
