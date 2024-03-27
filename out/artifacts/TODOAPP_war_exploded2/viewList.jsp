<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<html>
<head>
    <title>View Current To-Do List</title>
</head>
<body>
<h2>To-Do List</h2>


<form action="AddT" method="get">

    <%-- verifies if task attribute exists or not --%>

    <table>

        <tbody>

        <tr>

            <td>Task ID:<label>
                <input type="text" name="taskNumber" value="" size="5"/>
            </label></td>
            <td>Task:<label>
                <input type="text" name="task" value="" size="20"/>
            </label></td>
        </tr>

        </tbody>
    </table>

    <input type="submit" value="View To-Do List" />

</form>

</body>
</html>
