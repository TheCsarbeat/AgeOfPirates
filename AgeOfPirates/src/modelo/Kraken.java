/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import vista.MainWindow;

/**
 *
 * @author erksm
 */
public class Kraken extends Comodin{
    
    public int idPlayer;
    public int posicion;
    
    public Vertice obtenerComponente(){
       
        int min_val = 0;
        int max_val = MainWindow.player.grafo.vertices.size();
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        posicion = tlr.nextInt(min_val, max_val + 1);
        System.out.println("La posición en el array es: "+ posicion);
        System.out.println("El número en la posición del array es: "+ MainWindow.player.grafo.vertices.get(posicion));
        
        return MainWindow.player.grafo.vertices.get(posicion);
    }
 
}
