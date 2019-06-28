/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sql.DBQuery;

/**
 *
 * @author Frognas
 */
public class AñadirCuenta extends javax.swing.JFrame {
    
     DBQuery query;
    /**
     * Creates new form AñadirCuenta
     */
    public AñadirCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        query = new DBQuery();
    }
 
        public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
       return retValue;
   } 
    public void limpiarCampos(){
        txtNombreCuenta.setText("");
        txtSaldoInicial.setText("");
        txtTipoTarjeta.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgSaldo = new javax.swing.JLabel();
        imgNombre = new javax.swing.JLabel();
        imgTipoTarjeta = new javax.swing.JLabel();
        lblGuardar = new javax.swing.JLabel();
        lblCancelar = new javax.swing.JLabel();
        txtSaldoInicial = new javax.swing.JTextField();
        txtNombreCuenta = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();
        txtTipoTarjeta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Saldo.png"))); // NOI18N
        getContentPane().add(imgSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));

        imgNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NombreLapiz.png"))); // NOI18N
        getContentPane().add(imgNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 153, -1, -1));

        imgTipoTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CuentasBlanco.png"))); // NOI18N
        getContentPane().add(imgTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonGuardar1.png"))); // NOI18N
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(lblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, -1, -1));

        lblCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonCancelar1.png"))); // NOI18N
        lblCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancelarMouseClicked(evt);
            }
        });
        getContentPane().add(lblCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        txtSaldoInicial.setBackground(new java.awt.Color(0, 28, 75));
        txtSaldoInicial.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtSaldoInicial.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldoInicial.setText("$ Saldo Inicial...");
        txtSaldoInicial.setBorder(null);
        txtSaldoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSaldoInicialMouseClicked(evt);
            }
        });
        txtSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoInicialKeyTyped(evt);
            }
        });
        getContentPane().add(txtSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 330, 30));

        txtNombreCuenta.setBackground(new java.awt.Color(0, 28, 75));
        txtNombreCuenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtNombreCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCuenta.setText("Nombre Cuenta...");
        txtNombreCuenta.setBorder(null);
        txtNombreCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreCuentaMouseClicked(evt);
            }
        });
        getContentPane().add(txtNombreCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 330, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AñadirCuentaInterfaz.png"))); // NOI18N
        lblFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblFondoKeyTyped(evt);
            }
        });
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 730, 680));

        txtTipoTarjeta.setBackground(new java.awt.Color(0, 28, 75));
        txtTipoTarjeta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtTipoTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoTarjeta.setText("Tipo de cuenta (debito,credito,etc)");
        txtTipoTarjeta.setBorder(null);
        txtTipoTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTipoTarjetaMouseClicked(evt);
            }
        });
        txtTipoTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoTarjetaActionPerformed(evt);
            }
        });
        txtTipoTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoTarjetaKeyTyped(evt);
            }
        });
        getContentPane().add(txtTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 330, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancelarMouseClicked
        // TODO add your handling code here:
         
        this.setVisible(false);
    }//GEN-LAST:event_lblCancelarMouseClicked

    private void txtNombreCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCuentaMouseClicked
        // TODO add your handling code here:
        txtNombreCuenta.setText("");
    }//GEN-LAST:event_txtNombreCuentaMouseClicked

    private void txtSaldoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSaldoInicialMouseClicked
        // TODO add your handling code here:
        txtSaldoInicial.setText("");
    }//GEN-LAST:event_txtSaldoInicialMouseClicked

    private void lblFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblFondoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFondoKeyTyped

    private void txtSaldoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
         if (!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_txtSaldoInicialKeyTyped

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        // TODO add your handling code here:
              
          if (txtNombreCuenta.getText().isEmpty() || txtSaldoInicial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta datos.", "Llena todos los campos", JOptionPane.WARNING_MESSAGE);
        } else {
            try{
                if( query.añadirCuenta(txtNombreCuenta.getText() , txtTipoTarjeta.getText(),  Double.parseDouble(txtSaldoInicial.getText())) ){
                    
                    JOptionPane.showMessageDialog(this, "CUENTA CREADA CON EXITO", "SUCCES", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    JOptionPane.showMessageDialog(this, "ERROR AL CONSULTAR LA BASE DE DATOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void txtTipoTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoTarjetaMouseClicked
        // TODO add your handling code here:
        txtTipoTarjeta.setText("");
    }//GEN-LAST:event_txtTipoTarjetaMouseClicked

    private void txtTipoTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoTarjetaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoTarjetaKeyTyped

    private void txtTipoTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoTarjetaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AñadirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgNombre;
    private javax.swing.JLabel imgSaldo;
    private javax.swing.JLabel imgTipoTarjeta;
    private javax.swing.JLabel lblCancelar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JTextField txtNombreCuenta;
    private javax.swing.JTextField txtSaldoInicial;
    private javax.swing.JTextField txtTipoTarjeta;
    // End of variables declaration//GEN-END:variables
}
