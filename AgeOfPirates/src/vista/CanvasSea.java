/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ytces
 */
public class CanvasSea extends Canvas{
    public int id;
    /*
    public CanvasSea(int id){
        this.id = id;
    }
    */
    public void paint(Graphics g){
        g.setColor(Color.black); 
        Image tile = new ImageIcon("src\\images\\Tile4.png").getImage();
        Image mine = new ImageIcon("src\\images\\mine.png").getImage();        
        Image nodo = new ImageIcon("src\\images\\node.png").getImage();
        
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                g.drawImage(tile, row*32, col*32, 32, 32, this);
            }
        }
        
        
        //for(Estructura e: MainWindow.player.grafo.vertices)
        /*
        g.drawImage(edificio, 320, 320, 64, 32, this);
        g.drawImage(edificio, 0, 0, 64, 32, this);
        g.drawImage(nodo, 320, 0, 32, 32, this);
        
        
        drawThickLine(g,64,16,320,16,5,Color.BLACK);
        drawThickLine(g,320,32,320,320,5,Color.BLACK);
        */
    }
    
     public void drawThickLine(Graphics g, int x1, int y1, int x2, int y2, int thickness, Color c) {
        // The thick line is in fact a filled polygon
        g.setColor(c);
        int dX = x2 - x1;
        int dY = y2 - y1;
        // line length
        double lineLength = Math.sqrt(dX * dX + dY * dY);

        double scale = (double)(thickness) / (2 * lineLength);

        // The x,y increments from an endpoint needed to create a rectangle...
        double ddx = -scale * (double)dY;
        double ddy = scale * (double)dX;
        ddx += (ddx > 0) ? 0.5 : -0.5;
        ddy += (ddy > 0) ? 0.5 : -0.5;
        int dx = (int)ddx;
        int dy = (int)ddy;

        // Now we can compute the corner points...
        int xPoints[] = new int[4];
        int yPoints[] = new int[4];

        xPoints[0] = x1 + dx; yPoints[0] = y1 + dy;
        xPoints[1] = x1 - dx; yPoints[1] = y1 - dy;
        xPoints[2] = x2 - dx; yPoints[2] = y2 - dy;
        xPoints[3] = x2 + dx; yPoints[3] = y2 + dy;

        g.fillPolygon(xPoints, yPoints, 4);
  }
    
    /*
    public static void main(String[] args){
        JFrame jf = new JFrame("Canvas");
        CanvasSea m = new CanvasSea();
        JPanel panel = new JPanel();
        panel.add(m);
        
        jf.setSize(640, 640);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(panel);
    }
    */
}
