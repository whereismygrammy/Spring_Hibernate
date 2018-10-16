<%--
  Created by IntelliJ IDEA.
  User: tom
  Date: 16.10.18
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


<html>
<head>
    <title>Title</title>
</head>
<body>

<b>Lista książek</b>
</br>

<a href="/books/add">Dodaj ksiazke</a>

</br>


<table>
    <tr>
        <th>Tytuł</th>
        <th>Autor (teraz title)</th>
        <th>Ocena</th>
        <th>Wydawca</th>
        <th>Usuń</th>
        <th>Edytuj</th>
    </tr>


    <c:forEach items="${books}" var="book">
        <tr>


            <td>${book.title} </td>
            <td>${book.title} </td>
            <td>${book.rating} </td>
            <td>${book.publisher}</td>
            <td><a href="/books/delete/${book.id}">Usuń</a></td>
            <td><a href="/books/edit/${book.id}">Edytuj</a></td>

        </tr>

        </br>
    </c:forEach>

</table>


</body>
</html>
