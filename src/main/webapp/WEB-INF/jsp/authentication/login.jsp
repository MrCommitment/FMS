<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>Login Page</title>
    <style type="text/css">
        .error {
            color: orangered;
        }
    </style>
</head>
<body>
<h3 align="center">${headerMessage}</h3>
<form:form method="post" modelAttribute="viewMode">
    <h3 align="center">Log in as Disponent:</h3>
    <table align="center">
        <caption align="top">Disponent login form:</caption>
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
            <td><input type="hidden" name="action" value="login"/></td>
            <td><input type="submit" value="Log in!"/></td>
        </tr>
    </table>
</form:form>
<form:form method="post" modelAttribute="viewMode">
    <h3 align="center">Don't have an account? No problem :</h3>
    <table align="center">
        <tr>
            <td><input type="hidden" name="action" value="register"/></td>
            <td><input type="submit" value="Sign in!"/></td>
        </tr>
    </table>
</form:form>
</body>


<%--source code bellow--%>


<%--<form:form method="post" modelAttribute="viewMode">--%>
<%--    Email: <form:input path="email"/>--%>
<%--    Password: <form:password path="password"/>--%>
<%--    <input type="hidden" value="login" name="action"/>--%>
<%--    <input type = "submit" value = "Log in !"/>--%>
<%--</form:form>--%>
<%--<form:form method = "post" modelAttribute="viewMode">--%>
<%--    <input type="hidden" value="register" name="action"/>--%>
<%--    <input type = "submit" value = "Sign in ! "/>--%>
<%--</form:form>--%>



