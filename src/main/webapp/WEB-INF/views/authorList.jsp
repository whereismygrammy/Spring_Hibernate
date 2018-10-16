<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Autor</th>
        <th>Usuń</th>
        <th>Edytuj</th>
    </tr>

    <c:forEach items="${authors}" var="author">
        <tr>

            <td>${author.id} </td>
            <td>${author.name} </td>
            <td><a href="/author/delete/${author.id}">Usuń</a></td>
            <td><a href="/author/edit/${author.id}">Edytuj</a></td>

        </tr>

        </br>
    </c:forEach>

    <tr>

        <td></td>
        <td></td>
        <td></td>
        <td><a href="/author/add">Dodaj autora</a></td>

    </tr>

</table>


</body>
</html>
