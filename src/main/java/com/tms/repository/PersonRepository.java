package com.tms.repository;

import com.tms.domain.Person;
import com.tms.domain.Role;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@Repository
public class PersonRepository {
    Connection connection;

    {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group-67-database", "postgres", "root");
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

     public List<Person> getAll() {
         List<Person> list = new ArrayList<>();
         try {
             PreparedStatement statement = connection.prepareStatement("select * from person");
             ResultSet resultSet = statement.executeQuery();
             while (resultSet.next()) {
                 Person person = sqlParser(resultSet);
                 list.add(person);
             }
         } catch (SQLException e) {
             System.out.println(e);
         }
         return list;
     }
    public Boolean create(Person person) {
        try {
            PreparedStatement statement = connection.prepareStatement("insert into person(id,first_name,second_name,age,is_married,created)" + "VALUES (default,?,?,?,?,?)");
            statement.setString(1, person.getFirstName());
            statement.setString(2, person.getSecondName());
            statement.setInt(3, person.getAge());
            statement.setBoolean(4, person.getIsMarried());
            statement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            statement.executeUpdate();
            connection.commit();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public Person sqlParser(ResultSet result) throws SQLException {
        Person person = new Person(new Role());
        person.setId(result.getLong("id"));
        person.setFirstName(result.getString("first_name"));
        person.setSecondName(result.getString("second_name"));
        person.setAge(result.getInt("age"));
        person.setIsMarried(result.getBoolean("is_married"));
        person.setCreated(result.getTimestamp("created"));
        return person;
    }
}