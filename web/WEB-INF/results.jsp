<%@ page import="com.spring24.todoapp.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Tasks</title>
</head>
<%
    //int taskID = Integer.parseInt(request.getParameter("taskNumber"));
    //AddTask.addTask(subject);
    String subject = request.getParameter("subject");
    List<Task> tasks = (List<Task>) request.getAttribute("tasks");
    %>
<body>
<h1>To-Do List</h1>

<table border="1">
    <tbody>
    <tr>
        <th>ID</th>
        <th>Subject</th>
    </tr>
    <% for (Task task : tasks) { %>
    <tr>
        <td><%= task.getTaskNumber() %></td> <td><%= task.getTask() %></td> </tr>
    <% } %>
    </tbody>
</table>

<form name="returnForm" action="../../src/webapp/index.jsp">
    <input type="submit" value="Return" name="return"/>
</form>

</body>
</html>
