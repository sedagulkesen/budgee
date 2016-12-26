/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
/**
 *
 * @author edip
 */
import java.sql.*;
import javax.swing.*;
public class Database {
    Connection conn =null;
    public static Connection ConnectDB(){
        
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ROG\\Downloads\\database\\proje\\Database\\Database.sqlite");
        JOptionPane.showMessageDialog(null, "Connection is successful");
        return conn;
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
}
