/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
                numCli++;

                System.out.println("Atendiendo petición" + numCli + skCliente.getInetAddress());

                // establece el canal de salida del servidor hacia el cliente
                OutputStream auxSalida = skCliente.getOutputStream();
                ObjectOutputStream flujoSalida = new ObjectOutputStream(auxSalida);

                // establece el canal de entrada desde el cliente hacia el servidor 
                InputStream auxEntrada = skCliente.getInputStream();
                ObjectInputStream flujoEntrada = new ObjectInputStream(auxEntrada);

                Peticion peticionRecibida = (Peticion) flujoEntrada.readObject();
                System.out.println("peticion recibida" + peticionRecibida);

                // transfiere la petición a la logica de aplicación y esta le devuelve la respuesta en la misma peticion
                peticionRecibida = accesoApp.procesarPeticion(peticionRecibida);
                
                
                // servidor envia respuesta al cliente
                flujoSalida.writeObject(peticionRecibida);

                // desconecta la comunicacion con el cliente
                skCliente.close();
                System.out.println("Desconectando al cliente " + numCli);

            } // ciclo
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
