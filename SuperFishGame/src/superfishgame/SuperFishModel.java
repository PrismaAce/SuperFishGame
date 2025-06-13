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
    }
}
