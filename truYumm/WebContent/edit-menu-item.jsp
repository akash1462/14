<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>edit menu</title>
<link rel="stylesheet" type="text/css" href="style\style.css">
</head>
<body>
	<header>
		truYum &nbsp;&nbsp;<span><img
			src="images\truyum-logo-light.png"></span><span class="alignright"><a
			href="ShowMenuItemListAdmin" class="a1">Menu</a></span>
	</header>
	<h2>Edit Menu Item</h2>
	<form name="myform" onsubmit="return validate()" action="EditMenuItem"
		method="post">

		<label for="itemname">Name</label><br> <input type="text"
			name="itemname" id="itemname" value="${menuItem.name}"><br>
		<br>

		<table class="editmenu">
			<tr align="left">
				<td><label for="price">Price </label>(Rs.)</td>
				<td>Active</td>
				<td><label for="date"> Date of Launch</label></td>
				<td><label for="selector"> Category </label></td>
			</tr>

			<tr>
				<td><input type="number" name="price" id="price"
					value="${menuItem.price}"></td>

				<td>
					<input type="radio" name="active" id="active" value = "yes" <c:if test ="${menuItem.active==true }">checked</c:if>>Yes 
					<input type="radio" name="active" id="active" value = "no" <c:if test ="${menuItem.active==false }">checked</c:if>>No
					
					<%-- <c:if test="${menuItem.active==true}">
						
						<input type="radio" name="active" id="active" checked>Yes 
							<input type="radio" name="active" id="active"> No 

					</c:if>
					
					<c:if test="${menuItem.active==false}">
						<input type="radio" name="active" id="active">Yes 
						<input type="radio" name="active" id="active" checked> No 
					</c:if> --%>
					
				</td>

				<td><input type="date" id="date" name="dateOfLaunch"
					value='<fmt:formatDate type="date" pattern="dd/MM/yyyy" 
							value="${menuItem.dateOfLaunch }"/>'>
				</td>

				<td><select id="selector" name="category">
						<c:forEach items="${category}" var="category">
							<c:choose>
								<c:when test="${menuItem.category==category}">
									<option value="${category }" selected="selected">${category }</option>
								</c:when>
								<c:otherwise>
									<option value="${category}">${category}</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
				</select></td>
			</tr>

		</table>
		<br>
		<c:if test="${menuItem.freeDelivery==true}">
			<input type="checkbox" id="checkboxx" name="delivery" checked>
		</c:if>
		<c:if test="${menuItem.freeDelivery ==false}">
			<input type="checkbox" id="checkboxx" name="delivery">
		</c:if>
		<label for="checkboxx">Free Delivery</label> <br> <br> <input
			type="hidden" id="id" name="id" value="${menuItem.id}"> <input
			type="submit" value="Save" name="save" id="save">
	</form>

	<footer> Copyright &copy; 2019</footer>

	<script src="js\script.js"></script>

</body>
</html>
