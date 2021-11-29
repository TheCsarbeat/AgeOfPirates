/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Message;
import modelo.Peticion;

/**
 *
 * @author erksm
 */
public class Controlador {
    
    private ArrayList<Message> chat = new ArrayList();
    public Controlador() {
    }
    
    public Peticion procesarPeticion(Peticion peticionRecibida) {
        TipoAccion accion = peticionRecibida.getAccion();
        if(accion == TipoAccion.CONECTARSE){ 
            peticionRecibida.setDatosSalida("Se ha conectado al servidor");
        }else if(accion == TipoAccion.SEND_MSG){
            Message msg = (Message)peticionRecibida.getDatosEntrada();
            chat.add(msg);
            peticionRecibida.setDatosSalida(chatToString());            
        }else if(accion == TipoAccion.ACTUALIZAR_CHAT){
            peticionRecibida.setDatosSalida(chatToString());            
        }
        
        return peticionRecibida;
    }
    
    private String chatToString(){
        String datos = "";
        for (Message i: chat) 
            datos += "\n\n"+i.toString();
        
        return datos;
        
    }
}
