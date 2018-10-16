<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

Book TEST<br>

<form:form method="post" modelAttribute="book">

    Title : <br><form:input type="text" path="title"/><br>
    Rating : <br><form:input type="text" path="rating"/><br>
    Description : <br><form:textarea type="text" path="description"/><br>

    Publisher: <br><form:select path="publisher.id" items="${publishers}" itemLabel="name" itemValue="id"></form:select>

    <input type="submit">

</form:form>


</body>
</html>
