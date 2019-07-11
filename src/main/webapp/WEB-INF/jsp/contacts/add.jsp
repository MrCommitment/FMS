<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<head>
    <title>Adding contact page</title>
    <style type="text/css">
        .error {
            color: orangered;
        }
    </style>
</head>
<body>
<h3 align="center">${headerMessage2}</h3>
<form:form method="post" modelAttribute="contacts">
    <h3 align="center">Add/Edit contact :</h3>
    <table align="center">
        <caption align="top">Add/Edit form:</caption>
        <tr>
            <td>Company name:</td>
            <td><form:input path="companyName"/></td>
            <td><form:errors path="companyName" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Company adress:</td>
            <td><form:password path="companyAdress"/></td>
            <td><form:errors path="companyAdress" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Contact Person:</td>
            <td><form:input path="contactPerson"/></td>
            <td><form:errors path="contactPerson" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Phone nr:</td>
            <td><form:input path="phoneNr"/></td>
            <td><form:errors path="phoneNr" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
            <td><form:errors path="email" cssClass="error"/></td>
        </tr>
    </table>
    <table align="center">
        <tr>
<%--            nie wiem czy linia 69 jest potrzebna ??? , musze zmienic value="register" nie wiem na co
--%>
            <td><input type="hidden" name="action" value="register"/></td>
            <td><input type="submit" value="Save contact !"/></td>
        </tr>
    </table>

</form:form>

<%-- source code--%>

<%--<form:form method="post"--%>
<%--           modelAttribute="contacts">--%>
<%--    Compan: <form:input path="name"/>--%>
<%--    <form:errors path="name" /> <br />--%>

<%--    NIP: <form:input path="nip"/>--%>
<%--    <form:errors path="nip"/> <br/>--%>

<%--    REGON: <form:input path="regon"/>--%>
<%--    <form:errors path="regon"/><br />--%>
<%--    <fomr:hidden path="id"/>--%>

<%--    <input type="submit" value="Zapisz!"/>--%>
<%--</form:form>--%>