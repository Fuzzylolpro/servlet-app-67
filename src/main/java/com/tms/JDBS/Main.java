package com.tms.JDBS;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String fn = "Dima";


        final String SQL = "insert into person(id,first_name,second_name,age,is_married,created)" + "values (DEFAULT,?,?,?,?,?)";


        //регистрация драйвера
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        //создать соедиенение

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group-67-database", "postgres", "root");
            //выбираем один из стейтментов
            PreparedStatement statement = connection.prepareStatement(SQL);
            //Донастройка запроса
            statement.setString(1, "Dima");
            statement.setString(2, "Dima");
            statement.setInt(3, 18);
            statement.setBoolean(4, true);
            statement.setDate(5, new Date(System.currentTimeMillis()));

            //Отправка
            int result = statement.executeUpdate();
            System.out.println(result);


            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
