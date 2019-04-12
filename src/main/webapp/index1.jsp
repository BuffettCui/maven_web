<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: cuijianang
  Date: 2019/4/8
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:forEach var="user" items="${requestScope.list}">
    ${user.id}
    ${user.username}
    ${user.password}
</c:forEach>
</body>
</html>
