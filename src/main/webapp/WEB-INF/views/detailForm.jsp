<%--
  Created by IntelliJ IDEA.
  User: tom
  Date: 16.10.18
  Time: 09:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


<html>
<head>
    <title>Form z detalami</title>
</head>
<body>

<form:form method="post" modelAttribute="personDTO">
    Login: <form:input path="login"/><br>
    Password: <form:password path="password"/><br>
    Email: <form:input path="email"/><br>
    First name: <form:input path="firstName"/><br>
    Last name: <form:input path="lastName"/><br>
    Gender:<br>
    Male: <form:radiobutton path="gender" value="M"/><br>
    Female: <form:radiobutton path="gender" value="F"/><br>
    Country: <form:select path="country" items="${countryItems}"/><br>
    Notes: <form:textarea path="notes" rows="2" cols="6"/><br>
    Mailing list: <form:checkbox path="mailingList"/><br>
    Programming skills: <form:select path="programmingSkills" items="${programmingList}" multiple="true"/><br>
    Hobbies: <form:checkboxes path="hobbies" items="${hobbiesList}"/><br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
