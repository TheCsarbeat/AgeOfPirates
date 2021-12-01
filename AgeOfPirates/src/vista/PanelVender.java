/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.TipoAccion;
import control.Utilities;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Arma;
import modelo.Exchange;
import modelo.Peticion;

/**
 *
 * @author muril
 */
public class PanelVender extends javax.swing.JPanel {

    /**
     * Creates new form PanelVender
     */
    public PanelVender() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        lbCoordenada4 = new javax.swing.JLabel();
        lbCoordenada6 = new javax.swing.JLabel();
        cboProductos = new javax.swing.JComboBox<>();
        btnActivateChat = new javax.swing.JLabel();
        lbSombrero = new javax.swing.JLabel();
        lbBandera = new javax.swing.JLabel();
        lbCoordenada5 = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        lbCalavera = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBotones.setBackground(new java.awt.Color(165, 173, 167));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.setBorder(null);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        lbCoordenada4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbCoordenada4.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada4.setText("Indique el precio del producto que desea vender");
        jPanel1.add(lbCoordenada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lbCoordenada6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        lbCoordenada6.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada6.setText("Indique el nombre del producto que desea vender");
        jPanel1.add(lbCoordenada6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cannon", "Cannon Multiple", "Bomba", "Cannon Barba Roja", "Acero" }));
        jPanel1.add(cboProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 170, -1));

        btnActivateChat.setBackground(new java.awt.Color(86, 73, 64));
        btnActivateChat.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        btnActivateChat.setForeground(new java.awt.Color(255, 255, 255));
        btnActivateChat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActivateChat.setText("Agregar");
        btnActivateChat.setIconTextGap(20);
        btnActivateChat.setOpaque(true);
        btnActivateChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActivateChatMouseClicked(evt);
            }
        });
        jPanel1.add(btnActivateChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 40));

        panelBotones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 460, 250));

        lbSombrero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbSombrero.setForeground(new java.awt.Color(0, 0, 0));
        lbSombrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sombrero.png"))); // NOI18N
        panelBotones.add(lbSombrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 140, 140));

        lbBandera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbBandera.setForeground(new java.awt.Color(0, 0, 0));
        lbBandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bandera.png"))); // NOI18N
        panelBotones.add(lbBandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 140, 140));

        add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 1630, 300));

        lbCoordenada5.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbCoordenada5.setForeground(new java.awt.Color(0, 0, 0));
        lbCoordenada5.setText("Vender en el mercado");
        add(lbCoordenada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 250, -1));

        lbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });
        add(lbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 70));

        lbCalavera.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        lbCalavera.setForeground(new java.awt.Color(0, 0, 0));
        lbCalavera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calavera.png"))); // NOI18N
        add(lbCalavera, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, 270, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        Utilities.cargarPanel(MainWindow.contentPanel, MainWindow.panelMercado);
    }//GEN-LAST:event_lbBackMouseClicked

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnActivateChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActivateChatMouseClicked
        String nombre = "";
        String imagen = "";
        int precio = 0;        
        precio = Integer.parseInt(txtPrecio.getText());
        nombre = (String)cboProductos.getSelectedItem();
        
        Arma armaVender = MainWindow.player.buscarArma(nombre);
        
        if(armaVender != null){
            ArrayList datos = new ArrayList();
            datos.add(precio);
            datos.add(MainWindow.player.getId());
            datos.add(armaVender);
            Peticion peticion = new Peticion(TipoAccion.ADD_EXCHANGE, datos);        
            Client conexion = new Client(peticion);
            Object respuesta = conexion.getRespuestaServer();
            
            if(respuesta != null){
                if((boolean)respuesta){
                    System.out.println("\n\n");
                    MainWindow.getPlayer(); 
                    
                    JOptionPane.showMessageDialog(null, "Se ha registrado su exchange!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    System.out.println("No se porque pero algo no esta bien");
                }
            }else{
                System.out.println("El server se empalido");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No tiene ninguna arma de este tipo!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActivateChatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActivateChat;
    public static javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbBandera;
    private javax.swing.JLabel lbCalavera;
    private javax.swing.JLabel lbCoordenada4;
    private javax.swing.JLabel lbCoordenada5;
    private javax.swing.JLabel lbCoordenada6;
    private javax.swing.JLabel lbSombrero;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
