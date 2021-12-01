/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import vista.MainWindow;

/**
 *
 * @author ytces
 */
public class Mina extends Estructura{
    public boolean running; 
    public Mina(String id) {
        super.id = id;
    }

    @Override
    public void setPuntos(Punto mainP){
        
        int x = mainP.getX(), y = mainP.getY();
        super.cellsBusy.add(mainP);
        if(super.espacio == 12){
            if(y==19){
               super.cellsBusy.add(new Punto(x,y-1)); 
            }else{
                super.cellsBusy.add(new Punto(x,y+1));
            }
        }else{
            if(x==19){
                super.cellsBusy.add(new Punto(x-1,y));
            }else{
                super.cellsBusy.add(new Punto(x+1,y));
            }
        }
    }
    
    public void producirAcero(){
        running = true;
        Thread th = new Thread(){
        @Override
        public void run(){
            try {
                while(running){
                    JOptionPane.showMessageDialog(null, "La mina ha empezado a producir acero creará 100kg en 20s!", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    Thread.sleep(10000);
                    
                    
                    JOptionPane.showMessageDialog(null, "Se producido acero!", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    MainWindow.player.addSteel(100);
                    
                    if (MainWindow.player.grafo.buscarVertice(id).estructura.isDestruida()) {
                        running = false;
                    }      
                    MainWindow.setPlayer();
                                      
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        };th.start();
    }
    
}
