/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import modelo.Peticion;

/**
 *
 * @author erksm
 */
public class Server {
    
    private Controlador accesoApp = new Controlador();
    private int numCli = 0;

    public Server() {
        try {

            ServerSocket skServidor = new ServerSocket(IConstantes.PUERTO);
            System.out.println("Inicializando servidor en puerto " + IConstantes.PUERTO);

            while (true) {
                System.out.println("Esperando petición...");
                Socket skCliente = skServidor.accept(); // espera la activacion de una peticion
                ClientServiceThread client = new ClientServiceThread(skCliente);
                client.start();
                numCli++;
                
                System.out.println("SOy un nuevo cliente: "+numCli);

               

                // desconecta la comunicacion con el cliente
                //skCliente.close();
                System.out.println("Desconectando al cliente " + numCli);

            } // ciclo
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    class ClientServiceThread extends Thread { 
        Socket skCliente;
        boolean m_bRunThread = true; 
        
         ObjectInputStream flujoEntrada;
         ObjectOutputStream flujoSalida;
        
        BufferedReader in = null; 
         PrintWriter out = null; 
        public ClientServiceThread() { 
           super(); 
        } 

        ClientServiceThread(Socket s) { 
           skCliente = s; 
        } 
		
        public void run() {
            
            try{
                System.out.println("Atendiendo petición" + numCli + skCliente.getInetAddress());

                // establece el canal de salida del servidor hacia el cliente
                OutputStream auxSalida = skCliente.getOutputStream();
                flujoSalida = new ObjectOutputStream(auxSalida);

                // establece el canal de entrada desde el cliente hacia el servidor 
                InputStream auxEntrada = skCliente.getInputStream();
                flujoEntrada = new ObjectInputStream(auxEntrada);  
                
//                InputStreamReader streanREader = new InputStreamReader(skCliente.getInputStream());
//                in = new BufferedReader(
//                new InputStreamReader(skCliente.getInputStream()));
//                out = new PrintWriter(
//                new OutputStreamWriter(skCliente.getOutputStream()));
//            
                Object input;
                while((input = flujoEntrada.readObject()) != null){
                    //String clientCommand = in.readLine(); 
                    //System.out.println("Client Says :" + clientCommand);
                   
                    
                    if(input!= null){
                        Peticion peticionRecibida = (Peticion)input;
                        System.out.println(input.getClass());
                        //Peticion peticionRecibida = (Peticion) flujoEntrada.readObject();
                        System.out.println("peticion recibida" + peticionRecibida);

                        // transfiere la petición a la logica de aplicación y esta le devuelve la respuesta en la misma peticion
                        peticionRecibida = accesoApp.procesarPeticion(peticionRecibida);
                         
//                        if(!peticionRecibida.isTime()){
//                            m_bRunThread = false;
//                        }

                        // servidor envia respuesta al cliente
                        flujoSalida.writeObject(peticionRecibida);
                    }else{
                        System.out.println("Datos de entrada son nulos");
                    }
                    System.out.println("Ciclado");
                    Thread.sleep(500);
                    
                }

            } catch(Exception e) { 
                System.out.println("SOy un error");
               //e.printStackTrace(); 
            }finally { 
                try { 
                    if (flujoSalida != null) {
                        flujoSalida.close();
                    }
                    if (flujoEntrada != null) {
                        flujoEntrada.close();
                        skCliente.close(); 
                    }                   
                     System.out.println("...Stopped"); 
                } catch(IOException ioe) { 
                   ioe.printStackTrace(); 
                } 
             }
            
        } 
    } 
    
    
    
}
