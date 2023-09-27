package repository;

import domain.Charactor;
import domain.Weapon;

import java.sql.*;

public class WeaponRepository {

    private Connection connection = null;

    public WeaponRepository() {
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
    public void createSwordTable(){
        String tableSQL = "CREATE TABLE IF NOT EXISTS Sword (" +
                "lv INT AUTO_INCREMENT PRIMARY KEY," +
                "gold VARCHAR(255) NOT NULL," +
                "atk VARCHAR(255) NOT NULL,";
        try {
            try (PreparedStatement statement = connection.prepareStatement(tableSQL)) {
                statement.execute();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createArmorTable(){
        String tableSQL = "CREATE TABLE IF NOT EXISTS Armor (" +
                "lv INT AUTO_INCREMENT PRIMARY KEY," +
                "gold VARCHAR(255) NOT NULL," +
                "def VARCHAR(255) NOT NULL,";
        try {
            try (PreparedStatement statement = connection.prepareStatement(tableSQL)) {
                statement.execute();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------- <Save> --------------------------------
    public void save_sword(Weapon weapon){
        try{
            String insertSQL = "INSERT INTO Sword (gold, atk) VALUES (50, 4)"+
                    "INSERT INTO Sword (gold, atk) VALUES (100, 6)"+
                    "INSERT INTO Sword (gold, atk) VALUES (100, 6)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
            insertStatement.setInt(1, weapon.getGold());
            insertStatement.setInt(2, weapon.getAtk());

            insertStatement.execute();
            insertStatement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save_armor(Weapon weapon){
        try{
            String insertSQL = "INSERT INTO Armor (gold, def) VALUES (50, 1)"+
                    "INSERT INTO Armor (gold, def) VALUES (100, 2)"+
                    "INSERT INTO Armor (gold, def) VALUES (150, 3)";
            PreparedStatement insertStatement = connection.prepareStatement(insertSQL);
            insertStatement.setInt(1, weapon.getGold());
            insertStatement.setInt(2, weapon.getDef());

            insertStatement.execute();
            insertStatement.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // -------------- <Find> --------------------------------
    public Charactor findSwordId(Long lv) {
        String selectSQL = "SELECT * FROM Sword WHERE ID=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setLong(1, lv);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                return new Charactor(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("maxHp"),
                        resultSet.getInt("hp"),
                        resultSet.getInt("atk"),
                        resultSet.getInt("def"),
                        resultSet.getInt("speed"),
                        resultSet.getInt("gold"));
            }

            resultSet.close();
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Charactor findArmorId(Long lv) {
        String selectSQL = "SELECT * FROM Armor WHERE ID=?";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL)) {

            statement.setLong(1, lv);
            ResultSet resultSet = statement.executeQuery();

            if(resultSet.next()){
                return new Charactor(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("maxHp"),
                        resultSet.getInt("hp"),
                        resultSet.getInt("atk"),
                        resultSet.getInt("def"),
                        resultSet.getInt("speed"),
                        resultSet.getInt("gold"));
            }

            resultSet.close();
            return null;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


}
