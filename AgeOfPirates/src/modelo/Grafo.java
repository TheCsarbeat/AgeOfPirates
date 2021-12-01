/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dmora
 */
public class Grafo  implements Serializable{

    public ArrayList<Vertice> vertices;

    public Grafo()
    {
        vertices = new ArrayList<Vertice>();
    }

    // agrega a la lista
    public void agregarVertice(Estructura estructura)
    {
        vertices.add(new Vertice(estructura));
    }
    
    // agrega a la lista
    public void agregarVertice(Vertice vertice)
    {
        vertices.add(vertice);
    }

    // agrega las aristas
    public void agregarArista(Vertice origen, Vertice destino)
    {
        //System.out.println(origen.toString()+"     |     "+destino.toString());
        
        if (origen != null && destino != null && origen.estructura instanceof Conector)
            origen.agregarArista(destino);
    }

    // agrega las aristas con peso
    public void agregarArista(Vertice origen, Vertice destino, int peso)
    {
        if (origen != null && destino != null)
            origen.agregarArista(destino, peso);
    }

    // busca un vertice en la lista
    public Vertice buscarVertice (String valor){
        for (int i = 0; i < vertices.size(); i++) {            
            if (vertices.get(i).estructura.id.equals(valor))
                return vertices.get(i);
        }

        return null;
    }

    // imprime la lista con sus listas de adyacencia
    public void imprimir ()
    {
        for (int i = 0; i < vertices.size(); i++)
        {
            System.out.print("Vertice "+vertices.get(i).estructura.id+":  ");
            for (int j = 0; j < vertices.get(i).aristas.size(); j++) {
                System.out.print(vertices.get(i).aristas.get(j).estructura.id +"  ");
            }
            System.out.println("");
        }
    }

    // elimina un vertice, de la lista y de las listas de adyacencia
    // imprime la lista con sus listas de adyacencia
    public void eliminar (Vertice v)
    {
        for (int i = 0; i < vertices.size(); i++)
        {
            for (int j = 0; j < vertices.get(i).aristas.size(); j++) {
                if (vertices.get(i).aristas.get(j).estructura.id == v.estructura.id)
                    vertices.get(i).aristas.remove(j);
            }
        }

        vertices.remove(v);
    }


    // Recorrido PROFUNDIDAD
    public void profundidad()
    {
        // recorre todos los nodos
        for (int i = 0; i < vertices.size(); i++)
        {
            if(vertices.get(i).visitado == false)
            {
                visitarAdyacentes(vertices.get(i));
            }
        }

        limpiarVisitados();// quita todos los nodos visitados

    }

    // vissita los nodos en la lista de adyacencia
    public void visitarAdyacentes(Vertice nodo)
    {
        visitarVertice(nodo);
        System.out.print(nodo.estructura.id+"  ");

        // para cada arista
        for (int i = 0; i < nodo.aristas.size(); i++)
        {
            // marca cada uno de los adyacentes
            if (visitadoVertice(nodo.aristas.get(i)) == false)
            {
                visitarAdyacentes(buscarVertice(nodo.aristas.get(i).estructura.id));
            }
        }
    }

    public void visitarVertice(Vertice nodo)
    {
        for (int i = 0; i < vertices.size(); i++) {
            if (nodo.estructura.id == vertices.get(i).estructura.id)
                vertices.get(i).visitado = true;
        }
    }

    public boolean visitadoVertice(Vertice nodo)
    {
        for (int i = 0; i < vertices.size(); i++) {
            if (nodo.estructura.id == vertices.get(i).estructura.id)
                return vertices.get(i).visitado;
        }
        return false;// si no está
    }

    public void limpiarVisitados()
    {
        for (int i = 0; i < vertices.size(); i++) {
            Vertice vertice = vertices.get(i);
            vertice.visitado = false;
        }
    }


    //----------------------------------------
    public void anchura(Vertice v)
    {
        System.out.print(v.estructura.id+"  ");
        visitarVertice(v);// marca el primer nodo
        ArrayList<Vertice> cola = new ArrayList<Vertice>();
        // mete a la cola los adyacentes del nodo inicial
        for (int i = 0; i < v.aristas.size(); i++) {
            cola.add(buscarVertice(v.aristas.get(i).estructura.id));// es para buscar el nodo en vertices
            visitarVertice(v.aristas.get(i));
            //System.out.println("COLA "+v.aristas.get(i).dato);
        }
        // mientras no se vacíe la cola
        while(!cola.isEmpty())
        {
            // trabaja con el primero de la cola
            Vertice actual = cola.remove(0);
            visitarVertice(actual);
            System.out.print(actual.estructura.id+"  ");
            // cada arista del vertice en la cola
            for (int i = 0; i < actual.aristas.size(); i++) {

                // si no se ha visitado se mete en la cola el adyacente
                if(visitadoVertice(actual.aristas.get(i))==false)
                {
                    // si no está ya en la cola, se mete
                    visitarVertice(buscarVertice(actual.aristas.get(i).estructura.id));
//                    System.out.println("METE"+ actual.aristas.get(i).dato+ "  "+actual.aristas.get(i).visitado);
                    cola.add(actual.aristas.get(i));
                }       
            }
        }
        limpiarVisitados();
    }

    public boolean hayConector(){
        for (int i = 0; i < vertices.size(); i++){
            if(vertices.get(i).estructura instanceof Conector){
                return true;
            }
        }
        return false;
    }

    public boolean hayFuente(){
        for (int i = 0; i < vertices.size(); i++){
            if(vertices.get(i).estructura instanceof Fuente){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String datos = "\n\n";
        for (int i = 0; i < vertices.size(); i++)
        {
            datos += "\nVertice "+vertices.get(i).estructura.id+":  ";
            //System.out.print("Vertice "+vertices.get(i).estructura.id+":  ");
            for (int j = 0; j < vertices.get(i).aristas.size(); j++) {
                 datos += "\n"+vertices.get(i).aristas.get(j).estructura.id +"  ";
                        //System.out.print(vertices.get(i).aristas.get(j).estructura.id +"  ");
            }
             datos += "\n";
            System.out.println("");
        }
        
        return "Grafo{" + "vertices=" + vertices + '}';
    }

}
