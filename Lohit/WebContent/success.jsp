<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
b {
	color: navy;
	background-color: orange;
}
</style>
<title>Struts2-Spring-Tiles integration </title>
</head>
<body bgcolor="e8eff7">

	<table width="700px" align="center" border="1">
		<tr>
			<td colspan="4" align="center" bgcolor="cbdeef"><h3>Invoice
					Header Details</h3></td>
		</tr>
		<tr>
			<td>Invoice Id : <s:property value="invoiceHeader.invoiceid" /></td>
			<td>Invoice Name : <s:property value="invoiceHeader.invoicename" /></td>
			<td>Quantity : <s:property value="invoiceHeader.quantity" /></td>
			<td>Amount : <s:property value="invoiceHeader.amount" /></td>
		</tr>
	</table>
	<table border="1" width="700px" align="center"
		style="margin-top: 20px;">
		<tr>
			<td colspan="6" align="center" bgcolor="cbdeef"><h3>Invoice
					Location Details</h3></td>
		</tr>

		<TR>
			<TD>S.No.</TD>
			<TD>Location Id</TD>
			<TD>Location Area</TD>
			<TD>Location City</TD>
			<TD>State</TD>
			<TD>Country</TD>
		</TR>

		<s:iterator value="invoiceHeader.invoiceLocation"
			var="invoiceLocation">
			<tr>
				<td><s:property value="sno" /></td>
				<td><s:property value="locationid" /></td>
				<td><s:property value="locationArea" /></td>
				<td><s:property value="locationCity" /></td>
				<td><s:property value="state" /></td>
				<td><s:property value="country" /></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>