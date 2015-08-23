<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
.errors {
	background-color:#FFCCCC;
	border:1px solid #CC0000;
	width:400px;
	margin-bottom:5px;margin-left:286px;
}
.errors li{ 
	list-style: none; 
}
</style>

<title>Login Page</title>
</head>
<body bgcolor="e8eff7">

<s:if test="hasActionErrors()">
   <div class="errors">
      <s:actionerror/>
   </div>
</s:if>

	<s:form action="user">
		<table align="center" border="1" width="400">
			<tr bgcolor="2c85b7">
				<td colspan="2" align="center"><h2>User Login</h2></td>
			</tr>

			<tr bgcolor="e4e4e4">
				<td><s:textfield name="loginuser.name" label="UserName" /></td>
			</tr>

			<tr bgcolor="e4e4e4">
				<td><s:password name="loginuser.password" label="Password"></s:password></td>
			</tr>

			<tr>
				<td><s:submit Value="Login" align="center" /></td>
			</tr>

		</table>
	</s:form>

</body>
</html>


