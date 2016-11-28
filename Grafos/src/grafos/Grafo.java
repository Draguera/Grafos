/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author JBARDALEG
 */
public class Grafo<T extends Comparable<T>> 
{
    Nodo<T>[] vertices;
    Nodo<T>[][] grafo;
    int numV; //Numero de vertices
    int numE;//Numero de aristas
    boolean[] visitado;
    ArrayList lista = new ArrayList<T>();
    
    
    public void DFS(Nodo<T> vertice, int reco[], int i)
    {
        Nodo<T> hermano = vertices[vertice.getIndex()];
        if(visitado[vertice.getIndex()])
            return;
        lista.add(vertices[i].getElem());
        visitado[vertice.getIndex()] = true;
        reco[i] = vertice.getIndex();
        if(i == lista.size())
            System.out.println(reco);
        while(hermano != null)
        {
            DFS(hermano,reco,i++);
            hermano = hermano.getNext();
        }
        visitado[vertice.getIndex()] = false;
    }
    public void Ham(Nodo<T> nodo, int cont)
    {
        
    }
    public void BFS(int i, ArrayList<T> lista)
    {
        
    }
}
