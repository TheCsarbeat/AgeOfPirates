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
 * @author ytces
 */
public  abstract class  Estructura  implements Serializable{
    protected ArrayList<Punto> cellsBusy;
    protected String id; //Estandar: armeria-> "ARM-0", "ARM-1" | mina-> "MIN-0", "MIN-1", es decir tres letras y un numero
    protected int espacio; //2x2 = 22, 1x2 = 12, 2x1 = 21, 1x1 = 11
    protected boolean state;
    protected boolean destruida;

    public Estructura() {
        this.cellsBusy = new ArrayList();
        this.destruida = false;
    }

    public String getId() {
        return id;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    
    public Punto getFirstCoordinate(){
        return cellsBusy.get(0);
    }
    
    public abstract void setPuntos(Punto mainP);

    public ArrayList<Punto> getCellsBusy() {
        return cellsBusy;
    }

    public void setCellsBusy(ArrayList<Punto> cellsBusy) {
        this.cellsBusy = cellsBusy;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    public boolean isDestruida() {
        return destruida;
    }

    public void setDestruida(boolean destruida) {
        this.destruida = destruida;
    }
            
    @Override
    public String toString() {
        return "Estructura{" + "cellsBusy=" + cellsBusy + ", id=" + id + ", espacio=" + espacio + '}';
    }
    
    
}
