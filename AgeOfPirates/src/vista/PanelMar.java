/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author ytces
 */
public class PanelMar extends javax.swing.JPanel {

    /**
     * Creates new form PanelMar
     */
    public PanelMar() {
        initComponents();
        generateTiles();
    }
    
    public void generateTiles(){
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                this.add(new Tile("Tile "+row+"-"+col));
            }
        }
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(20, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
