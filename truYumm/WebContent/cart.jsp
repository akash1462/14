<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>cart</title>
<link rel="stylesheet" type="text/css" href="style\style.css">
</head>

<body>
	<header>
		truYum &nbsp;&nbsp;<span><img
			src="images\truyum-logo-light.png"></span><span class="alignright"><a
			href="ShowMenuItemListCustomer" class="a1">Menu</a>&nbsp;&nbsp; <a
			href="ShowCart" class="a1">Cart</a></span>
	</header>
	<h2>Cart</h2>
	<h2><c:if test="${removeCartItemStatus==true}">Item removed from Cart Successfully</c:if></h2>
	<table>
		<tr>
			<th class="nameleft">Name</th>
			<th class="free">Free Delivery</th>
			<th class="priceright">Price</th>
			<th></th>
		</tr>
		<c:forEach items="${cart.menuItemList}" var="menuItem">
			<tr>
				<td class="nameleft">${menuItem.name}</td>
				<td class="free">
					<c:if test="${menuItem.freeDelivery==true}">Yes
					</c:if> <c:if test="${menuItem.freeDelivery==false}">No</c:if>
				</td>
				<td class="priceright"><fmt:formatNumber
						value="${menuItem.price}" pattern="#,##,##,###.00" /></td>
				<td><a href="RemoveCart?id=${menuItem.id}">Delete</a></td>
			</tr>
		</c:forEach>
		<tr>
			<th></th>
			<th class="free">Total</th>
			<th class="priceright"></th>
			<th><fmt:formatNumber value="${cart.total}"
					pattern="#,##,##,###.00" /></th>
		</tr>

	</table>
	<footer> Copyright &copy; 2019</footer>

</body>

</html>
