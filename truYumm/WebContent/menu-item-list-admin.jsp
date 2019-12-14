<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu item list admin</title>
<link rel="stylesheet" type="text/css" href="style\style.css">
</head>

<body>
<header>
		truYum &nbsp;&nbsp; <span><img src="images\truyum-logo-light.png"></span>
		<span class="alignright"> <a href="ShowMenuItemListAdmin"
			class="a1">Menu</a>
		</span>
	</header>

	<h2>Menu Items</h2>
	<table>
		<tr>
			<th class="nameleft">Name</th>
			<th class="priceright">Price</th>
			<th>Active</th>
			<th>Date of Launch</th>
			<th>Category</th>
			<th>Free Delivery</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${menuItemList}" var="menuItem">
			<tr>
				<td class="nameleft">${menuItem.name}</td>
				<td class="priceright"><fmt:formatNumber type="currency"
						currencySymbol="Rs." value="${menuItem.price}" /></td>
				<td><c:if test="${menuItem.active==true}">Yes</c:if> <c:if
						test="${menuItem.active==false}">No</c:if></td>
				<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
						value="${menuItem.dateOfLaunch}" /></td>
				<td>${menuItem.category}</td>
				<td><c:if test="${menuItem.freeDelivery==true}">Yes </c:if> <c:if
						test="${menuItem.freeDelivery==false}">No</c:if></td>
				<td><a href="ShowEditMenuItem?id=${menuItem.id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
	<footer> Copyright &copy; 2019</footer>
</body>
</html>