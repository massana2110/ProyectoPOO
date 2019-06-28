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
import java.sql.Statement;
import entidades.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

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
    
    public String findUser(String username){
        String user = null;
        String query = "SELECT * FROM usuario WHERE username = ?";
        try{
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
               ResultSet rs = ps.executeQuery();

               while (rs.next()){
                   user = rs.getString("username");
               }
            ps.close();
        }
        catch(SQLException error){
            System.out.println("ERROR: "+error.getMessage());
        }
        finally{
            return user;
        }
    }
    
    public boolean updatePass(String id, String pass) throws SQLException{
        String query = "UPDATE usuario SET contraseña = ? WHERE username = ?";
        String hashPass = MD5(pass);
        try{
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, hashPass);
            ps.setString(2, id);
            
            if (ps.executeUpdate() != 0) {
                return true;
            }
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
        return false;
    }
    
    public boolean añadirCuenta (String nombre,String tipoTarjeta ,double unSaldo) throws SQLException{
        Connection con = conexion.getConnection();
        boolean isSuccess = false;
        String query = "INSERT INTO cuenta (nombre, tipo_tarjeta, saldo) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nombre);
            ps.setString(2, tipoTarjeta);
            ps.setDouble(3, unSaldo);
            
            if(ps.executeUpdate() > 0){
                isSuccess = true;
            }
        } catch(Exception error){
            isSuccess = false;
            error.printStackTrace();
            
        } 
        
        return true;   
} 
    
    public List<Cuenta> getAllCuentas(){
        Connection conn = conexion.getConnection();
        List<Cuenta> cuentas = new ArrayList();
        String query = "SELECT * FROM cuenta WHERE username = ?" ;
        try{
            PreparedStatement stm = conn.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Cuenta cuenta = new Cuenta();
                cuenta.setNombre(rs.getString("nombre"));
                cuenta.setTarjeta(rs.getString("tipo_tarjeta"));
                cuenta.setSaldo(rs.getDouble("name"));
                cuentas.add(cuenta);
             }
            //conn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return cuentas;
}    
    
    public String[] getCategoria(){
        String [] tipos = new String[4];
        int contador = 0;
        String query = "SELECT * FROM categoria";
        try{
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                tipos[contador] = rs.getString("nombre");
                contador++;
            }
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        return tipos;
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
        public boolean añadirIngreso(int idUsuario, int idCuenta, int idCategoria, double monto , String fecha, String descripcion){
          String queryI = "INSERT INTO movimiento values (idMovimiento, id, idCuenta,idCategoria,,monto,fecha,descripcion)";
     
              try{
            Connection con = conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement(queryI);
            pstm.setInt(1,1);
            pstm.setInt(2, idUsuario);
            pstm.setDouble(5, monto);
            pstm.setString(6, fecha);
            pstm.setString(7, descripcion);
            
            if(pstm.executeUpdate() > 0){
                return true;
               
            }
        } catch(Exception error){
            error.printStackTrace();
            return false;
        } 
        
        return true;
    }
    
        
    public boolean añadirEgreso(int idUsuario, int idCuenta, int idCategoria, double monto , String fecha, String descripcion){
          Movimiento movimiento = new   Movimiento();
          Cuenta cuenta = new Cuenta();
          String queryI = "INSERT INTO movimiento (idUsuario, idCuenta, idCategoria, monto, fecha, descripcion) values (?,?,?,?,?,?,?)";
     
              try{
            Connection con = conexion.getConnection();
            PreparedStatement pstm = con.prepareStatement(queryI);
            pstm.setInt(1,idUsuario);
            pstm.setInt(2, idCuenta);
            pstm.setDouble(3, idCategoria);
            pstm.setDouble(4, monto);
            pstm.setString(5, fecha);
            pstm.setString(6, descripcion);
            
            if(pstm.executeUpdate() > 0){
                return true;
               
            }
        } catch(Exception error){
            error.printStackTrace();
            return false;
        } 
        
        return true;
    }
    
    public int buscarIdUsuario(String nombre) {
    int id = 0;

   String query  =  "SELECT idUsuario FROM Usuario WHERE username = ?";

    try {
           Connection con = conexion.getConnection();
           PreparedStatement ps = con.prepareStatement(query);
           ps.setString(1,nombre);
            ResultSet rs = ps.executeQuery();

        while (rs.next()) { 
            id = rs.getInt("idUsuario");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQLException: " + e.getMessage(), "Error:vuscarIdUsuario()", JOptionPane.ERROR_MESSAGE);
    }

    return id;
}
    
}
