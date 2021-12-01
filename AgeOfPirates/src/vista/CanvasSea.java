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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Conector;
import modelo.Fuente;
import modelo.Mercado;
import modelo.Mina;
import modelo.Templo;
import modelo.Vertice;

/**
 *
 * @author ytces
 */
public class CanvasSea extends Canvas{
    public int id; //miCanvas=0, enemigo=1;
    
    public CanvasSea(int id){
        this.id = id;
    }
    
    public void paint(Graphics g){ 
        Image tile = new ImageIcon("src\\images\\water2.png").getImage();
        Image mina = new ImageIcon("src\\images\\mine.png").getImage();        
        Image conector = new ImageIcon("src\\images\\node.png").getImage();
        Image templo = new ImageIcon("src\\images\\temple.png").getImage();
        Image fuente = new ImageIcon("src\\images\\campfire.png").getImage();
        Image mercado = new ImageIcon("src\\images\\market.png").getImage();
        Image armeria = new ImageIcon("src\\images\\armeria.png").getImage();
        Image fire = new ImageIcon("src\\images\\fire.png").getImage();
        
        
        for(int row=0;row<20;row++){
            for(int col=0;col<20;col++){
                g.drawImage(tile, row*32, col*32, 32, 32, this);
            }
        }
        
        
        int x=0, y=0;
        int width=32, height=32;
        if(id == 0){
            for(Vertice e: MainWindow.player.grafo.vertices){
                x = e.estructura.getFirstCoordinate().getX();
                y = e.estructura.getFirstCoordinate().getY();
                width = (e.estructura.getEspacio()/10);
                height = (e.estructura.getEspacio()%10);
                if(e.estructura instanceof Mina){
                    g.drawImage(mina, x*32, y*32, width*32, height*32, this);
                }else if(e.estructura instanceof Conector){
                    g.drawImage(conector, x*32, y*32, width*32, height*32, this);
                }else if(e.estructura instanceof Templo){
                    g.drawImage(templo, x*32, y*32, width*32, height*32, this);
                }else if(e.estructura instanceof Fuente){
                    g.drawImage(fuente, x*32, y*32, width*32, height*32, this);
                }else if(e.estructura instanceof Mercado){
                    g.drawImage(mercado, x*32, y*32, width*32, height*32, this);
                }else{
                    g.drawImage(armeria, x*32, y*32, width*32, height*32, this);
                }
            }
            for(int row=0;row<20;row++){
                for(int col=0;col<20;col++){
                    if(MainWindow.player.positions[row][col] == true){
                        g.drawImage(fire, row*32, col*32, 32, 32, this);
                    }
                }
            }
            int x1,  y1,  x2,  y2;
            for(Vertice e: MainWindow.player.grafo.vertices){
                x1 = e.estructura.getFirstCoordinate().getX();
                y1 = e.estructura.getFirstCoordinate().getY();
                for(Vertice a: e.aristas){
                    x2 = a.estructura.getFirstCoordinate().getX();
                    y2 = a.estructura.getFirstCoordinate().getY();
                    drawThickLine(g,x1*32+16,y1*32+16,x2*32+16,y2*32+16,5,Color.YELLOW);
                }
            }
            
        }else{
            boolean dibujeTodo = false;
            for(Vertice e: MainWindow.enemigo.grafo.vertices){
                if(e.estructura instanceof Fuente){
                    if(e.estructura.isDestruida()){
                        dibujeTodo = true;
                    }
                }
            }
            
            if(dibujeTodo){
                for(Vertice e: MainWindow.enemigo.grafo.vertices){
                    x = e.estructura.getFirstCoordinate().getX();
                    y = e.estructura.getFirstCoordinate().getY();
                    width = (e.estructura.getEspacio()/10);
                    height = (e.estructura.getEspacio()%10);
                    if(e.estructura instanceof Mina){
                        g.drawImage(mina, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Conector){
                        g.drawImage(conector, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Templo){
                        g.drawImage(templo, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Fuente){
                        g.drawImage(fuente, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Mercado){
                        g.drawImage(mercado, x*32, y*32, width*32, height*32, this);
                    }else{
                        g.drawImage(armeria, x*32, y*32, width*32, height*32, this);
                    }
                }
            }
            
            for(Vertice e: MainWindow.enemigo.grafo.vertices){
                if(e.estructura.isDestruida()){
                    x = e.estructura.getFirstCoordinate().getX();
                    y = e.estructura.getFirstCoordinate().getY();
                    width = (e.estructura.getEspacio()/10);
                    height = (e.estructura.getEspacio()%10);
                    if(e.estructura instanceof Mina){
                        g.drawImage(mina, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Conector){
                        g.drawImage(conector, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Templo){
                        g.drawImage(templo, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Fuente){
                        g.drawImage(fuente, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Mercado){
                        g.drawImage(mercado, x*32, y*32, width*32, height*32, this);
                    }else{
                        g.drawImage(armeria, x*32, y*32, width*32, height*32, this);
                    }
                }
            }
            
            for(int row=0;row<20;row++){
                for(int col=0;col<20;col++){
                    if(MainWindow.enemigo.positions[row][col] == true){
                        g.drawImage(fire, row*32, col*32, 32, 32, this);
                    }
                }
            }
            
            //Dibujar los disconexos
            for(Vertice e: MainWindow.enemigo.grafo.vertices){
                if(!MainWindow.enemigo.grafo.esArista(e.estructura.getId()) && !(e.estructura instanceof Conector)){
                    x = e.estructura.getFirstCoordinate().getX();
                    y = e.estructura.getFirstCoordinate().getY();
                    width = (e.estructura.getEspacio()/10);
                    height = (e.estructura.getEspacio()%10);
                    if(e.estructura instanceof Mina){
                        g.drawImage(mina, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Conector){
                        System.out.println("No hacer nada");
                    }else if(e.estructura instanceof Templo){
                        g.drawImage(templo, x*32, y*32, width*32, height*32, this);
                    }else if(e.estructura instanceof Fuente){
                        System.out.println("No hacer nada");
                    }else if(e.estructura instanceof Mercado){
                        g.drawImage(mercado, x*32, y*32, width*32, height*32, this);
                    }else{
                        g.drawImage(armeria, x*32, y*32, width*32, height*32, this);
                    }
                }
            }
        }
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
    @Override
    public void mouseClicked(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        System.out.println(x+","+y);//these co-ords are relative to the component
    }     
    
    
    public static void main(String[] args){
        JFrame jf = new JFrame("Canvas");
        CanvasSea m = new CanvasSea(0);
        
        jf.setSize(640, 640);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(m);
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
