/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.MainWindow;

/**
 *
 * @author ytces
 */
public class BarcoFantasma {
    public int x, y;
    boolean running;
    
    
    public BarcoFantasma(int x, int y){
        this.x = x;
        this.y = y;
        running = false;
    }
    
    public void enviarBarco(){
        running = true;
        Thread th = new Thread(){
        @Override
        public void run(){
            int x2, y2;
            try {
                while(running){
                    Thread.sleep(5000);
                    for(Vertice e: MainWindow.enemigo.grafo.vertices){
                        x2 = e.estructura.getFirstCoordinate().getX();
                        y2 = e.estructura.getFirstCoordinate().getY();
                        if(x2<x+4 && y2<y+4 && x2>x-4 && y2>y-4){
                            e.estructura.setDestruida(true);
                        }
                    }
                    MainWindow.panelJuego.panelMar1.updateCanvas();
                    System.out.println("Mostrando...");
                    Thread.sleep(10000);
                    for(Vertice e: MainWindow.enemigo.grafo.vertices){
                        x2 = e.estructura.getFirstCoordinate().getX();
                        y2 = e.estructura.getFirstCoordinate().getY();
                        if(x2<x+4 && y2<y+4 && x2>x-4 && y2>y-4){
                            e.estructura.setDestruida(false);
                        }
                    }
                    MainWindow.panelJuego.panelMar1.updateCanvas();
                    System.out.println("Retirando...");
                    running = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        };th.start();
    }
    
    
}
