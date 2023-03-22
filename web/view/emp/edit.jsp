<%-- 
    Document   : edit
    Created on : 20-03-2023, 22:16:12
    Author     : tedok
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function isDel(id){
                if(confirm("Ready to delete id " + id + "?"))
                    window.location = "delete?id="+id; 
            }
        </script>
    </head>
    <body>
        <h1>List Tour</h1>
        <h4><a href="view/emp/insert.jsp">Add</a></h4>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Day</th>
                    <th>Night</th>
                    <th>Price</th>
                    <th>Description</th>
                    <th>Rate</th>
                    <th>From</th>
                    <th>To</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${tour}" var="t">
                    <c:set var="id" value="${t.tourid}"/>
                    <tr>
                        <td>${id}</td>
                        <td>${t.tourname}</td>
                        <td>${t.tourday}</td>
                        <td>${t.tournight}</td>
                        <td>${t.tourprice}</td>
                        <td>${t.tourdescip}</td>
                        <td>${t.tourrate}</td>
                        <td>${t.from}</td>
                        <td>${t.to}</td>
                        <td><a href="update?id=${id}">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="#" onclick="isDel('${id}')">Delete</a></td>
        </tr>
    </c:forEach>
</tbody>
</body>
</html>
