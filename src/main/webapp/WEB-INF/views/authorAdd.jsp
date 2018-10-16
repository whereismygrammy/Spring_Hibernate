<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
Dodaj autora

<form:form method="post" modelAttribute="author">

    Imię : <br><form:input type="text" path="firstName"/><br>
    Nazwisko : <br><form:input type="text" path="lastName"/><br>
    <form:input type="hidden" path="id"/><br>
    <input type="submit">

</form:form>

</body>
</html>
