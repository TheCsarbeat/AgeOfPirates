/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Message;
import modelo.Peticion;
import modelo.Player;

/**
 *
 * @author erksm
 */
public class Controlador {
    
    private ArrayList<Message> chat = new ArrayList();
    private ArrayList<Player> players = new ArrayList();
    
    public Controlador() {
    }
    
    public Peticion procesarPeticion(Peticion peticion) {
        TipoAccion accion = peticion.getAccion();
        if(accion == TipoAccion.CONECTARSE){ 
            int id = addPlayer();
            peticion.setDatosSalida(id);            
            
        }else if(accion == TipoAccion.SEND_MSG){
            Message msg = (Message)peticion.getDatosEntrada();
            chat.add(msg);
            peticion.setDatosSalida(chatToString());            
        }else if(accion == TipoAccion.ACTUALIZAR_CHAT){
            peticion.setDatosSalida(chatToString());            
        }
        
        return peticion;
    }
    
    private String chatToString(){
        String datos = "";
        for (Message i: chat) 
            datos += "\n\n"+i.toString();
        
        return datos;
        
    }
    
    private int addPlayer(){
        int index = players.size();
        if(index>=4)
            return -1;            
        else
            players.add(new Player(index));        
        return index;
    }
}
