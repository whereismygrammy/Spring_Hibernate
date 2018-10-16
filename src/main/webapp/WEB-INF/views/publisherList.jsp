
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
        <th>Name</th>
        <th>Usuń</th>
        <th>Edytuj</th>
    </tr>

    <c:forEach items="${publishers}" var="publisher">
        <tr>

            <td>${publisher.id} </td>
            <td>${publisher.name} </td>
            <td><a href="/publisher/delete/${publisher.id}">Usuń</a></td>
            <td><a href="/publisher/edit/${publisher.id}">Edytuj</a></td>

        </tr>

        </br>
    </c:forEach>

    <tr>

        <td></td>
        <td></td>
        <td></td>
        <td><a href="/publisher/add">Dodaj wydawcę</a></td>

    </tr>

</table>

</body>
</html>
