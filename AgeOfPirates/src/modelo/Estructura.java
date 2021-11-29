/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ytces
 */
public  abstract class  Estructura {
    protected ArrayList<Punto> cellsBusy;
    protected String id; //Estandar: armeria-> "ARM-0", "ARM-1" | mina-> "MIN-0", "MIN-1", es decir tres letras y un numero

    public Estructura() {
        this.cellsBusy = new ArrayList();
    }
}
