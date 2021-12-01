/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author erksm
 */
public class Ataque implements Serializable{
    
    private Arma arma; 
    private Player atacante;
    private Player defensor;
    private ArrayList<Punto> puntos;
    private Estructura struct;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Player getAtacante() {
        return atacante;
    }

    public void setAtacante(Player atacante) {
        this.atacante = atacante;
    }

    public Player getDefensor() {
        return defensor;
    }

    public void setDefensor(Player defensor) {
        this.defensor = defensor;
    }

    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }

    public Estructura getStruct() {
        return struct;
    }

    public void setStruct(Estructura struct) {
        this.struct = struct;
    }

    public Ataque() {
    }

    public Ataque(Arma arma, Player atacante, Player defensor, ArrayList<Punto> puntos, Estructura struct) {
        this.arma = arma;
        this.atacante = atacante;
        this.defensor = defensor;
        this.puntos = puntos;
        this.struct = struct;
    }
    
    
    
    
}
