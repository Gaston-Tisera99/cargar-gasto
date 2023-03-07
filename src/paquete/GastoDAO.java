/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marina
 */
public class GastoDAO {
    Connection conector = null;
    PreparedStatement comando = null;
    String SQL = "";

    public GastoDAO() {
        conector = Conexion.getConexion();
    }
    
    public void grabar(GastoVO g){
        String SQL = "INSERT INTO gastos (fecha, importe, rubro) VALUES (?, ?, ?)";         
        
        try{
            comando = conector.prepareStatement(SQL);
            comando.setString(1, g.getFecha());
            comando.setFloat(2, g.getImporte());
            comando.setInt(3, g.getRubro());
            comando.executeUpdate();
        }catch(Exception e){
            
        }
    }
    
    public void ver(JTable tabla, int rubro){
        String col[] = {"IDGASTO", "FECHA", "IMPORTE"};
        DefaultTableModel modeloTabla = new DefaultTableModel(col, 0);
        tabla.setModel(modeloTabla);
        try{
            SQL= "SELECT idgasto, fecha, importe FROM gastos WHERE rubro=? ORDER BY idgasto";
            comando = conector.prepareStatement(SQL);
            comando.setInt(1, rubro);
            
            ResultSet resultado = comando.executeQuery();
            
            while(resultado.next()){
                Object row[] = new Object[3];
                row[0] = resultado.getInt("idgasto");
                row[1] = resultado.getString("fecha");
                row[2] = resultado.getFloat("importe");
                modeloTabla.addRow(row);
            }
        }catch(Exception e){
        
        }   
    }
    
}
