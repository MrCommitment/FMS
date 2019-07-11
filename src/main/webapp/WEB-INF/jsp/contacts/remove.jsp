<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Remove contact page</title>
    <style type="text/css">
        .error {
            color: orangered;
        }
    </style>
</head>
<body>
<h3 align="center">${headerMessage2}</h3>
<form:form method="post" modelAttribute="contacts">
<h3 align="center">Remove contact :</h3>
<table align="center">
    <caption align="top">Remove form:</caption>
    <tr>
        <td>Company name:</td>
        <td><form:input disabled="true" path="companyName"/></td>
<%--        nie wiem czy przy usuwaniu musi byc linia 23,28,33,38,43 ??--%>
        <td><form:errors disabled="true" path="companyName" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Company adress:</td>
        <td><form:password disabled="true" path="companyAdress"/></td>
        <td><form:errors path="companyAdress" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Contact Person:</td>
        <td><form:input disabled="true" path="contactPerson"/></td>
        <td><form:errors path="contactPerson" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Phone nr:</td>
        <td><form:input disabled="true" path="phoneNr"/></td>
        <td><form:errors path="phoneNr" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Email:</td>
        <td><form:input disabled="true" path="email"/></td>
        <td><form:errors path="email" cssClass="error"/></td>
    </tr>
</table>
<table align="center">
    <tr>
            <%--            nie wiem czy linia 69 jest potrzebna ??? , musze zmienic value="register" nie wiem na co
            --%>
        <td><input type="hidden" path="id"/></td>
        <td><input type="submit" value="Remove contact !"/></td>
    </tr>
</table>
