/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ytces
 */
public class Conector extends Estructura{
    
    public Conector(String id) {
        super.id = id;
    }

    @Override
    public void setPuntos(Punto mainP) {
        super.cellsBusy.add(mainP);
    }
}
