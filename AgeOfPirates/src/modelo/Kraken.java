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
public class Kraken extends Comodin{
    
    int min_val = 0;
    int max_val = 3;
    Random rand = new Random();
    int idPlayer = min_val + rand.nextInt((max_val - min_val) + 1);
        
}
