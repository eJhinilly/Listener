<%@ page import="com.imooc.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: localhost
  Date: 17-6-21
  Time: 下午3:30
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setAttribute("requestName", "requestValue");
    request.getSession().setAttribute("sessionName", "sessionValue");
    request.getSession().getServletContext().setAttribute("contextName", "contextValue");
    request.setAttribute("requestName", "requestValue");
    request.removeAttribute("requestName");

    request.getSession().setAttribute("currentUser",new User());
%>
<html>
<head>
    <title>这是初始化的界面</title>
</head>
<body>
    这是初始化的界面
    <button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
    <button onclick="location.href='<%=request.getContextPath()%>/destroy.jsp';">Destory</button>
</body>
</html>
