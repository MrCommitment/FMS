<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<title>Main Menu </title>

<h3 align="center">Hello ${user.firstName}</h3>

<h2 align="center">${headerMessage2}</h2>

<h3 align="center">Main Menu: </h3>
<table align="center">
    <tr>
        <div align="center">

            <a href="<c:url value="/addLoad" /> ">
                <button>
                    Add load
                </button>
            </a>
        </div>
        <div align="center">

            <a href="<c:url value="/goHistory" /> ">
                <button>
                    Check history
                </button>
            </a>
        </div>
        <div align="center">
            <a href="<c:url value="/goContactMenu" /> ">
                <button>
                    Contact List
                </button>
            </a>
        </div>
        <div align="center">

            <a href="https://www.google.com/maps/dir///@51.4270853,7.6639887,8z/data=!4m2!4m1!3e0" />
                <button>
                    Go to Map ->
                </button>
            </a>
        </div>
        </div>
        <div align="center">

            <a href="<c:url value="/backToStart" /> ">
                <button>
                    Back to start site ->
                </button>
            </a>
        </div>
        <div align="center">

            <a href="<c:url value="/user/authentication" /> ">
                <button>
                    Back to login page ->
                </button>
            </a>
        </div>
    </tr>
</table>




