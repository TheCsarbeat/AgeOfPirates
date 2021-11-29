/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author dmora
 */
public class Vertice {
    public Estructura estructura;
    boolean visitado;
    ArrayList<Vertice> aristas;
    //int peso;//peso

    public Vertice(Estructura estructura)
    {
        aristas = new ArrayList<Vertice>();
        this.estructura = estructura;
        this.visitado = false;
    }

    public void agregarArista (Vertice arista)
    {
        // si no está la arista para no repetir
        if (buscarArista(arista) == -1)
            aristas.add(new Vertice(arista.estructura));
    }
    
    public void agregarArista (Vertice arista, int peso)
    {
        // si no está la arista para no repetir
        if (buscarArista(arista) == -1)
            aristas.add(new Vertice(arista.estructura));
    }

    public int buscarArista(Vertice v)
    {
        for (int i = 0; i < aristas.size(); i++) {
            if (v.estructura.id == aristas.get(i).estructura.id)
                return i;
        }
        return -1;
    }
}
