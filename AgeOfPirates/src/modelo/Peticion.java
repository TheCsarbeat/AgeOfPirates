/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.TipoAccion;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author erksm
 */
public class Peticion implements Serializable{
    private TipoAccion accion;
    private Object datosEntrada;
    private Object datosSalida;    

    public TipoAccion getAccion() {
        return accion;
    }

    public void setAccion(TipoAccion accion) {
        this.accion = accion;
    }

    public Object getDatosEntrada() {
        return datosEntrada;
    }

    public void setDatosEntrada(Object datosEntrada) {
        this.datosEntrada = datosEntrada;
    }

    public Object getDatosSalida() {
        return datosSalida;
    }

    public void setDatosSalida(Object datosSalida) {
        this.datosSalida = datosSalida;
    }
    public Peticion(TipoAccion accion, Object datosEntrada) {
        this.accion = accion;
        this.datosEntrada = datosEntrada;
    }
    public Peticion(TipoAccion accion, Object datosEntrada, Object datosSalida) {
        this.accion = accion;
        this.datosEntrada = datosEntrada;
        this.datosSalida = datosSalida;
    }
    
    
    
}
