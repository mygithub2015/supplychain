<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Details</title>
<%-- <script type="text/javascript" src="/invoicematching/src/lib/Jquery.js">
	
</script> --%>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js">
</script>
<style type="text/css">
#draggable-element {
	width: 350px;
	height: 500px;
	padding: 10px 12px;
	cursor: move;
	position: relative;
	z-index: 2;
	/* important (all position that's not `static`) */
}

LI {
	cursor: pointer;
}

UL,LI{
	list-style-type: none;
}

img {
	cursor: pointer;
}
</style>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		$("#draggable-element").draggable();
	});
	/* var selected = null, // Object of the element to be moved
	 x_pos = 0,
	 y_pos = 0, // Stores x & y coordinates of the mouse pointer
	 x_elem = 0,
	 y_elem = 0; // Stores top, left values (edge) of the element

	 //Will be called when user starts dragging an element
	 function _drag_init(elem) {
	 // Store the object of the element which needs to be moved
	 selected = elem;
	 x_elem = x_pos - selected.offsetLeft;
	 y_elem = y_pos - selected.offsetTop;
	 }

	 //Will be called when user dragging an element
	 function _move_elem(e) {
	 x_pos = document.all ? window.event.clientX : e.pageX;
	 y_pos = document.all ? window.event.clientY : e.pageY;
	 if (selected !== null) {
	 selected.style.left = (x_pos - x_elem) + 'px';
	 selected.style.top = (y_pos - y_elem) + 'px';
	 }
	 }

	 //Destroy the object when we are done
	 function _destroy() {
	 selected = null;
	 }

	 //Bind the functions...
	 document.getElementById('draggable-element').onmousedown = function () {
	 _drag_init(this);
	 return false;
	 };

	 document.onmousemove = _move_elem;
	 document.onmouseup = _destroy; */
	function closeDiv() {

		document.getElementById('draggable-element').style.display = "none";
	}
	 
	 function addLIListeners(){
		 //alert("addLIListeners");
		 var div = document.getElementById("ajaxResponse");
			var LIs = div.getElementsByTagName("LI");
			for ( var i = 0; i < LIs.length; i++) {
				LIs[i].addEventListener('click', function() {
					document.getElementById('itemId').value = this.innerText;
					//console.log("Adding eventListener")
					//alert("clicked, LI:"+this.innerHTML);
					closeDiv(); //closing the draggable-div
					//break;
				});
			}
	 }
</script>
<script>
$(document).ready(function() {
	   $('#ajaxSearchBtn').click(function(event) {
	      var itemId = $("itemId2").val();
	      var div = $('#ajaxResponse');
	      $.getJSON('ajaxAction', {
	        itemId : itemId   //passing itemId
	      }, function(jsonResponse) {
	         //div.text(jsonResponse.dummyMsg);
	         alert(jsonResponse);
	         $.each(jsonResponse.itemList, function(index, value) {
	          $('<LI>').text(value).appendTo(div);
	        });
	       
	      });
	      addLIListeners();  
	   });
	  
	});
</script>

</head>
<body>
	<s:form action="fetchItemDetails">
		<table>
			<tr>
				<td><s:textfield name="itemId" id="itemId" label="Item ID"></s:textfield></td>
			</tr>
			<!-- <tr>
				<td><input alt="search_img" type="image"
					src="./images/Apps-Search-icon.jpg"
					style="position: absolute; top: 15px; left: 230px;"
					onclick="(function(){document.getElementById('draggable-element').style.display='block';})()"
					width="20px" height="20px" /></td>
			</tr> -->
			<tr align="right">
				<td colspan="2"><s:submit></s:submit></td>
			</tr>
		</table>
	</s:form>
	<div>
		<input alt="search_img" type="image"
			src="./images/Apps-Search-icon.jpg"
			style="position: absolute; top: 15px; left: 250px;"
			onclick="(function(){document.getElementById('draggable-element').style.display='block';})()"
			width="20px" height="20px" />
	</div>
	<div id="draggable-element" style="display: none">
		<div style="background-color: #99997A">
			<div align="right">
				<img onclick="closeDiv()"
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCUqn2tkNOoC0w--VLEAEK5oH1_RfJ4uF14WutuNGW1Md_GN-Gry8zvrk"
					height=20px width=20px>
				<div align="left"
					style="font-weight: bold; color: white; font: italic bold 16px/18px Georgia, serif">Search</div>
			</div>
			<div
				style="background-color: #FFFFCC; padding-top: 10px; padding-left: 10px;">
				<div style="display: inline-block;">
					<%-- 	<s:form action="searchAction">
						<s:textfield name="itemId" label="Item Id" id="item" />
						&nbsp;&nbsp;
						<s:submit name="search" />
					</s:form>
 --%>
					<!-- <textarea rows="10" cols="30"> -->
					Item Id: <input id="itemId2" id="item" /> &nbsp;&nbsp;
					<button id="ajaxSearchBtn">Search</button>
					<div id="ajaxResponse">
						<%-- 	<s:if test="hasActionMessages()">
							<s:set name="flag" value="yes" />
							<label id="itemListLabel"> <s:actionmessage />
							</label>
						</s:if>
 --%>
					</div>
					<!-- </textarea> -->
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//document.getElementById('item').value= document.getElementsByTagName('span')[0].innerHTML;
		/* var lb = document.getElementById("ajaxResponse");
		var LIs = lb.getElementsByTagName("LI");
		for ( var i = 0; i < LIs.length; i++) {
			LIs[i].addEventListener('click', function() {
				document.getElementById('itemId').value = this.innerText;
				//console.log("Adding eventListener")
				//alert("clicked, LI:"+this.innerHTML);
				//closeDiv(); //closing the draggable-div
				//break;
			});
		} */
	</script>
	<hr />
	<s:if test="hasActionErrors()">
		<div style="color: red">
			<s:actionerror />
		</div>
	</s:if>


	<s:if test="hasActionMessages()">
		<!--  && %{#flag=='yes'}"> -->
		<%-- 	<s:if test ="%{#flag=='yes'}">
 --%>
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
	<%-- 	<s:textfield value="%{flag}" />
 --%>
</body>
</html>