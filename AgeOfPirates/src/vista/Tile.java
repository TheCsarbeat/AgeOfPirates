/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ytces
 */
public class Tile extends JLabel{
    
    
    Tile(String name){
        ImageIcon icon = new ImageIcon("src\\images\\Tile3.png");
        this.setIcon(icon);
        this.setName(name);
    }
}
