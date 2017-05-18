<%--
  Created by IntelliJ IDEA.
  User: zhongmc
  Date: 2017/5/16
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello</title>
    <link href="resources/asset/css/style.css" rel="stylesheet" type="text/css" >
    <script src="asset/js/common.js" type="application/javascript"></script>
</head>
<body>
    <div class="box" style="background-image: url('resources/asset/image/bg.jpg')">
        <ul>
            <c:forEach items="${students}" var="student">
                <li>
                    ${student.id}
                    ${student.name}
                    ${student.gender}
                    ${student.sex}
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
