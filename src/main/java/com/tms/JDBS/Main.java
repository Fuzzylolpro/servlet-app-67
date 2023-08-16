package com.tms.JDBS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        //регистрация драйвера
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        //создать соедиенение
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group-67-database", "postgres", "root");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
