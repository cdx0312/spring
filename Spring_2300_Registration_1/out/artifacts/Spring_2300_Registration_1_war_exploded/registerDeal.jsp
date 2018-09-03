<%@ page language="java" import="java.util.*, java.sql.*" pageEncoding="GB18030"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  String password2 = request.getParameter("password2");
  try {
    Class.forName("com.mysql.jdbc.Driver");
  } catch (ClassNotFoundException e) {
    e.printStackTrace();
  }

  Connection connection = null;
  PreparedStatement preparedStatement = null;

  try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "linux");
      preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM USER WHERE username = ?");
      preparedStatement.setString(1, username);
      ResultSet resultSet = preparedStatement.executeQuery();
      resultSet.next();
      int count = resultSet.getInt(1);
      if (count > 0) {
          response.sendRedirect("registerFail.jsp");
          connection.close();
          preparedStatement.close();
          return;
      }
      preparedStatement = connection.prepareStatement("INSERT INTO user VALUES (NULL ,? , ? )");
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);
      preparedStatement.executeUpdate();
      preparedStatement.close();
      connection.close();
      response.sendRedirect("registerSuccess.jsp");
  } catch (SQLException e) {
      e.printStackTrace();
  }
%>

