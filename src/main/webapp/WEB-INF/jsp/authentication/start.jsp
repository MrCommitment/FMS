<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Log in | FMS (Freight Management System) </title>
    <style>
        a {
            display: block;
            margin-bottom: 10px;
        }
        div{
            display: inline-block;
            margin-right: 50px;
        }
    </style>

<body>
    <h1> Welcome in FMS </h1>
<div>
    <h3>Log in </h3>

    <a href="<c:url value="/user/authentication" /> ">
        <button>
            Disponent
        </button>
    </a>

</div>
<div>
    <h3>Register as</h3>

    <a href="<c:url value="/user/register/add" /> ">
        <button>
            Disponent
        </button>
    </a>

</div>