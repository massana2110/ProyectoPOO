/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author David Massana
 */
public class DBQuery {

    private Conexion conexion;

    public DBQuery(){
        conexion = new Conexion();
    }
    
    public boolean registrarUsuario(String username, String password) throws SQLException{
        
        Connection con = conexion.getConnection();
        String query = "INSERT INTO usuario (username, contraseña) VALUES (?,?)";
        String query2 = "SELECT * FROM usuario WHERE username= ?";
        boolean isSuccess = false;

        try{
            PreparedStatement pstm = con.prepareStatement(query);

            pstm.setString(1, username);
            pstm.setString(2, password);
            
            ResultSet rs = pstm.executeQuery();
            
            if(pstm.executeUpdate() > 0){
                return true;
            }
            
        } catch(SQLException error){
            error.printStackTrace();
        } 
        
        return false;
    }

    
}
