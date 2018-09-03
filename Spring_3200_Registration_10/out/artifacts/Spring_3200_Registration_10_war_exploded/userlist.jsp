<%--
  Created by IntelliJ IDEA.
  User: cdx0312
  Date: 2017/10/23
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>用户列表</title>
  </head>
  <body>
    <s:iterator value="users">
        <s:property value="username"/>
    </s:iterator>
  </body>
</html>
