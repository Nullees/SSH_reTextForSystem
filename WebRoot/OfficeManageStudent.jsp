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
    
    <title>教务处管理学生</title>
    
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
    			<td>学生编号</td>
    			<td>学生姓名</td>
    			<td>学生性别</td>
    			<td>学生出生日期</td>
    			<td>学生地址</td>
    			<td>学生身份证号码</td>
    			<td>学生手机号码</td>
    			<td>学生入学时间</td>
    			<td>学生离校时间</td>
    			<td>学生院系</td>
    			<td>学生系别</td>
    			<td>是否删除</td>
    			<td>进行更新</td>
    		</tr>
    		<s:iterator value="#request.all" id="student">
    			<tr>
    				<td><s:property value="#student.s_no"/></td>
    				<td><s:property value="#student.s_name"/></td>
    				<td><s:property value="#student.s_gender"/></td>
    				<td><s:property value="#student.s_birth"/></td>
    				<td><s:property value="#student.s_address"/></td>
    				<td><s:property value="#student.s_identity"/></td>
    				<td><s:property value="#student.s_phone"/></td>
    				<td><s:property value="#student.s_intime"/></td>
    				<td><s:property value="#student.s_outtime"/></td>
    				<td><s:property value="#student.s_college"/></td>
    				<td><s:property value="#student.s_department"/></td>
					<td><a href="officedeletestudent.action?s_no=<s:property value='#student.s_no'/>">删除</a></td>
    				<td><a href="OfficeUpdateStudent.jsp?s_no=<s:property value='#student.s_no'/>&o_no=<s:property value='#office.o_no'/>">更新</a></td>
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
