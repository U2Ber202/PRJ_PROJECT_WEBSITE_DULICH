<%-- 
    Document   : update
    Created on : 22-03-2023, 16:13:48
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
        <h1>Update Site</h1>
        <c:set var="t" value="${requestScope.tour}"/>
        <form action="update" method="POST">
            Tour Id: <input type="number" readonly name="id" value="${t.tourid}"/><br/>
            Tour Name: <input type="text" name="name" value="${t.tourname}"/><br/>
            Tour Journey: 
            <input type="text" name="day" list="daynumb" size="1" value="${t.tourday}">
            <datalist id="daynumb">
                <c:forEach var="i" begin="1" end="31" step="1">
                    <option value="${i}">
                    </c:forEach>
            </datalist> days and
            <input type="text" name="night" list="nightnumb" size="1" value="${t.tournight}">
            <datalist id="nightnumb">
                <c:forEach var="i" begin="1" end="31" step="1">
                    <option value="${i}">
                    </c:forEach>
            </datalist> nights<br/>
            Price: <input type="text" name="price" size="10" value="${t.tourprice}"/><br/>
            Description: <input type="text" name="desc" value="${t.tourdescip}"/><br/>
            From <input type="text" name="from" value="${t.from}"> to <input type="text" name="to" value="${t.to}"/><br/>
            <input type="submit" value="Update" /><br/>
        </form>
    </body>
</html>
