<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="/struts-tags" prefix="s" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<style type="text/css">
.row{
	background-color: grey;
}
</style>
</head>
<body>
<h3>Welcome to Struts2 world!!!</h3>
<h3>User: <i></i><s:property value="uname"/></i>  </h3><hr/>
<p style="text-decoration: underline;">Addresses:</p>
<table border="1" bordercolor="blue" style="table-layout: auto;">
<!-- <caption align="left">Addresses</caption>
 -->
 <tr style="border:1px solid blue; background-color: orange; color: white;">
<td>Street Name</td>
<td>City</td>
<td>State</td>
<td>Pin</td>
</tr>
<s:iterator value="addrList" status="row">  
<s:if test="$row.even">
<s:set name="evenclass" value="'row'" />
</s:if>
<%-- <s:else>
<tr>
</s:else> --%>
<tr class="${evenclass}">
<td>
<s:property value="streetName"/> 
</td>
<td><s:property value="city"/> </td>
<td><s:property value="state"/>  </td>
<td><s:property value="pin"/>  </td>
</tr>
</s:iterator>  
</table>
</body>
</html>