<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<title>Contact menu </title>

<h2 align="center">${headerMessage2}</h2>

<h3 align="center">Contact menu: </h3>
<table align="center">
    <tr>
        <div align="center">
            <a href="<c:url value="/contacts/goAdd" /> ">
                <button>
                    Add new contact
                </button>
            </a>
        </div>
        <div align="center">
            <a href="<c:url value="/edit" /> ">
                <button>
                    Edit contact
                </button>
            </a>
        </div>
        <div align="center">

            <a href="<c:url value="/remove" /> ">
                <button>
                    Remove contact
                </button>
            </a>
        </div>
        <div align="center">
            <a href="<c:url value="/contacts/all" /> ">
                <button>
                    Show all contacts
                </button>
            </a>
        </div>
        <div align="center">
            <a href="<c:url value="/goMenu" /> ">
                <button>
                    Back to Main menu ->
                </button>
            </a>
        </div>
    </tr>
</table>