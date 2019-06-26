/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Frognas
 */
public class MenuMovimientos extends javax.swing.JFrame {

    /**
     * Creates new form MenuCuentas
     */
    public MenuMovimientos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public Image getIconImage(){
       Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo2.png"));
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

        jLabelMovimientos = new javax.swing.JLabel();
        jLabelMovimientosText = new javax.swing.JLabel();
        jLabelReportes = new javax.swing.JLabel();
        jLabelAlertas = new javax.swing.JLabel();
        jLabelPrestamos = new javax.swing.JLabel();
        jLabelCuentas = new javax.swing.JLabel();
        jLabelInformacion = new javax.swing.JLabel();
        jLabelReportesText = new javax.swing.JLabel();
        jLabelAlertasText = new javax.swing.JLabel();
        jLabelPrestamosText = new javax.swing.JLabel();
        jLabelCuentasText = new javax.swing.JLabel();
        jLabelInformacionText = new javax.swing.JLabel();
        jLabelAñadirCuenta = new javax.swing.JLabel();
        jLabelTransferencia = new javax.swing.JLabel();
        jLabelTransferenciaText = new javax.swing.JLabel();
        jLabelAñadirCuentaText = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MovimientosNegro.png"))); // NOI18N
        getContentPane().add(jLabelMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabelMovimientosText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelMovimientosText.setText("Movimientos");
        getContentPane().add(jLabelMovimientosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReportesBlanco.png"))); // NOI18N
        getContentPane().add(jLabelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabelAlertas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AlertasBlanco.png"))); // NOI18N
        getContentPane().add(jLabelAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabelPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PrestamosBlanco.png"))); // NOI18N
        getContentPane().add(jLabelPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

        jLabelCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CuentasBlanco.png"))); // NOI18N
        jLabelCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCuentasMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, -1));

        jLabelInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TutorialBlanco.png"))); // NOI18N
        getContentPane().add(jLabelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, -1, -1));

        jLabelReportesText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelReportesText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReportesText.setText("Reportes");
        jLabelReportesText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReportesTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReportesTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelReportesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jLabelAlertasText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelAlertasText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlertasText.setText("Alertas");
        jLabelAlertasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAlertasTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAlertasTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelAlertasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabelPrestamosText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelPrestamosText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrestamosText.setText("Prestamos");
        jLabelPrestamosText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPrestamosTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelPrestamosTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelPrestamosText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jLabelCuentasText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelCuentasText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCuentasText.setText("Cuentas");
        jLabelCuentasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCuentasTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCuentasTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCuentasTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelCuentasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, -1, -1));

        jLabelInformacionText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelInformacionText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInformacionText.setText("Informacion");
        jLabelInformacionText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelInformacionTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelInformacionTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelInformacionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, -1, -1));

        jLabelAñadirCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Egresos.png"))); // NOI18N
        getContentPane().add(jLabelAñadirCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        jLabelTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresos.png"))); // NOI18N
        getContentPane().add(jLabelTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, -1, -1));

        jLabelTransferenciaText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelTransferenciaText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTransferenciaText.setText("Añadir Ingresos");
        jLabelTransferenciaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTransferenciaTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTransferenciaTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelTransferenciaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, -1));

        jLabelAñadirCuentaText.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabelAñadirCuentaText.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAñadirCuentaText.setText("Añadir Egresos");
        jLabelAñadirCuentaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAñadirCuentaTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAñadirCuentaTextMouseExited(evt);
            }
        });
        getContentPane().add(jLabelAñadirCuentaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelReportesTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportesTextMouseEntered
        // TODO add your handling code here:
        jLabelReportesText.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelReportesTextMouseEntered

    private void jLabelReportesTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReportesTextMouseExited
        // TODO add your handling code here:
        jLabelReportesText.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelReportesTextMouseExited

    private void jLabelAlertasTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAlertasTextMouseEntered
        // TODO add your handling code here:
        jLabelAlertasText.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelAlertasTextMouseEntered

    private void jLabelAlertasTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAlertasTextMouseExited
        // TODO add your handling code here:
        jLabelAlertasText.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelAlertasTextMouseExited

    private void jLabelPrestamosTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPrestamosTextMouseEntered
        // TODO add your handling code here:
        jLabelPrestamosText.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelPrestamosTextMouseEntered

    private void jLabelPrestamosTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPrestamosTextMouseExited
        // TODO add your handling code here:
        jLabelPrestamosText.setForeground(Color.WHITE);

    }//GEN-LAST:event_jLabelPrestamosTextMouseExited

    private void jLabelInformacionTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformacionTextMouseEntered
        // TODO add your handling code here:
                jLabelInformacionText.setForeground(Color.BLACK);

    }//GEN-LAST:event_jLabelInformacionTextMouseEntered

    private void jLabelInformacionTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformacionTextMouseExited
        // TODO add your handling code here:
        jLabelInformacionText.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelInformacionTextMouseExited

    private void jLabelTransferenciaTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTransferenciaTextMouseEntered
        // TODO add your handling code here:
        jLabelTransferenciaText.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelTransferenciaTextMouseEntered

    private void jLabelTransferenciaTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTransferenciaTextMouseExited
        // TODO add your handling code here:
        jLabelTransferenciaText.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelTransferenciaTextMouseExited

    private void jLabelAñadirCuentaTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAñadirCuentaTextMouseEntered
        // TODO add your handling code here:
        jLabelAñadirCuentaText.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelAñadirCuentaTextMouseEntered

    private void jLabelAñadirCuentaTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAñadirCuentaTextMouseExited
        // TODO add your handling code here:
        jLabelAñadirCuentaText.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelAñadirCuentaTextMouseExited

    private void jLabelCuentasTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCuentasTextMouseEntered
        // TODO add your handling code here:
         jLabelCuentasText.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jLabelCuentasTextMouseEntered

    private void jLabelCuentasTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCuentasTextMouseExited
        // TODO add your handling code here:
         jLabelCuentasText.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelCuentasTextMouseExited

    private void jLabelCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCuentasMouseClicked
        // TODO add your handling code here:
        new MenuCuentas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCuentasMouseClicked

    private void jLabelCuentasTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCuentasTextMouseClicked
        // TODO add your handling code here:
        new MenuCuentas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCuentasTextMouseClicked

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
            java.util.logging.Logger.getLogger(MenuMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMovimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAlertas;
    private javax.swing.JLabel jLabelAlertasText;
    private javax.swing.JLabel jLabelAñadirCuenta;
    private javax.swing.JLabel jLabelAñadirCuentaText;
    private javax.swing.JLabel jLabelCuentas;
    private javax.swing.JLabel jLabelCuentasText;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelInformacion;
    private javax.swing.JLabel jLabelInformacionText;
    private javax.swing.JLabel jLabelMovimientos;
    private javax.swing.JLabel jLabelMovimientosText;
    private javax.swing.JLabel jLabelPrestamos;
    private javax.swing.JLabel jLabelPrestamosText;
    private javax.swing.JLabel jLabelReportes;
    private javax.swing.JLabel jLabelReportesText;
    private javax.swing.JLabel jLabelTransferencia;
    private javax.swing.JLabel jLabelTransferenciaText;
    // End of variables declaration//GEN-END:variables
}