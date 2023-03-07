/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marina
 */
public class Conexion {
    private Connection conector;
    
    public static Connection getConexion(){
    Connection conn = null;
    try {
 
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gastos_db", "root", "");
 
    if (conn != null) {
        System.out.println("Connected");
         }
    } catch (SQLException ex) {
            System.out.println(ex.getMessage());
    }
    return conn;
    }
}
