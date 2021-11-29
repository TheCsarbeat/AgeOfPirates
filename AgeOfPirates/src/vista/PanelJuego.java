/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlTienda;
import javax.swing.JPanel;

/**
 *
 * @author ytces
 */
public class PanelJuego extends javax.swing.JPanel {
    public PanelMar panelMar1, panelMar2;
    public ControlTienda controlTienda;
    public JPanel contentPanel;
    public PanelTienda panelTienda;
    /**
     * Creates new form PanelJuego
     */
    public PanelJuego(JPanel contentPanel) {
        initComponents();
        controlTienda = new ControlTienda();
        panelMar1 = new PanelMar();
        panelMar2 = new PanelMar();
        panelTienda = new PanelTienda();
        this.contentPanel = contentPanel;
        cargarPanel(myPanel, panelMar1);
        cargarPanel(enemyPanel, panelMar2);
    }
    
    public void cargarPanel(JPanel unPanel, JPanel panel) {
        unPanel.removeAll();
        unPanel.add(panel);
        unPanel.repaint();
        unPanel.revalidate();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        enemyPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanel.setLayout(new java.awt.CardLayout());
        add(myPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 720, 720));

        enemyPanel.setLayout(new java.awt.CardLayout());
        add(enemyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, 720, 720));

        jButton1.setText("Tienda");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 820, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        cargarPanel(contentPanel,panelTienda);
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel enemyPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel myPanel;
    // End of variables declaration//GEN-END:variables
}
