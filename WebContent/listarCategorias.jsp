<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem de Categorias</title>
</head>
<body>
	<h2>Listagem de Categorias</h2>
	<br>
	<table>
		<thead>
			<tr>
				<td>Id da Categoria</td>
				<td>Nome da categoria</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="categoria" items='${sessionScope["categorias"]}'>
				<tr>
					<td>${categoria.id }</td>
					<td>${categoria.nome }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>