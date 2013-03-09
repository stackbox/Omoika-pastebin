<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'home.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="resources/style.css" rel="stylesheet" type="text/css">
</head>

<body>

	<div>
		<div id="head">

			<div id="title">
				<h3>Pastebin</h3>
			</div>

			<div id="navbar">
				<ul>
					<li><a href="login.action">Login</a></li>
					<li><a href="register.action">Register</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="content">
		<form name="code" action="aaa.jsp" method="post">
			<textarea name="code"
				style="overflow-x:scroll;overflow-y:scroll; resize:none;" cols="100"
				rows="20">   </textarea>
			<input type="submit" value="submit">
		</form>
	</div>

	<s:property value="#session.user"/>
</body>
</html>
