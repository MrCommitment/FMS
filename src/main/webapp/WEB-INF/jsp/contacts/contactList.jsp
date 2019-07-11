<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<head>
    <title>All contacts page</title>
    <style type="text/css">
        .error {
            color: orangered;
        }
    </style>
</head>
<body>
<h3 align="center">${headerMessage2}</h3>

<%--<form:form method = "GET" action = "add">--%>
<%--    <table align="center">--%>
<%--        <caption align="top">Add form:</caption>--%>
<%--        <tr>--%>
<%--            <td><input type = "submit" value = "Add contact"/></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>

<%--<form:form method = "GET" action = "all"--%>
<%--           modelAttribute="contactViewMode">--%>
<%--     <table align="center">--%>
<%--         <caption align="top">Search e-mail form:</caption>--%>
<%--         <tr>--%>
<%--            <td><form:input path="emailSearch" /></td>--%>
<%--            <td><input type="hidden" value="email" name="searchMode"/></td>--%>
<%--            <td><input type = "submit" value = "Email search"/></td>--%>
<%--         </tr>--%>
<%--     </table>--%>
<%--</form:form>--%>

<%--<form:form method = "GET" action = "all"--%>
<%--                    modelAttribute="contactViewMode">--%>
<%--      <table align="center">--%>
<%--          <caption align="top">Search Company name form:</caption>--%>
<%--          <tr>--%>
<%--              <td><form:input path="companyNameSearch" /></td>--%>
<%--              <td><input type="hidden" value="companyName" name="searchMode"/></td>--%>
<%--              <td><input type = "submit" value = "Company name search"/></td>--%>
<%--          </tr>--%>
<%--      </table>--%>
<%--</form:form>--%>

<%--<form:form method = "GET" action = "all"--%>
<%--                    modelAttribute="contactViewMode">--%>
<%--      <table align="center">--%>
<%--          <caption align="top">Search person form:</caption>--%>
<%--          <tr>--%>
<%--              <td><form:input path="contactPersonSearch" /></td>--%>
<%--              <td><input type="hidden" value="contactPerson" name="searchMode"/></td>--%>
<%--              <td><input type = "submit" value = "Contact person search"/></td>--%>
<%--          </tr>--%>
<%--      </table>--%>
<%--</form:form>--%>

<%--]<form:form method = "GET" action = "all"--%>
<%--                    modelAttribute="contactViewMode">--%>
<%--      <table align="center">--%>
<%--          <caption align="top">Search all form:</caption>--%>
<%--          <tr>--%>
<%--              <td><input type="hidden" value="all" name="searchMode"/></td>--%>
<%--              <td><input type = "submit" value = "Show all"/></td>--%>
<%--          </tr>--%>
<%--      </table>--%>
<%--</form:form>--%>

<%--<br />--%>

<c:forEach items="${allContacts}" var="contacts">
    <b>Company name:</b> ${contacts.companyName} <br />
    <b>Company adress:</b> ${contacts.companyAdress} <br />
    <b>Contact person:</b> ${contacts.contactPerson} <br />
    <b>Contact phone nr:</b> ${contacts.phoneNr} <br />
    <b>Contact e-mail:</b> ${contacts.email} <br />

<%--    <form:form method = "post" modelAttribute="contactViewMode">--%>
<%--          <table align="center">--%>
<%--              <tr>--%>
<%--                  <td><input type="hidden" value="remove" name="mode"/></td>--%>
<%--                  <td><input type="hidden" value="${contacts.id}" name="objectId"/></td>--%>
<%--                  <td><input type = "submit" value = "Remove contact"/></td>--%>
<%--              </tr>--%>
<%--          </table>--%>
<%--    </form:form>--%>
<%--    <form:form method = "post" modelAttribute="contactViewMode">--%>
<%--    <table align="center">--%>
<%--        <tr>--%>
<%--            <td><input type="hidden" value="edit" name="mode"/></td>--%>
<%--            <td><input type="hidden" value="${contacts.id}" name="objectId"/></td>--%>
<%--            <td><input type = "submit" value = "Edit contact"/></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--    </form:form>--%>
    <br />
</c:forEach> <br />