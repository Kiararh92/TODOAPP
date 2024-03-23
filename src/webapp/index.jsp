<!--  -->
<!-- This directive sets the content type and character encoding for the page, Java as the scripting language -->
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title> Add Task </title>
    <!-- Title of the HTML page. Displayed in the browser's title tab -->
</head>
<body>
<h2> Add a New Task</h2>
<!-- A header that appears on the page to indicate the purpose of the form -->

<form action="addTaskServlet" method="post">
    <!-- HtML form. action attribute specifies where the form data is being sent once submitted. To servlet "addTask".
         method attribute specifies the HTTP method(post) used to send this data -->
    <table>

        <tbody>

        <tr>
            <td>com.spring24.todoapp.Task:</td>
            <td>Description:<label>
                <input type="text" name="subject" value="" size="50"/>
            </label></td>
            <td></td>
        </tr>

        </tbody>
    </table>
    <!-- com.spring24.todoapp.Task:<input type="text" name="taskName" /> -->
    <!--Description:<input type="text" name="subject" value="" size="50"/>-->
    <!-- Input element for use to enter task. -->

    <input type="submit" value="Add" />
    <!-- A submit button. Once clicked, the data from the form is sent to the server. -->

</form>
</body>
</html>