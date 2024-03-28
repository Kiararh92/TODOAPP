<!--  -->
<!-- This directive sets the content type and character encoding for the page, Java as the scripting language -->
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title> To Do App </title>
    <!-- Title of the HTML page. Displayed in the browser's title tab -->
</head>
<body>
<h2> To-Do App </h2>
<!-- A header that appears on the page to indicate the purpose of the form -->

<form name="addTask" action="addTask.jsp">
    <!-- HtML form. action attribute specifies where the form data is being sent once submitted.
          Menu to three jsp files. -->
    <input type="submit" value="Add a new task" name="add"/>
    <!-- A submit button. Once clicked, page will redirect to action attribute 'addTask.jsp'. -->
</form>
<form name="deleteTask" action="deleteTask.jsp">
    <input type="submit" value="Delete a task" name="delete"/>
</form>
<form name="viewTask" action="ToDoServlet" method="get">
    <input type="hidden" name="action" value="view" />
    <input type="submit" value="View To-Do List" name="view"/>
</form>

</body>
</html>