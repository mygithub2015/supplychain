<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<title>Retail Invoice Matching</title>

<style type="text/css">
b {
	color: navy;
	background-color: orange;
}
</style>


<script type="text/javascript">
	function addMoreLocations(tableID) {
		
		var table = document.getElementById(tableID);
		
		var rowCount = table.rows.length;
		var row = table.insertRow(rowCount);
		var counts = rowCount - 1;

		var cell1 = row.insertCell(0);
		var snoCol = document.createElement("input");
		snoCol.type = "text";
		snoCol.name = "invoiceHeader.invoiceLocation[" + counts + "].sno";
		snoCol.value = rowCount;
		cell1.appendChild(snoCol);

		var cell2 = row.insertCell(1);
		var idCol = document.createElement("input");
		idCol.type = "text";
		idCol.name = "invoiceHeader.invoiceLocation[" + counts + "].locationid";
		cell2.appendChild(idCol);

		var cell3 = row.insertCell(2);
		var areaCol = document.createElement("input");
		areaCol.type = "text";
		areaCol.name = "invoiceHeader.invoiceLocation[" + counts + "].locationArea";
		cell3.appendChild(areaCol);

		var cell4 = row.insertCell(3);
		var cityCol = document.createElement("input");
		cityCol.type = "text";
		cityCol.name = "invoiceHeader.invoiceLocation[" + counts + "].locationCity";
		cell4.appendChild(cityCol);

		var cell4 = row.insertCell(4);
		var stateCol = document.createElement("input");
		stateCol.type = "text";
		stateCol.name = "invoiceHeader.invoiceLocation[" + counts + "].state";
		cell4.appendChild(stateCol);

		var cell4 = row.insertCell(5);
		var countryCol = document.createElement("input");
		countryCol.type = "text";
		countryCol.name = "invoiceHeader.invoiceLocation[" + counts + "].country";
		cell4.appendChild(countryCol);

	}
</script>

</head>
<body bgcolor="e8eff7">

	<s:actionerror />

	<s:form name="messageForm" action="addUsermenu" method="post" style="margin-top:10px;">

		<table id="ticketTable" width="300px" align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="cbdeef" width="50px" height="20px"><h3>Add Invoice Details</h3></td>
			</tr>
			<tr>
				<td><s:textfield name="invoiceHeader.invoiceid" label="Invoice Id" /></td>	
			</tr>
			<tr>
				<td><s:textfield name="invoiceHeader.invoicename" label="Invoice Name" /></td>
			</tr>
			<tr>
				<td><s:textfield name="invoiceHeader.quantity" label="Quantity" /></td>
			</tr>
			<tr>
				<td><s:textfield name="invoiceHeader.amount" label="Amount" /></td>
			</tr>

		</table>
		
		<table id="pdTable" width="800px" style="margin-top:20px;">
			<tr>
				<td>S.No.</td>
				<td>Location Id</td>
				<td>Location Area</td>
				<td>Location City</td>
				<td>State</td>
				<td>Country</td>
			</tr>

				<tr>
					<TD><INPUT type="text"
							name="invoiceHeader.invoiceLocation[0].sno" size="15" /></TD>
					<TD><INPUT type="text"
							name="invoiceHeader.invoiceLocation[0].locationid" size="15" /></TD>
					<TD><INPUT type="text"
							name="invoiceHeader.invoiceLocation[0].locationArea" size="15" /></TD>
					<TD><INPUT type="text"
							name="invoiceHeader.invoiceLocation[0].locationCity" size="15" /></TD>
					<TD><INPUT type="text"
							name="invoiceHeader.invoiceLocation[0].state" size="15" /></TD>
					<TD><INPUT type="text"
							name="invoiceHeader.invoiceLocation[0].country" size="15" /></TD>
				</tr>

		</TABLE>
		<table style="margin-top:5px;">
			<tr>
				<td align="right"><input type="button"
					value="Add More Locations" onclick="addMoreLocations('pdTable')" />
				</td>
			</tr>
		</table>

		<table align="center">
			<tr>
				<td bgcolor="a2c1de"><input type="submit" value="Submit" align="center" width="50px" height="50px" /></td>
			</tr>
		</table>

	</s:form>
</body>
</html>