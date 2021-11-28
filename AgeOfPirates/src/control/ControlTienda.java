/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author ytces
 */
public class ControlTienda {
    private int minaPrice;
    private int conectorPrice;
    private int mercadoPrice;
    private int temploPrice;
    private int armeriaPrice;
    private int fuentePrice;

    public ControlTienda(){
        minaPrice = 1000;
        conectorPrice = 100;
        mercadoPrice = 2000;
        temploPrice = 2500;
        armeriaPrice = 1500;
        fuentePrice = 12000;
    }
    
    public ControlTienda(int minaPrice, int conectorPrice, int mercadoPrice, int temploPrice, int armeriaPrice, int fuentePrice) {
        this.minaPrice = minaPrice;
        this.conectorPrice = conectorPrice;
        this.mercadoPrice = mercadoPrice;
        this.temploPrice = temploPrice;
        this.armeriaPrice = armeriaPrice;
        this.fuentePrice = fuentePrice;
    }
    
    
}
