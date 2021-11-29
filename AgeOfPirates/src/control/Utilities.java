/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Image;
import javax.swing.ImageIcon;
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
    
    public static ImageIcon loadResizeIcon(String name, int newHeigth){
        ImageIcon icon = new ImageIcon(name);
        Image image  = icon.getImage();
        
        int height = icon.getIconHeight(),  width = icon.getIconWidth();
        int newHeight = (newHeigth*height)/width;
        
        Image modifiedImage = image.getScaledInstance(newHeigth, newHeight, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifiedImage);
        return icon;
    }
}
