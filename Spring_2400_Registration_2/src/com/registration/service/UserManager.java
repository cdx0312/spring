package com.registration.service;

import com.registration.model.User;

import java.sql.*;

public class UserManager {
    public boolean exists(User user)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "linux");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM USER WHERE username = ?");
        preparedStatement.setString(1, user.getUsername());
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);

        connection.close();
        preparedStatement.close();

        return count > 0;
    }

    public void add(User user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/spring", "root", "linux");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user values (NULL , ?, ?) ");
        preparedStatement.setString(1, user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
