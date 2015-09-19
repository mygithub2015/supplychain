<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
span{
	cursor:pointer;
}
UL{
	list-style-type: none;
}
</style>
</head>
<body>
	<s:form action="searchAction">
		<s:textfield name="itemId" label="Item Id" id="item"/> &nbsp;&nbsp;<s:submit
			name="search" />
	</s:form>
	<hr color="blue" />
	<s:if test="hasActionMessages()">
		<label id ="itemListLabel" onClick="chooseItem()"> <s:actionmessage />
		</label>
	</s:if>
	<script type="text/javascript">

	//document.getElementById('item').value= document.getElementsByTagName('span')[0].innerHTML;
	var lb = document.getElementById("itemListLabel");
	var LIs = lb.getElementsByTagName("SPAN");
	for(var i = 0; i < LIs.length; i++){
		document.getElementsByTagName("SPAN")[i].addEventListener('click',function(){
			document.getElementById('item').value = this.innerHTML;
		});
	}
	
</script>
	
</body>
</html>