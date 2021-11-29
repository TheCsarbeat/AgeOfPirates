/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author erksm
 */
public class Utilities {
    
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
