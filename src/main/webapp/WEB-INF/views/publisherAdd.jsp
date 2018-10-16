<%--
  Created by IntelliJ IDEA.
  User: tom
  Date: 16.10.18
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


<form:form method="post" modelAttribute="publisher">

    Wydawca : <br><form:input type="text" path="name"/><br>
    <form:input type="hidden" path="id"/><br>
    <input type="submit">

</form:form>

</body>
</html>
