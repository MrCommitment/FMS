<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<head>
    <title>Register site</title>
    <style type="text/css">
        .error {
            color: orangered;
        }
    </style>
</head>
<body>
<h3 align="center">${headerMessage}</h3>
<form:form method="post" modelAttribute="user">
<h3 align="center">Register as a Disponent:</h3>
<table align="center">
    <caption align="top">Registration form:</caption>
    <tr>
        <td>Email:</td>
        <td><form:input path="email"/></td>
        <td><form:errors path="email" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><form:password path="password"/></td>
        <td><form:errors path="password" cssClass="error"/></td>
    </tr>
    <tr>
        <td>First Name:</td>
        <td><form:input path="firstName"/></td>
        <td><form:errors path="firstName" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Second Name:</td>
        <td><form:input path="secondName"/></td>
        <td><form:errors path="secondName" cssClass="error"/></td>
    </tr>
</table>
<table align="center">
    <form>
            <p align="center">Choose one:

                <div align="center">
                    <input type="checkbox" id="scales" name="scales" unchecked>
                    <label for="scales">I'm robot</label>
                </div>

                <div align="center">
                    <input type="checkbox" id="horns" name="horns">
                    <label for="horns">I'm really not a robot</label>
                </div>
    </form>
    <tr>
        <td><input type="hidden" name="action" value="register"/></td>
        <td><input type="submit" value="Register !"/></td>
    </tr>
</table>

</form:form>


<%--source code bellow--%>


<%--<form:form method="post" modelAttribute="user">--%>
<%--    Email: <form:input path="email"/>--%>
<%--    Password: <form:password path="password"/>--%>
<%--    First name: <form:input path="firstName"/>--%>
<%--    Second name: <form:input path="secondName"/>--%>
<%--    <input type = "submit" value = "Register !"/>--%>
<%--</form:form>--%>


