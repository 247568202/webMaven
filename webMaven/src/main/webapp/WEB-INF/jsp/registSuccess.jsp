<%--
  Created by IntelliJ IDEA.
  User: alvin
  Date: 15/9/8
  Time: 下午6:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title></title>
</head>
<body>
<br>恭喜你:
${user.userName},${message}
<br>
<a href="http://localhost:8080/webMaven/">去登录</a>
</body>
</html>