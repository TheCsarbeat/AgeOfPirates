/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author erksm
 */
public class Exchange  implements Serializable{
    private int id;
    private int precio;
    private int idPlyaer;
    private String namePlayer;
    private Arma arma;

    public Exchange() {
    }

        
    public Exchange(int id, int precio, int idPlyaer, Arma arma) {
        this.id = id;
        this.precio = precio;
        this.idPlyaer = idPlyaer;
        this.arma = arma;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdPlyaer() {
        return idPlyaer;
    }

    public void setIdPlyaer(int idPlyaer) {
        this.idPlyaer = idPlyaer;
    }

    public Arma getArma() {
        return arma;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Exchange{" + "id=" + id + ", precio=" + precio + ", idPlyaer=" + idPlyaer + ", namePlayer=" + namePlayer + ", arma=" + arma + '}';
    }
    
    
    
}
