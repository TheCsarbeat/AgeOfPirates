/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JPanel;

/**
 *
 * @author ytces
 */
public class Utilities {
    
    
    public static void cargarPanel(JPanel contentPanel, JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.repaint();
        contentPanel.revalidate();
    }
}
