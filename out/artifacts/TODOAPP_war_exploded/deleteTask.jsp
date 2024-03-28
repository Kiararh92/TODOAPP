<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title> Deleting a Task </title>
</head>
<body>
<h2> Delete a Task </h2>

<form name="deletionForm" action="ToDoServlet" method="post">
    <input type="hidden" name="action" value="delete" />

            <label for="taskID"> Task ID: </label>
                <input type="number" name="taskID" id="taskID" value="" size="10"/>


    <input type="reset" value="Clear" name="clear"/>
    <input type="submit" value="Delete" name="delete"/>
</form>

<form name="returnForm" action="index.jsp">
    <input type="submit" value="Return" name="return"/>
</form>
</body>
