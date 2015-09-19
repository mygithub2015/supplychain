
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
label {
	text-decoration: underline;
	font-weight: bold;
}
</style>
</head>
<body>

	<label>Sorry an exception occurred!</label>
	<p>
		<label>Exception Name:</label>
		<s:property value="exception" />
	</p>
	<p>
		<label>Exception Details:</label>
		<s:property value="exceptionStack" />
	</p>
	<form>
		<input type="button" value="back" onclick="history.back()">
	</form>
</body>
</html>