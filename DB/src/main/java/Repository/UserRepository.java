package Repository;

import domain.User;

import java.sql.*;
import java.util.*;

public class UserRepository {

    private Connection connection = null;

    public UserRepository(){
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:h2:mem:test",
                    "stuls",
                    "");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }

    //---------Create----------
    public void createTable(){
        try {
            String tableSQL = "CREATE TABLE IF NOT EXISTS User (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL)";

            try (PreparedStatement statement = connection.prepareStatement(tableSQL)) {
                statement.execute();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void save(User user) {
        try {
            String insertSQL = "INSERT INTO User (name, email) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.execute();
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //업데이트
    public void save(String email, String name) {
        try {
            String insertSQL = "UPDATE User SET name = ?, email = ?";
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.execute();
            statement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //id 검색
    public User findById(long id) {

        String selectSQL = "SELECT * FROM User WHERE ID=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()){
                return new User(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"));

            }

            resultSet.close();
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    List<User> users = new ArrayList<>();
    //이름 검색
    public List<User> findByName(String name) {

        String selectSQL = "SELECT * FROM User WHERE name=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();



            while(resultSet.next()){
                users.add(
                        new User(
                                resultSet.getLong("id"),
                                resultSet.getString("name"),
                                resultSet.getString("email"))
                );
            }

            resultSet.close();
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    // findByEmail

    public User findByEmail(String email) {

        String selectSQL = "SELECT * FROM User WHERE email=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();



            if(resultSet.next()){
                return new User(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"));

            }

            resultSet.close();
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
