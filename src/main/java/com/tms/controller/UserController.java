package com.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/register")
    public String userRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam("login") String login,
                               @RequestParam("password") String password, @RequestParam("email") String email, @RequestParam("age") String age) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            String insertQuery = "INSERT INTO users (id,login, password,email,age) VALUES (default,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, age);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "succes";
    }
}
