<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="fetchItemDetails">
		<s:textfield name="itemId" label="Item ID"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	<hr />
	<s:if test="hasActionErrors()">
		<div style="color: red">
			<s:actionerror />
		</div>
	</s:if>


	<s:if test="hasActionMessages()">
		<s:form action="updateItemsAction">
			<s:actionmessage />
			<s:textfield label="Item Id" name="itemId" value="%{itemId}" />
			<br />
			<s:textfield label="Item Name" name="itemName" value="%{itemName}" />
			<br />
			<s:textfield label="Item Class" name="itemClass" value="%{itemClass}" />
			<br />
			<s:textfield label="Item Subclass" name="itemSubClass"
				value="%{itemSubClass}" />
			<br />
			<s:textfield label="qty" name="qty" value="%{qty}" />
			<br />
			<s:textfield label="rate" name="rate" value="%{rate}" />
			<br />
			<s:submit value="update" />
		</s:form>
	</s:if>
</body>
</html>