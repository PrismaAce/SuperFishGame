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
public class TableManager {
    private final DatabaseManager DBManager;
    private final Connection connection;
    private Statement statement;

    public TableManager() {
        DBManager = new DatabaseManager();
        connection = DBManager.getConnection();
    }
}
