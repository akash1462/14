<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="DateOfBirth" value="${emp.getDateOfBirth() }" />
	<table>
		<tr>
			<td>Id :</td>
			<td><c:out value="${emp.getEmployeeid() }" /></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><input type="text" name="name"
				value=<c:out value="${emp.getEmployeename() }"/>></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td><input type="radio" value="male" name="gender"
				<c:if test = "${emp.getGender() eq 'male' }">checked</c:if>>Male
				<input type="radio" value="female" name="gender"
				<c:if test = "${emp.getGender() eq 'female' }">checked</c:if>>
				Female</td>
		</tr>

		<tr>
			<td>Date Of Birth :</td>
			<td><input type="date" name="dateofbirth"
				value=<fmt:formatDate pattern = "dd-MM-yyyy" 
         value = "${DateOfBirth}" />></td>

		</tr>
		<tr>
			<td>Fulltime Employee</td>
			<td><input type="checkbox" name="FullTimeEmployee" checked></td>
		</tr>

		<tr>
			<td>Department:</td>
			<td><select>
					<c:forEach items="${Department}" var="data">
						<option value="${data}"
							<c:if test= "${emp.getDepartment() eq data }"> selected </c:if>>${data}</option>
					</c:forEach>
			</select></td>
		</tr>
		
		
		
		<tr>
			<td><input type = "Submit" value = "Submit"> </td>
		</tr>
		
	</table>

</body>
</html>

