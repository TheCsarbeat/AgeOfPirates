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
public class Armeria extends Estructura {    
    public Armeria(String id) {
        super.id = id;
    }

    @Override
    public void setPuntos(Punto mainP) {
        int x = mainP.getX(), y = mainP.getY();
        super.cellsBusy.add(mainP);
        if(super.espacio == 12){
            if(y==19){
               super.cellsBusy.add(new Punto(x,y-1)); 
            }else{
                super.cellsBusy.add(new Punto(x,y+1));
            }
        }else{
            if(x==19){
                super.cellsBusy.add(new Punto(x-1,y));
            }else{
                super.cellsBusy.add(new Punto(x+1,y));
            }
        }
    }


    
    
}
