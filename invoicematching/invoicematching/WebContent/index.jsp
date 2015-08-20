<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invoice Details</title>
<script type="text/javascript">
var addItem = function(){
	var tableObj = document.getElementById("items");
	//alert(tableObj);
	var rowLen = tableObj.rows.length;
	//alert(rowLen);
	var row = tableObj.insertRow(rowLen);
	var addrCnt = rowLen;
	var cell0 = row.insertCell(0);
    var itemDesc = document.createElement("input");
    itemDesc.type = "text";
    itemDesc.name = "invoiceDetail[" + addrCnt + "].itemDesc";
    itemDesc.placeholder="Item Description";
    cell0.appendChild(itemDesc);
	var cell1 = row.insertCell(1);
    var qty = document.createElement("input");
    qty.type = "text";
    qty.name = "invoiceDetail[" + addrCnt + "].qty";
    qty.placeholder="Item Quantity";
    cell1.appendChild(qty);
	var cell2 = row.insertCell(2);
    var rate = document.createElement("input");
    rate.type = "text";
    rate.name = "invoiceDetail[" + addrCnt + "].rate";
    rate.placeholder = "Rate";
    cell2.appendChild(rate);
		
};
</script>
</head>
<body>
	<%-- 
<s:form action="saveUser"> 
<fieldset>
<legend>User Details</legend> 
<s:textfield name="userId" label="User ID"></s:textfield>  
<s:textfield name="uname" label="User Name"></s:textfield>  
<s:submit value="save"></s:submit>  
</fieldset>

</s:form>  --%>
	<s:form action="Invoice">
		<s:textfield name="invoiceName" label="Invoice Name"></s:textfield>
		<s:textfield name="totalAmt" label="Total Price">
		</s:textfield>
		<table id="items">
		<caption>Enter the Invoice Details</caption>
		<tr>
		<td>
			<input name="invoiceDetail[0].itemDesc" placeholder="Item Description"/>
		</td>
		<td>
			<input name="invoiceDetail[0].qty" placeholder="Item Quantity"/>
		</td>
		<td>
			<input name="invoiceDetail[0].rate" placeholder="Rate"/>
		</td>
		
		</tr>
		</table>
		<input type="button" value="Add Item" onClick="addItem()"/> &nbsp;&nbsp;
		<s:submit/>
		</s:form>
		
</body>
</html>