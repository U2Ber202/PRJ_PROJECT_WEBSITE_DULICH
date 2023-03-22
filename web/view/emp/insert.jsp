<%-- 
    Document   : add
    Created on : 21-03-2023, 06:02:22
    Author     : tedok
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new tour</h1>
        <form action="insert" method="post">
            Tour Name: <input type="text" name="name"/><br/>
            Tour Journey: 
            <input type="text" name="day" list="daynumb" size="1">
            <datalist id="daynumb">
                <c:forEach var="i" begin="1" end="31" step="1">
                    <option value="${i}">
                    </c:forEach>
            </datalist> days and
            <input type="text" name="night" list="nightnumb" size="1">
            <datalist id="nightnumb">
                <c:forEach var="i" begin="1" end="31" step="1">
                    <option value="${i}">
                    </c:forEach>
            </datalist> nights<br/>
            Price: <input type="text" name="price" size="10"/><br/>
            Description: <input type="text" name="desc"/><br/>
            From <input type="text" name="from"> to <input type="text" name="to"/><br/>
            <input type="submit" value="Insert" /><br/>
        </form>
    </body>
</html>
