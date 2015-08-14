<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Promotions(configuration)</title>
<script type="text/javascript">
	/* var tableId = "promo_loc_table";
	 var tableObj = document.getElementById(tableId);
	 var rowId = tableId+"_row";
	 var colId = rowId+"_col";
	 var rowCnt = 0;
	 var colCnt = 0;
	 var tableId = "promo_loc_table";
	 var tableObj = document.getElementById(tableId);
	 var rowId = tableId+"_row";
	 var colId;// = rowId+"_col";
	 var rowCnt = 0;
	 var colCnt = 0;
	 function addRow(){
	 alert(1);
	 rowId += rowCnt++;
	 colId = rowId+"_col";
	 var html = "<TR id='"+rowId+"'>";
	 var col0 = "<TD id='"+(colId+colCnt++)+"'>"+"<input type='checkbox' id='chkbox"+rowCnt+"'/></TD>";
	 var col1 = "<TD id='"+(colId+colCnt++)+"'>"+"<input id='loc_name' placeholder='location name'/></TD>";
	 var col2 = "<TD id='"+(colId+colCnt++)+"'>"+"<input id='loc_address' placeholder='location address'/></TD>";
	 var col3 = "<TD id='"+(colId+colCnt++)+"'>"+"<input id='price' placeholder='price'/></TD>";
	 html += col0+col1+col2+col3;
	 html += "</TR>";
	 tableObj.innerHTML=html;
	 } */
</script>
</head>
<body>
	<h3 style="color: blue;">Promotion - Configurations</h3>
	<hr style="color: red" />
	<div id="header">
		<div align="center">
			<s:form action="promoiton">
				<s:textfield name="promoName" label="Promotion Name"></s:textfield>
				<s:textfield name="itemName" label="Item Name"></s:textfield>
				<s:textfield name="promoStrtDt" label="Promotion Start Date"></s:textfield>
				<s:textfield name="promoEndDt" label="Promotion End Date"></s:textfield>
				<table style="border: 1px solid black" id="promo_loc_table">
					<caption>Details Of Locations</caption>
					<tr>
						<td><input name="addrList[0].streetName"
							placeholder="Enter street name" /></td>
						<td><input name="addrList[0].city" placeholder="Enter city" /></td>
						<td><input name="addrList[0].state"
							placeholder="Enter state name" /></td>
						<td><input name="addrList[0].pin" placeholder="Enter pin" /></td>
					</tr>

				</table>
				<button id="addRow" onClick="addRow()">Add Row</button> &nbsp;&nbsp;&nbsp;&nbsp;
<button id="deleteRow" disabled=disabled>Delete Row</button>
				<s:submit value="submit"></s:submit>
			</s:form>
		</div>
	</div>
</body>
</html>