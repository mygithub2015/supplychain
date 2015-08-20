<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Promotions(configuration)</title>
<script type="text/javascript">
function fun1(){
	alert("fun");
}
function addRow(){
		//alert("addRow");
		var tableObj = document.getElementById("promo_loc_table");
		//alert(tableObj);
		var rowLen = tableObj.rows.length;
		//alert(rowLen);
		var row = tableObj.insertRow(rowLen);
		var addrCnt = rowLen;
		var cell0 = row.insertCell(0);
		var locnId = document.createElement("input");
		locnId.type = "text";
		locnId.name = "promotionDetails[" + addrCnt + "].locnId";
		locnId.placeholder = "Location Id";
		cell0.appendChild(locnId);
		var cell1 = row.insertCell(1);
		var locnAddr = document.createElement("input");
		locnAddr.type = "text";
		locnAddr.name = "promotionDetails[" + addrCnt + "].locnAddr";
		locnAddr.placeholder = "Location Address";
		cell1.appendChild(locnAddr);
		var cell2 = row.insertCell(2);
		var city = document.createElement("input");
		city.type = "text";
		city.name = "promotionDetails[" + addrCnt + "].city";
		city.placeholder = "City";
		cell2.appendChild(city);
		var cell3 = row.insertCell(3);
		var state = document.createElement("input");
		state.type = "text";
		state.name = "promotionDetails[" + addrCnt + "].state";
		state.placeholder = "State";
		cell3.appendChild(state);
		var cell4 = row.insertCell(4);
		var price = document.createElement("input");
		price.type = "text";
		price.name = "promotionDetails[" + addrCnt + "].price";
		price.placeholder = "Price";
		cell4.appendChild(price);
		 }
</script>
</head>
<body>
	<h3 style="color: blue;">Promotion - Configurations</h3>
	<hr style="color: red" />
	<div id="header">
		<div align="center">
			<s:form action="promotion">
				<s:textfield name="promotionName" label="Promotion Name"></s:textfield>
				<s:textfield name="itemName" label="Item Name"></s:textfield>
				<s:textfield name="promotionStartDt" label="Promotion Start Date"></s:textfield>
				<s:textfield name="promotionEndDt" label="Promotion End Date"></s:textfield>
				<table style="border: 1px solid black" id="promo_loc_table">
					<caption>Details Of Locations</caption>
					<tr>
						<td><input name="promotionDetails[0].locnId"
							placeholder="Location Id" /></td>
						<td><input name="promotionDetails[0].locnAddr"
							placeholder="Location Address" /></td>
						<td><input name="promotionDetails[0].city" placeholder="City" /></td>
						<td><input name="promotionDetails[0].state"
							placeholder="State" /></td>
						<td><input name="promotionDetails[0].price"
							placeholder="Price" /></td>
					</tr>

				</table>
				<table>
					<tr>
						<td><input type="button"  onClick="addRow()"
							value="Add Row"></td>
						<td><input type="button" id="deleteRow" disabled=disabled
							value="Delete Row"></td>
						<td colspan="3"><s:submit value="submit"></s:submit></td>
					</tr>
				</table>

			</s:form>
		</div>
	</div>
</body>
</html>