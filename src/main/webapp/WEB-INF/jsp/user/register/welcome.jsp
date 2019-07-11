<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<head>
    <title>Welcome Page</title>
</head>
<body>
<h3 align="center">
    <a href="<c:url value="/mainMenu" />">
        <button>
            Back to Main Menu
        </button>
    </a>
</h3>
<h2 align="center">${headerMessage}</h2>
<h3 align="center">You have been registered as :</h3>
<table align="center" border="8px">
    <tr>
        <td>Name:</td>
        <td>${user.firstName}</td>
    </tr>
    <tr>
        <td>Second name:</td>
        <td>${user.secondName}</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${user.email}</td>
    </tr>
</table>
</body>
</html>