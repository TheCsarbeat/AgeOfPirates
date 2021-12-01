/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Utilities;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ytces
 */
public class PanelTienda extends javax.swing.JPanel {
    public PanelEdificios panelEdificios;
    public PanelArmas panelArmas;
    public static PanelColocar panelColocar;
    public static int lastItemSelected; //fuente=0, conector=1, mercado=2, mina=3, templo=4, armeria=5
    /**
     * Creates new form PanelTienda
     */
    public PanelTienda() {
        initComponents();
        panelEdificios = new PanelEdificios();
        panelArmas = new PanelArmas();
        panelColocar = new PanelColocar();
        cargarPanel(panelEdificios);
    }
    
    public void cargarPanel(JPanel panel) {
        otroPanel.removeAll();
        otroPanel.add(panel);
        otroPanel.repaint();
        otroPanel.revalidate();
    }
    
    public void loadDatos(){
        lbDineroActual.setText(String.valueOf(MainWindow.player.getMoney()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        otroPanel = new javax.swing.JPanel();
        btnArmas = new javax.swing.JButton();
        btnComprarMercado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbDineroActual = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        btnEdificios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1900, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        otroPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otroPanel.setLayout(new java.awt.CardLayout());
        add(otroPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 1300, 580));

        btnArmas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnArmas.setText("Armas");
        btnArmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArmasMouseClicked(evt);
            }
        });
        btnArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmasActionPerformed(evt);
            }
        });
        add(btnArmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 220, 50));

        btnComprarMercado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnComprarMercado.setText("Comprar mercado");
        btnComprarMercado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMercadoMouseClicked(evt);
            }
        });
        btnComprarMercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarMercadoActionPerformed(evt);
            }
        });
        add(btnComprarMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 250, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Para comprar en el mercado, primero debe comprar el mercado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 760, 40));

        lbDineroActual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbDineroActual.setText("4000");
        add(lbDineroActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 170, 40));

        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });
        add(lbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 70));

        btnEdificios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEdificios.setText("Edificios");
        btnEdificios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEdificiosMouseClicked(evt);
            }
        });
        add(btnEdificios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 220, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Dinero: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnArmasActionPerformed

    private void btnComprarMercadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMercadoMouseClicked
        JOptionPane.showMessageDialog(null, "Se ha comprado el mercado!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnComprarMercadoMouseClicked

    private void btnArmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArmasMouseClicked
        cargarPanel(panelArmas);
    }//GEN-LAST:event_btnArmasMouseClicked

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        Utilities.cargarPanel(MainWindow.contentPanel, MainWindow.panelTiendaMercado);
    }//GEN-LAST:event_lbBackMouseClicked

    private void btnEdificiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEdificiosMouseClicked
        // TODO add your handling code here:
        cargarPanel(panelEdificios);
    }//GEN-LAST:event_btnEdificiosMouseClicked

    private void btnComprarMercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarMercadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarMercadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArmas;
    private javax.swing.JButton btnComprarMercado;
    private javax.swing.JButton btnEdificios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbDineroActual;
    private javax.swing.JPanel otroPanel;
    // End of variables declaration//GEN-END:variables
}
