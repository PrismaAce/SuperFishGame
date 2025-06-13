/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superfishgame;

import java.sql.*;

/**
 *
 * @author codem
 */
public class SuperFishModel {
    // Separate from Database Manager since I want to run SQL commands here.
    private final DatabaseManager DBManager;
    private final Connection connection;
    private Statement statement;

    public SuperFishModel() {
        DBManager = new DatabaseManager();
        connection = DBManager.getConnection();
        setupDB();
    }
    
    private void setupDB()
    {
        try
        {
            statement = connection.createStatement();
            if (!fishTableExists())
            {
                statement.executeUpdate("CREATE TABLE FISHTABLE (fish_id INT PRIMARY KEY, amount INT)");
                statement.executeUpdate("INSERT INTO FISHTABLE (fish_id, amount) VALUES ( 0 , 0)");
            }
            else 
            {
                System.out.println("Yes fish table");
                System.out.println("DB location: " + new java.io.File("SuperFishDB").getAbsolutePath());
            }
            statement.close();
        }
        catch (SQLException e)
        {
                    
        }
    }
    
    private boolean fishTableExists()
    {
        try 
        {
            DatabaseMetaData meta = connection.getMetaData();
            try
            {
                ResultSet rs = meta.getTables(null, null, "FISHTABLE", null);
                return rs.next();
            }
            catch (SQLException ex) {}
        } 
        catch (SQLException ex) {}
        return false;
    }
    
    public void initialiseFish(int fid)
    {
        try
        {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM FISHTABLE WHERE fish_id = " + fid);
            rs.next();
            if (rs.getInt(1) == 0) {
                statement.executeUpdate("INSERT INTO FISHTABLE (fish_id, amount) VALUES (" + fid + ", 0)");
            }
            statement.close();
            System.out.println("Initalising");
        }
        catch (SQLException e)
        {
            System.out.println("sql err when initalising");
        }
    }
    public void incrementFish(int fid)
    {
        try
        {
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE FISHTABLE SET AMOUNT = AMOUNT + 1 WHERE FISH_ID = "+fid);
            statement.close();
            System.out.println("Initalising+");
        }
        catch (SQLException e)
        {
            System.out.println("sql err when incrementing");
        }
    }
    public int getAmountByID(int fid)
    {
        try
        {
            statement = connection.createStatement();
            String sql = "SELECT AMOUNT FROM FISHTABLE WHERE FISH_ID = "+fid;
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("AMOUNT");
            }
            statement.close();
            System.out.println("trying to get");
        }
        catch (SQLException e)
        {
            System.out.println("sql err");
            return 0;
        }
        System.out.println("unknown err");
        return 0;
    }
    
    
    
}
