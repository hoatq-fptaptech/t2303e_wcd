<%@ page import="java.util.List" %>
<%@ page import="wcd.entity.Classroom" %>
<%@ page import="wcd.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: quanghoatrinh
  Date: 05/11/2024
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Class Listing</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>List Class</h1>
    <a href="create-class">Create a new class</a>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Student number</th>
        </tr>
        </thead>
        <tbody>
        <% for(Classroom c : (List<Classroom>)request.getAttribute("classes")){ %>
        <tr>
            <th scope="row"><%= c.getId() %></th>
            <td><%= c.getName() %></td>
            <td>
                <% for(Student s: c.getStudents()){ %>
                <p><%= s.getName() %></p>
                <% } %>
            </td>
        </tr>
        <% } %>


        </tbody>
    </table>
</div>
</body>
</html>
