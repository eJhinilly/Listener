<%@ page import="java.util.ArrayList" %>
<%@ page import="com.imooc.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: localhost
  Date: 17-6-21
  Time: 下午5:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SessionManager</title>
  </head>
  <body>
    当前在线用户人数：${userNumber}
    <br />
    <%
      ArrayList<User> userlist  = (ArrayList<User>) request.getServletContext().getAttribute("userlist");
      if(userlist !=null){
          for(int i =0;i<userlist.size();i++){
            User user = userlist.get(i);
    %>
    IP:<%=user.getIpString() %><br />FirstTime:<%= user.getFirstTimeString() %><br />SessionId:<%= user.getSessionIdString()%><br />
    <%    }
       }
    %>
  </body>
</html>
