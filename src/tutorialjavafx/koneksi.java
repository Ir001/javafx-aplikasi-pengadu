/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialjavafx;

import java.sql.*;

/**
 *
 * @author DESAIN WEB
 */
public class koneksi {
    Connection conn = null;
    public static Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/aduan";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(host,user,pass);
            //System.out.println("Koneksi Berhasil");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Koneksi Gagal "+e);
        }
        return null;
    }
}
