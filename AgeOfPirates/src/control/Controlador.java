/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;
import modelo.Peticion;

/**
 *
 * @author erksm
 */
public class Controlador {

    public Controlador() {
    }
    
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        TipoAccion accion = peticionRecibida.getAccion();
        if(accion == TipoAccion.CONECTARSE){ 
            ArrayList arrayDatos = (ArrayList) peticionRecibida.getDatosEntrada(); 
            peticionRecibida.setDatosSalida("Se ha conectado");

        }
        
        return peticionRecibida;
    }
}
