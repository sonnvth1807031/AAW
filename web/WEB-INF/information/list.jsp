<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2 style="text-align: center">List Information</h2>

<table>
    <tr>
        <th>Action</th>
        <th>Subjects</th>
        <th>Name</th>
        <th>RollNumber</th>
        <th>Theoretical Point</th>
        <th>Practice Points</th>
        <th>Assignment Points</th>
    </tr>
    <s:iterator value="InformationList">
        <tr>
            <td>
                <span>
                    <s:form action="getById" method="post">
                        <input type="hidden" name="information.id" value="<s:property value="id"></s:property>">
                        <button type="submit">
                            <i class="material-icons">Update</i>
                        </button>
                    </s:form>
                </span>
<%--                <span><a class="material-icons" href=/getById?id=<s:property value="id"></s:property>>update</span>--%>
                <span>
                    <s:form action="delete" method="post">
                        <input type="hidden" name="information.id" value="<s:property value="id"></s:property>">
                        <button type="submit">
                            <i class="material-icons">Delete</i>
                        </button>
                    </s:form>
                </span>
            </td>
            <td><s:property value="subjects"></s:property>&nbsp</td>
            <td><s:property value="name"></s:property></td>
            <td><s:property value="rollNumber"></s:property></td>
            <td><s:property value="theoreticalPoint"></s:property></td>
            <td><s:property value="practicePoints"></s:property></td>
            <td><s:property value="AssignmentPoints"></s:property></td>
        </tr>
    </s:iterator>
</table>
<span style="text-align: center">
    <s:form action="create" method="GET">
        <button type="submit">
            <i class="material-icons">Create</i>
        </button>
    </s:form>
</span>
</body>
</html>
