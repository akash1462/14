<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu item list customer</title>
<link rel="stylesheet" type="text/css" href="style\style.css">
</head>


<body>
	<header> truYum &nbsp;&nbsp; <span><img
		src="images\truyum-logo-light.png"></span>
	<span class="alignright"><a href="ShowMenuItemListCustomer"
		class="a1">Menu</a>&nbsp;&nbsp; <a href="ShowCart" class="a1">Cart</a></span>
	</header>
	<h2>Menu Items</h2>
	<h2><c:if test="${addCartStatus==true}">Item Added to Cart Successfully</c:if></h2>
	<table>
		<tr>
			<th class="nameleft">Name</th>
			<th>Free Delivery</th>
			<th class="priceright">Price</th>
			<th>Category</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${menuItemList}" var="menuItem">
			<tr>
				<td class="nameleft">${menuItem.name}</td>
				<td><c:if test="${menuItem.freeDelivery==true}">Yes </c:if> <c:if
						test="${menuItem.freeDelivery==false}">No</c:if></td>
				<td class="priceright"><fmt:formatNumber type="currency"
						currencySymbol="Rs." value="${menuItem.price}" /></td>
				<td>${menuItem.category}</td>
				<td><a href="AddToCart?id=${menuItem.id}">Add to Cart</a></td>
			</tr>
		</c:forEach>
	</table>
	<footer> Copyright &copy; 2019</footer>
</body>
</html>