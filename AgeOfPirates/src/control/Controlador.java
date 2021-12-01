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
            
        }else if(accion == TipoAccion.BUY_EXCHANGE){      
            ArrayList datos = (ArrayList)peticion.getDatosEntrada();            
            boolean answer = buyExchange((int)datos.get(0), (int)datos.get(1), (int)datos.get(2));
            peticion.setDatosSalida(answer);     
            
        }else if(accion == TipoAccion.CHECK_PLAYER_READY){ 
            peticion.setDatosSalida(cheackPlayersReady());      
            
        }else if(accion == TipoAccion.FINISH_TURN){ 
            ArrayList datos = (ArrayList) peticion.getDatosEntrada();     
            Player p = getPlayer((int)datos.get(0));
            peticion.setDatosSalida(modifcarTurn(p, (Arma)datos.get(1)));      
            
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
        if(index>=100){
            p = new Player(-1)  ;      
        }else{   
            p =  new Player(index);
            if(index== 0)
                p.setTurn(true);
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
    
    private boolean buyExchange(int id, int idBuyer, int idSeller){
        Player buyyer = getPlayer(idBuyer);
        Player seller = getPlayer(idSeller);
        int precio = 0;
        int index = 0;
        for(Exchange e: walterMercado){
            if(e.getId() == id){
                precio = e.getPrecio();
            }
        }        
        if(precio<= buyyer.getMoney()){
            buyyer.setMoneyLess(precio);
            seller.setMoneyMore(precio);
            
            for(Exchange e: walterMercado){
                if(e.getId() == id){
                    walterMercado.remove(index);
                    buyyer.addArma(e.getArma());
                    break;
                }
                index++;
            }            
            updatePlayer(buyyer);
            updatePlayer(seller);
            return true;
        }else{
            return false;
        }       
    }
    
    public boolean cheackPlayersReady(){
        for(Player i: players){
            if(!i.isReady()){
               return false;
            }
        }
        return true;
    }
    
    public boolean modifcarTurn(Player p, Arma arma){
        Player next; 
        p.setTurn(false);
        int index = 0;
        for(Player i: players){
            if(p.getId() == i.getId()){
                break;
            }
            index++;
        }
        
        p.eliminarArma(arma.getId());
        if(p.getId() == players.size()-1){
            next = players.get(0);
            next.setTurn(true);
            
            players.set(0, next);
        }else{
            next = players.get(index+1);
            next.setTurn(true);
            players.set(index+1, next);
        }
        return true;
    }
}
