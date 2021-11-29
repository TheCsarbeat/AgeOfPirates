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
import java.util.ArrayList;
import modelo.Peticion;

/**
 *
 * @author erksm
 */
public class Client {
    private Peticion nuevaPeticion;

    public void setNuevaPeticion(Peticion nuevaPeticion) {
        this.nuevaPeticion = nuevaPeticion;
    }

    public Peticion getNuevaPeticion() {
        return nuevaPeticion;
    }
    
    public Object getRespuestaServer(){
        return nuevaPeticion.getDatosSalida();
    } 

    public Client() {

        try {
            // establezco comunicacion con el servidor
            Socket skCliente = new Socket(IConstantes.HOST, IConstantes.PUERTO);

            // abrir el canal de recepcion del socket que viene desde el servidor
            InputStream auxEntrada = skCliente.getInputStream();
            DataInputStream flujoEntrada = new DataInputStream(auxEntrada);

            // abrir el canal de envío del socket que va hacia el servidor
            OutputStream auxSalida = skCliente.getOutputStream();
            DataOutputStream flujoSalida = new DataOutputStream(auxSalida);

            // envio al servidor
            flujoSalida.writeUTF("XXX");

            // recibiendo la respuesta del servidor
            System.out.println(flujoEntrada.readUTF());

            //desconecto el socket
            skCliente.close();

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
}
