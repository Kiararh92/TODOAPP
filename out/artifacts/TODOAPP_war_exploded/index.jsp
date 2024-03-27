<!--  -->
<!-- This directive sets the content type and character encoding for the page, Java as the scripting language -->
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
    <title> To Do App </title>
    <!-- Title of the HTML page. Displayed in the browser's title tab -->
</head>
<body>
<h2> Task Menu</h2>
<!-- A header that appears on the page to indicate the purpose of the form -->

<form name="myForm" action="results.jsp" method="post">
    <!-- HtML form. action attribute specifies where the form data is being sent once submitted. To jsp "results".
         method attribute specifies the HTTP method(post) used to send this data -->
    <table>

        <tbody>

        <tr>
            <td>Task ID:</td>
            <td><label>
                <input type="number" name="taskNumber" value="" size="10"/>
            </label></td>
            <td>Task:</td>
            <td><label>
                <input type="text" name="subject" value="" size="30"/>
            </label></td>
        </tr>
        </tbody>
    </table>

    <!-- A submit button. Once clicked, the data from the form is sent to the server. -->
    <input type="reset" value="Clear" name="clear"/>
    <input type="submit" value="Submit" name="submit"/>





</form>


</body>
</html>