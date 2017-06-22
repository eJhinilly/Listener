<%--
  Created by IntelliJ IDEA.
  User: localhost
  Date: 17-6-21
  Time: 下午3:38
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.removeAttribute("requestName");
    request.getSession().removeAttribute("sessionName");
    request.getSession().getServletContext().removeAttribute("contextName");

    request.getSession().removeAttribute("currentUser");
%>
<html>
<head>
    <title>这是销毁界面</title>
</head>
<body>
    这是销毁界面
    <button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
    <button onclick="location.href='<%=request.getContextPath()%>/destroy.jsp';">Destory</button>
</body>
</html>
