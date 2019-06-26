/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

import entidades.Usuario;
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

        String query = "INSERT INTO usuario (username, contraseña) VALUES (?,?)";
        String hashPass = MD5(password);
        try{
            Connection con = conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, username);
            pstm.setString(2, hashPass);
            
            if(pstm.executeUpdate() > 0){
                return true;
            }
        } catch(Exception error){
            error.printStackTrace();
            return false;
        } 
        
        return true;
    }

    public Usuario login(String username, String password) throws SQLException{
        boolean flag = false;
        Usuario usuario = new Usuario();
        String query = "SELECT * FROM usuario WHERE username = ? AND  contraseña = ?";
        try{
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                usuario.setUsername(rs.getString("username"));
                usuario.setPassword(rs.getString("contraseña"));
                flag = true;
            }
            if (!flag) usuario = null;
        } catch(SQLException e){
            usuario = null;
            e.printStackTrace();
        }
        return usuario;
    }
    
    public String MD5(String md5){
        try{
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
             byte[] array = md.digest(md5.getBytes());
             StringBuffer sb = new StringBuffer();
             for (int i = 0; i < array.length; ++i) {
               sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch(java.security.NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }
}
