/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import modelo.Arma;
import modelo.Estructura;
import modelo.Exchange;
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
    private ArrayList<Exchange> walterMercado = new ArrayList();
    public Controlador() {
    }
    
    public Peticion procesarPeticion(Peticion peticion) {
        TipoAccion accion = peticion.getAccion();
        if(accion == TipoAccion.CONECTARSE){ 

            peticion.setDatosSalida(addPlayer());            
            
        }else if(accion == TipoAccion.SEND_MSG){
            Message msg = (Message)peticion.getDatosEntrada();
            chat.add(msg);
            peticion.setDatosSalida(chatToString());            
        }else if(accion == TipoAccion.ACTUALIZAR_CHAT){
            peticion.setDatosSalida(chatToString());       
            
        }else if(accion == TipoAccion.ACTUALIZAR_PLAYER){
            Player player = (Player)peticion.getDatosEntrada();   
            peticion.setDatosSalida(updatePlayer(player));          
            
        }else if(accion == TipoAccion.GET_PLAYER){
            int id = (int)peticion.getDatosEntrada();   
            peticion.setDatosSalida(getPlayer(id));          
            
        }else if(accion == TipoAccion.ADD_EXCHANGE){
            ArrayList datos = (ArrayList)peticion.getDatosEntrada();            
            boolean answer = addExchange((int)datos.get(0), (int)datos.get(1), (Arma)datos.get(2));
            peticion.setDatosSalida(answer);       
            
        }else if(accion == TipoAccion.LOAD_EXCHANGES){      
            
            peticion.setDatosSalida(walterMercado);            
        }
        
        return peticion;
    }
    
    private String chatToString(){
        String datos = "";
        for (Message i: chat) 
            datos += "\n\n"+i.toString();
        
        return datos;
        
    }
    
    private Player addPlayer(){
        int index = players.size();
        Player p = null;
        if(index>=4){
            p = new Player(-1)  ;      
        }else{     
            p =  new Player(index);
            players.add(p);
        }                    
        return p;
    }
    
    private Player updatePlayer(Player player){
        int id = player.getId();
        int index =0;
        for(Player i: players){
            if(i.getId() == id){
                players.set(index, player);
                break;
            }
            index++;
        }
        return players.get(index);
    }
    
    private Player getPlayer(int id){
        for(Player i: players){
            if(i.getId() == id){
                return i;
            }

        }
        return null;
    }
    
    private boolean addExchange(int precio, int idPlayer, Arma arma){
        int idExchange = walterMercado.size();
        Exchange e = new Exchange(idExchange, precio, idPlayer, arma);
        
        for(Player i: players){
            if(i.getId() == idPlayer){
                e.setNamePlayer(i.getName());
                walterMercado.add(e);
                i.eliminarArma(arma.getId());
                return true;
            }
        }
        
        return false;
       
    }
}
