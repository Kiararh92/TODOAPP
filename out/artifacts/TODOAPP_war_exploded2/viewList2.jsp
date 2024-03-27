<%@ page import="java.util.List" %>
<%@ page import="com.spring24.todoapp.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>To-Do List</h2>

<form action="AddT" method="get">
<%
    List<Task> tasks = (List<Task>) request.getAttribute("tasks");
    if(tasks == null || tasks.isEmpty()) {
        out.println("<p> No tasks found.</p>");
    } else {
        for (Task task : tasks) {
            out.println("<p>" + task.getTask() + "</p>");
        }
    }
%>
</form>

</body>
</html>
