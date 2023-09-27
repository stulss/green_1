package Repository;

import domain.User;
import dto.UserDto;

import java.sql.*;
import java.util.*;

// DB 접근
public class UserRepository {

    private Connection connection = null;

    public UserRepository() {
        try{
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:h2:mem:test",
                    "sa",
                    "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------- <Create> --------------------------------
    public void createTable(){
        String tableSQL = "CREATE TABLE IF NOT EXISTS User (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(255) NOT NULL," +
                "email VARCHAR(255) NOT NULL)";
        try {
            try (PreparedStatement statement = connection.prepareStatement(tableSQL)) {
                statement.execute();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save(User user) {

        try{
            if(user.getId() == null)
            {
                String insertSQL = "INSERT INTO User (name, email) VALUES (?, ?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
                insertStatement.setString(1, user.getName());
                insertStatement.setString(2, user.getEmail());

                insertStatement.execute();
                insertStatement.close();
            }
            else {
                String updateSQL = "UPDATE User SET name = ?, email = ? WHERE id = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
                updateStatement.setString(1, user.getName());
                updateStatement.setString(2, user.getEmail());
                updateStatement.setLong(3, user.getId());

                updateStatement.executeUpdate();
                updateStatement.close();
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------- <Select> --------------------------------
    public User findById(Long id) {
        String selectSQL = "SELECT * FROM User WHERE ID=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setLong(1, id);
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

    public List<User> findByName(String name) {
        String selectSQL = "SELECT * FROM User WHERE name=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();

            List<User> users = new ArrayList<>();

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

    public List<User> findAll() {
        String selectSQL = "SELECT * FROM User";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);

            List<User> users = new ArrayList<>();

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


    // -------------- <Delete> --------------------------------
    public void deleteUser(Long id){
        String selectSQL = "DELETE FROM User WHERE id=?";

        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setLong(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
