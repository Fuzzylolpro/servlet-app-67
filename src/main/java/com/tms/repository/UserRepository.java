package com.tms.repository;

import com.tms.domain.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
public class UserRepository {
    Connection connection;

    {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean createUser(User user){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (id,login, password,email,age) VALUES (default,?,?,?,?)");
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, String.valueOf(user.getAge()));
            preparedStatement.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

}
