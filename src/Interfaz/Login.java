/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import entidades.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import sql.DBQuery;



/**
 *
 * @author Frognas
 */
public class Login extends javax.swing.JFrame {
    Color color;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelIncorrecto.setVisible(false);
        this.color= getColorOriginal();
        
    }

    public void limpiarCampos(){
        jTextUsuario.setText("");
        jTextContraseña.setText("");
        
    }
    
    public Color getColorOriginal(){
        return jLabelRecuperacion.getForeground();  
    }
    
   public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
       return retValue;
   } 
    
    
    
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIniciarSesion = new javax.swing.JLabel();
        jLabelCrearCuenta = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jTextContraseña = new javax.swing.JPasswordField();
        jLabelRecuperacion = new javax.swing.JLabel();
        jLabelIncorrecto = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iniciarsesion.png"))); // NOI18N
        jLabelIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelIniciarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 200, 80));

        jLabelCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crearcuenta.png"))); // NOI18N
        jLabelCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCrearCuentaMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 200, 80));

        jTextUsuario.setBackground(new java.awt.Color(0, 28, 75));
        jTextUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextUsuario.setBorder(null);
        getContentPane().add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 380, 30));

        jTextContraseña.setBackground(new java.awt.Color(0, 28, 75));
        jTextContraseña.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jTextContraseña.setBorder(null);
        jTextContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 360, 30));

        jLabelRecuperacion.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelRecuperacion.setForeground(new java.awt.Color(4, 131, 140));
        jLabelRecuperacion.setText("¿Has olvidado tu contraseña?");
        jLabelRecuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRecuperacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelRecuperacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelRecuperacionMouseExited(evt);
            }
        });
        getContentPane().add(jLabelRecuperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, -1, -1));

        jLabelIncorrecto.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelIncorrecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIncorrecto.setText("¡Usuario o contraseña incorrectos!");
        getContentPane().add(jLabelIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextContraseñaActionPerformed

    private void jLabelRecuperacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperacionMouseEntered

jLabelRecuperacion.setForeground(Color.white);


        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelRecuperacionMouseEntered

    private void jLabelRecuperacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperacionMouseExited
        // TODO add your handling code here:
        jLabelRecuperacion.setForeground(this.color);
    }//GEN-LAST:event_jLabelRecuperacionMouseExited

    private void jLabelCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCrearCuentaMouseClicked
        // TODO add your handling code here:
        new SignIn().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCrearCuentaMouseClicked

    private void jLabelIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelIniciarSesionMouseClicked
        // TODO add your handling code here:
        
        DBQuery query = new DBQuery();
        
        try{
            Usuario user = query.login(jTextUsuario.getText(), query.MD5(new String(jTextContraseña.getPassword())));
            if (user != null) {
                limpiarCampos();
                setVisible(false);
                new MenuCuentas(user).setVisible(true);
            } else{
                limpiarCampos();
                jLabelIncorrecto.setVisible(true);
            }
            //jLabelIncorrecto.setVisible(false);
        } catch(SQLException e){
            jLabelIncorrecto.setVisible(true);
        }

        // Solo es para probar xD PORQUE NO TENGO CONECTADA LA BD
    }//GEN-LAST:event_jLabelIniciarSesionMouseClicked

    private void jLabelRecuperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRecuperacionMouseClicked
        // TODO add your handling code here:
        new RestablecerContraseña().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelRecuperacionMouseClicked
              

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCrearCuenta;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIncorrecto;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelRecuperacion;
    private javax.swing.JPasswordField jTextContraseña;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
