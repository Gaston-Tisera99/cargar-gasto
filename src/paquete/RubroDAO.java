/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

/**
 *
 * @author Marina
 */
public class RubroDAO {
    Connection conector = null;
    PreparedStatement comando = null;
    String SQL = "";

    public RubroDAO() {     
        conector = Conexion.getConexion();
    }
    
    public void ver(JComboBox cbRubro){  
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
        cbRubro.setModel(modeloCombo);
    
        try{
            SQL= "SELECT * FROM rubros ORDER BY nombre";
            comando = conector.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            
            while(resultado.next()){
                RubroVO r = new RubroVO(resultado.getInt("rubro"), resultado.getString("nombre"));
                modeloCombo.addElement(r);
            }
        }catch(Exception e){
        
        }
    }
    
    public void ver(JList lbRubro){  
        DefaultListModel modeloLB = new DefaultListModel();
        lbRubro.setModel(modeloLB);
    
        try{
            SQL= "SELECT * FROM rubros ORDER BY nombre";
            comando = conector.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            
            while(resultado.next()){
                RubroVO r = new RubroVO(resultado.getInt("rubro"), resultado.getString("nombre"));
                modeloLB.addElement(r);
            }
        }catch(Exception e){
        
        }
    }
}
