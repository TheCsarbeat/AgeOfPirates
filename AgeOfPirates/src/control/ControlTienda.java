/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Armeria;
import modelo.Conector;
import modelo.Fuente;
import modelo.Mercado;
import modelo.Mina;
import modelo.Player;
import modelo.Templo;

/**
 *
 * @author ytces
 */
public class ControlTienda {
    public static int minaPrice;
    public static int conectorPrice;
    public static int mercadoPrice;
    public static int temploPrice;
    public static int armeriaPrice;
    public static int fuentePrice;

    public ControlTienda(){
        minaPrice = 1000;
        conectorPrice = 100;
        mercadoPrice = 2000;
        temploPrice = 2500;
        armeriaPrice = 1500;
        fuentePrice = 12000;
    }
    
    public ControlTienda(int minaPrice, int conectorPrice, int mercadoPrice, int temploPrice, int armeriaPrice, int fuentePrice) {
        ControlTienda.minaPrice = minaPrice;
        ControlTienda.conectorPrice = conectorPrice;
        ControlTienda.mercadoPrice = mercadoPrice;
        ControlTienda.temploPrice = temploPrice;
        ControlTienda.armeriaPrice = armeriaPrice;
        ControlTienda.fuentePrice = fuentePrice;
    }
    
    //fuente=0, conector=1, mercado=2, mina=3, templo=4, armeria=5
    public void comprarEdificio(Player p, int tipo){
        switch(tipo){
            case 0:
                p.grafo.agregarVertice(new Fuente(p.getNextValidName(tipo)));
                break;
            case 1:
                p.grafo.agregarVertice(new Conector(p.getNextValidName(tipo)));
                break;
            case 2:
                p.grafo.agregarVertice(new Mercado(p.getNextValidName(tipo)));
                break;
            case 3:
                p.grafo.agregarVertice(new Mina(p.getNextValidName(tipo)));
                break;
            case 4:
                p.grafo.agregarVertice(new Templo(p.getNextValidName(tipo)));
                break;
            case 5:
                p.grafo.agregarVertice(new Armeria(p.getNextValidName(tipo)));
                break;
        }
    }
}
