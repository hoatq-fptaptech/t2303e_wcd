<%@ page import="wcd.entity.Classroom" %><%--
  Created by IntelliJ IDEA.
  User: quanghoatrinh
  Date: 14/11/2024
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Classroom c = (Classroom)request.getAttribute("classroom"); %>
<html>
<head>
    <title>Create new classroom</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
  <div class="container">
    <form action="?action=update" method="post">
      <input type="hidden" name="id" value="<%= c.getId() %>"/>
      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Class name</label>
        <input value="<%= c.getName() %>" name="name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </div>
</body>
</html>