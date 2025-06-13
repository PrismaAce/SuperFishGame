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
public class DatabaseManager {
    private static final String USER = "coolusername";
    private static final String PW = "bigpassword";
    private static final String URL = "jdbc:derby:SuperFishDB; create=true";
    
    Connection connection;
    
    public DatabaseManager()
    {
        connectToDB();
    }
    
    public Connection getConnection()
    {
        return connection;
    }
    
    private void connectToDB()
    {
        try
        {
            connection = DriverManager.getConnection(URL, USER, PW);
            System.out.println("Connected!");
        }
        catch (SQLException e)
        {
            System.out.println("Failed to connect.");
        }
    }
}
