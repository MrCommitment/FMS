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
<form:form method="post" modelAttribute="place">
    <h3 align="left">Add cargo :</h3>
    <table align="left">
        <caption align="top">Loading cargo form:</caption>
        <tr>
            <td>Country:</td>
            <td><form:input path="country1"/></td>
            <td><form:errors path="country1" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Loading place:</td>
            <td><form:password path="loadingPlace"/></td>
            <td><form:errors path="loadingPlace" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Post code:</td>
            <td><form:input path="postCode1"/></td>
            <td><form:errors path="postCode" cssClass="error"/></td>
        </tr>
    </table>
    <table>
        <tr>
<%--            value = nie wiem , jeszcze ??--%>
            <td><input type="hidden" name="action" value="register"/></td>
            <td><input type="submit" value="Save loading form !"/></td>
        </tr>
    </table>
</form:form>
<br/>
<form:form method="post" modelAttribute="place">
    <h3 align="right">Add cargo :</h3>
    <table align="right">
        <caption align="top">Unloading cargo form:</caption>
        <tr>
            <td>Country:</td>
            <td><form:input path="country2"/></td>
            <td><form:errors path="country2" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Unloading place:</td>
            <td><form:input path="unloadingPlace"/></td>
            <td><form:errors path="unloadingPlace" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Post code:</td>
            <td><form:input path="postCode2"/></td>
            <td><form:errors path="postCode2" cssClass="error"/></td>
        </tr>
    </table>
    <table>
        <tr>
                <%--            value = nie wiem , jeszcze ??--%>
            <td><input type="hidden" name="action" value="register"/></td>
            <td><input type="submit" value="Save unloading form !"/></td>
        </tr>
    </table>
</form:form>
<br/>
<form:form method="post" modelAttribute="place">
<h3 align="bottom">Cargo details :</h3>
<table align="bottom">
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
<table>
    <tr>
            <%--            value = nie wiem , jeszcze ??--%>
        <td><input type="hidden" name="action" value="register"/></td>
        <td><input type="submit" value="Save !"/></td>
    </tr>
</table>
</form:form>
<br/>
<form:form method="post" modelAttribute="truck">
<h3 align="center">Add truck :</h3>
<table align="center">
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
                <%--            value = nie wiem , jeszcze ??--%>
            <td><input type="hidden" name="action" value="register"/></td>
            <td><input type="submit" value="Save truck form !"/></td>
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


