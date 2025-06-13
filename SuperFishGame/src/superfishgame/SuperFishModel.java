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
                statement.executeUpdate("CREATE TABLE FISHTABLE (fish_id INT, amount INT)");
            }
            else 
            {
                System.out.println("Yes fish table");
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
    
    public void addFishToTable()
    {
        
    }
}
