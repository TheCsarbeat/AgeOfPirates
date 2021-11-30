/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.IConstantes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import modelo.Peticion;

/**
 *
 * @author erksm
 */
public class Client {
    private Peticion nuevaPeticion;
    private DataInputStream flujoEntrada; 
    private DataOutputStream flujoSalida;
    private ClientServiceThread hilo;
    private int run;

    public void setNuevaPeticion(Peticion nuevaPeticion) {
        this.nuevaPeticion = nuevaPeticion;
    }

    public Peticion getNuevaPeticion() {
        return nuevaPeticion;
    }
    
    public Object getRespuestaServer(){
        return nuevaPeticion.getDatosSalida();
    } 


    public Client(Peticion laPeticion, int value) {

        nuevaPeticion = laPeticion;
        run = value;
        try {
            // establezco comunicacion con el servidor
            Socket skCliente = new Socket(IConstantes.HOST, IConstantes.PUERTO);
            ClientServiceThread cliente = new ClientServiceThread(skCliente);
            cliente.start();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public Client(Peticion laPeticion) {

        nuevaPeticion = laPeticion;
        try {
            // establezco comunicacion con el servidor
            Socket skCliente = new Socket(IConstantes.HOST, IConstantes.PUERTO);

            // abrir el canal de envío del socket que va hacia el servidor
            OutputStream auxSalida = skCliente.getOutputStream();
            ObjectOutputStream flujoSalida = new ObjectOutputStream(auxSalida);

            // abrir el canal de recepcion del socket que viene desde el servidor
            InputStream auxEntrada = skCliente.getInputStream();
            ObjectInputStream flujoEntrada = new ObjectInputStream(auxEntrada);

            // envio al servidor
            flujoSalida.writeObject(nuevaPeticion);
            try {
                // recibiendo la respuesta del servidor
                nuevaPeticion = (Peticion) flujoEntrada.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("problemas de casting");
            }

            //desconecto el socket
            skCliente.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int isRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
    public void iniciarPeticion(){
        hilo.start();
    }
    
    class ClientServiceThread extends Thread { 
        Socket skCliente;
        boolean m_bRunThread = true; 
        public ClientServiceThread() { 
           super(); 
        } 

        ClientServiceThread(Socket s) { 
           skCliente = s; 
        } 
		
        public void run() {
            
            try{
                // abrir el canal de envío del socket que va hacia el servidor
                OutputStream auxSalida = skCliente.getOutputStream();
                ObjectOutputStream flujoSalida = new ObjectOutputStream(auxSalida);

                // abrir el canal de recepcion del socket que viene desde el servidor
                InputStream auxEntrada = skCliente.getInputStream();
                ObjectInputStream flujoEntrada = new ObjectInputStream(auxEntrada);
                
                while(run != 1){
                    // envio al servidor
                    flujoSalida.writeObject(nuevaPeticion);
                    try {
                        // recibiendo la respuesta del servidor
                        nuevaPeticion = (Peticion) flujoEntrada.readObject();                        
                    } catch (ClassNotFoundException ex) {
                        System.out.println("problemas de casting");
                    }                    
                    Thread.sleep(500);
                    if(run ==0){
                        run = 1;
                    }
                    
                }            
            } catch(Exception e) { 
                System.out.println("Soy un eeror");
               e.printStackTrace(); 
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
