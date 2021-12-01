/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author erksm
 */
public class Escudo extends Comodin{
    
    int min_val = 2;
    int max_val = 5;
    Random rand = new Random();
    int disparos = min_val + rand.nextInt((max_val - min_val) + 1);
    
    public int getDisparos() {
        return disparos;
    }

    public void setDisparos(int disparos) {
        this.disparos = disparos;
    }

    @Override
    public String toString() {
        return "Escudo: " + "disparos: " + disparos;
    }
    
    
    
}
