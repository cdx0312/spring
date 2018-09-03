<%@ page language="java" import="java.util.*, java.sql.*" pageEncoding="GB18030"%>
<%@ page import="com.registration.service.UserManager" %>
<%@ page import="com.registration.model.User" %>
<%@ page import="com.registration.service.impl.UserManagerImpl" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  String password2 = request.getParameter("password2");

  User user = new User(username, password);
  UserManager userManager = new UserManagerImpl();
  if (userManager.exists(user)) {
      response.sendRedirect("registerFail.jsp");
  } else {
      userManager.add(user);
      response.sendRedirect("registerSuccess.jsp");
  }

%>

