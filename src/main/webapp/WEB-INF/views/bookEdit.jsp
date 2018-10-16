<%--
  Created by IntelliJ IDEA.
  User: tom
  Date: 16.10.18
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="post" modelAttribute="bookToEdit">


    ${bookToEdit.id}

    Title : <br><form:input type="text" path="title"/><br>
    Rating : <br><form:input type="text" path="rating"/><br>
    Description : <br><form:textarea type="text" path="description"/><br>
    Publisher: <br><form:select path="publisher.id" items="${publishers}" itemLabel="name" itemValue="id"></form:select></br>
    Authors: <br><form:select path="authors" items="${authors}" itemLabel="name" itemValue="id"
                              multiple="false"> </form:select><br>
    <input type="submit">

</form:form>

</body>
</html>
