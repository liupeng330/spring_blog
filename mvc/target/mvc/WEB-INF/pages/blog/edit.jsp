<%--
  Created by IntelliJ IDEA.
  User: peng
  Date: 9/23/15
  Time: 10:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
  <title></title>
</head>
<body>
<sf:form modelAttribute="blogInfo" method="post" enctype="multipart/form-data">

  Title: <sf:input path="title" id="title"/> <br/>
  Content: <sf:input path="content" id="content"/> <br/>
  User: <sf:input path="relaseUser" id="user"/> <br/>

  <input type="submit" value="Submit"/>
</sf:form>
</body>
</html>
