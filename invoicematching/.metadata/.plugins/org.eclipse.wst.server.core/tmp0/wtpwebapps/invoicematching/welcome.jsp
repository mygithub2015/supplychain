<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="/struts-tags" prefix="s" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>in welcome.jsp<hr/>
<%-- <s:set var ="itemId" value="itemId"/>
<s:set var = "itemName" value="itemName"/>
<s:set var="itemClass" value="itemClass"/>
<s:set var = "qty" value="qty"/>
<s:set var = " itemSubClass" value="itemSubClass"/>
<s:set var ="rate" value="rate"/> --%>
<%-- <s:property value="itemId" /><br/>
<s:property value="itemName"/> --%>
<s:textfield label="Item Id" value="%{itemId}"/><br/>
<s:textfield label="Item Name" value="%{itemName}"/><br/>
<s:textfield label="Item Class" value="%{itemClass}"/><br/>
<s:textfield label="Item Subclass" value="%{itemSubClass}"/><br/>
<s:textfield label="qty" value="%{qty}"/><br/>
<s:textfield label="rate" value="%{rate}"/><br/>


</body>
</html>