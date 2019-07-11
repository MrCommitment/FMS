<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


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
<br/>
<form:form method="post" modelAttribute="loadInfo">
    <h3 align="left">Add cargo :</h3>
    <table align="left">
        <caption align="top">Loading cargo form:</caption>
        <tr>
            <td>Country:</td>
            <td><form:input path="loadingCountry"/></td>
            <td><form:errors path="loadingCountry" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Loading place:</td>
            <td><form:input path="loadingCity"/></td>
            <td><form:errors path="loadingCity" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Post code:</td>
            <td><form:input path="loadingPostCode"/></td>
            <td><form:errors path="loadingPostCode" cssClass="error"/></td>
        </tr>
    </table>

<br/>

    <h3 align="left">Add cargo :</h3>
    <table align="left">
        <caption align="top">Unloading cargo form:</caption>
        <tr>
            <td>Country:</td>
            <td><form:input path="unloadingCountry"/></td>
            <td><form:errors path="unloadingCountry" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Unloading place:</td>
            <td><form:input path="unloadingCity"/></td>
            <td><form:errors path="unloadingCity" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Post code:</td>
            <td><form:input path="unloadingPostCode"/></td>
            <td><form:errors path="unloadingPostCode" cssClass="error"/></td>
        </tr>
    </table>

<br/>

<h3 align="left">Cargo details :</h3>
<table align="left">
    <caption align="top">Load form:</caption>
    <tr>
        <td>Weight:</td>
        <td><form:input path="weight"/></td>
        <td><form:errors path="weight" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Type of goods:</td>
        <td><form:input path="goods"/></td>
        <td><form:errors path="goods" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Transit time:</td>
        <td><form:input path="transitTime"/></td>
        <td><form:errors path="transitTime" cssClass="error"/></td>
    </tr>
</table>


<br/>

<h3 align="left">Add truck :</h3>
<table align="left">
    <caption align="top">Truck form:</caption>
    <tr>
        <td>Truck nr:</td>
        <td><form:input path="truckNr"/></td>
        <td><form:errors path="truckNr" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Driver details:</td>
        <td><form:input path="driverDetails"/></td>
        <td><form:errors path="driverDetails" cssClass="error"/></td>
    </tr>
    <tr>
        <td>Trailer type:</td>
        <td><form:input path="trailer"/></td>
        <td><form:errors path="trailer" cssClass="error"/></td>
    </tr>
    <table>
        <tr>
            <td><input type="hidden" name="action" value="register"/></td>
            <td><input type="submit" value="Save load form !"/></td>
        </tr>
    </table>
</table>
</form:form>

<br/>
<table align="bottom">
    <tr>
    <div align="bottom">

        <a href="<c:url value="/goMenu" /> ">
            <button>
                Back to Main menu ->
            </button>
        </a>
    </div>
    </tr>
</table>


