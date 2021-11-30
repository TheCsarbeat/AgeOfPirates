/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.TipoAccion;
import javax.swing.JOptionPane;
import vista.Client;

/**
 *
 * @author ytces
 */
public class Templo extends Estructura{
    
    private int tiempo; 
    private boolean state;
    private boolean flagAviable;

    public Templo(int tiempo, boolean state, boolean flagAviable) {
        this.tiempo = tiempo;
        this.state = state;
        this.flagAviable = flagAviable;
    }
    
    public Templo(String id) {
        super.id = id;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    public void generarComodin(){
        int limitTime = 5*1;
        Thread th = new Thread(){
        @Override
        public void run(){
            try {
                while(true){
                    if(limitTime> tiempo){
                        Thread.sleep(1000);
                        tiempo++;
                    }else{
                        int random = (int) Math.floor(Math.random()*(1-0+1)+0);
                        if(random == 0){
                            System.out.println("El comodin ha sido un escudo");
                        }else{
                            System.out.println("El comidin ha sido un kraken");
                        }
                        flagAviable = true;
                        this.stop();
                    }
                    System.out.println("El tiempo de esta verga es: "+tiempo);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        };th.start();
    }
}
