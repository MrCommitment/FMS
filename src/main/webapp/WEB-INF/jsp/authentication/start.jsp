<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<title>FMS_start </title>

<h2 align="center">${headerMessage}</h2>

<h3 align="center">Please log as: </h3>
<table align="center">
    <tr>
        <div align="center">

            <a href="<c:url value="/user/authentication" /> ">
                <button>
                    Disponent
                </button>
            </a>

        </div>
    </tr>
</table>
<h3 align="center">Please register as: </h3>
<table align="center">
    <tr>
        <div align="center">


            <a href="<c:url value="/user/register/add" /> ">
                <button>
                    New disponent
                </button>
            </a>

        </div>
    </tr>
</table>


<%--source code bellow--%>

<%--    <style>--%>
<%--        a {--%>
<%--            display: block;--%>
<%--            margin-bottom: 20px;--%>
<%--        }--%>
<%--        div {--%>
<%--            display: inline-block;--%>
<%--            margin-left: 100px;--%>
<%--        }--%>
<%--    </style>--%>
<%--<h2 align="center"> Welcome in FMS (Freight Management System)</h2>--%>
<%--            <div>--%>
<%--                <h3 align="center">Log as </h3>--%>
<%--                <a href="<c:url value="/user/authentication" /> ">--%>
<%--                    <button>--%>
<%--                        Disponent--%>
<%--                    </button>--%>
<%--                </a>--%>
<%--            </div>--%>
<%--            <div>--%>
<%--                <h3 align="center">Register as</h3>--%>
<%--                <a href="<c:url value="/user/register/add" /> ">--%>
<%--                    <button>--%>
<%--                        Disponent--%>
<%--                    </button>--%>
<%--                </a>--%>
<%--            </div>--%>
