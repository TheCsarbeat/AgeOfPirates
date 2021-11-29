/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.ImageIcon;

/**
 *
 * @author ytces
 */
public class PanelEdificioComprar extends javax.swing.JPanel {

    /**
     * Creates new form PanelEdificioComprar
     */
    public PanelEdificioComprar(String precio, String source) {
        initComponents();
        changePrecio(precio);
        changeIcon(source);
    }
    
    public void changePrecio(String precio){
        lbPrecio.setText(precio);
    }
    
    public void changeIcon(String source){
        ImageIcon icon = new ImageIcon(source);
        lbIcon.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPrecio = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPrecio.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lbPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPrecio.setText("Precio");
        add(lbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 170, 34));
        add(lbIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, 160));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbPrecio;
    // End of variables declaration//GEN-END:variables
}
