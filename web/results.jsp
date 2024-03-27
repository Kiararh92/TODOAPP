<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Tasks</title>
</head>
<%
    int taskID = Integer.parseInt(request.getParameter("taskNumber"));
    String subject = request.getParameter("subject");
    %>
<body>
<h1>To-Do List</h1>

<table border="1">
    <tbody>
        <tr>
            <td>TaskID</td>
            <td>Tasks</td>
        </tr>
        <tr>
            <td><%= taskID %></td>
            <td><%= subject %></td>
        </tr>
        <tr>
            <td><%= taskID %></td>
            <td><%= subject %></td>
        </tr>
        <tr>
            <td><%= taskID %></td>
            <td><%= subject %></td>
        </tr>
    </tbody>
</table>

<form name="returnForm" action="index.jsp" method="post">

<input type="submit" value="Return" name="return"/>

</form>

</body>
</html>
