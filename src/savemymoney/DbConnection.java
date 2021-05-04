/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savemymoney;

import java.sql.*;

/**
 *
 * @author pengg
 */
public class DbConnection {
    Connection con = null;

    public static Connection ConnectionDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:database.db");

            System.out.println("Connection Success");
            return con;
        } catch (Exception e) {
            System.out.println("Connection Failed" + e);
            return null;
        }
    }
}
