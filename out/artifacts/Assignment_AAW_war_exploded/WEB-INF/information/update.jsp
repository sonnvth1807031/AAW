<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<s:head></s:head>
<body>
<h1>Information form update</h1>
<s:form action="updated" method="post">
    <input type="hidden" <s:textfield name="information.id"/>
    <div>
        <s:label value="Subjects"/>
        <s:textfield name="information.subjects"/>
    </div>
    <div>
        <s:label value="Name"/>
        <s:textfield name="information.name"/>
    </div>
    <div>
        <s:label value="Student Code"/>
        <s:textfield name="information.rollNumber"/>
    </div>
    <div>
        <s:label value="Theoretical Point"/>
        <s:textfield name="information.theoreticalPoint"/>
    </div>
    <div>
        <s:label value="Practice Points"/>
        <s:textfield name="information.practicePoints"/>
    </div>
    <div>
        <s:label value="Assignment Points"/>
        <s:textfield name="information.AssignmentPoints"/>
    </div>
    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>
</body>
</html>
