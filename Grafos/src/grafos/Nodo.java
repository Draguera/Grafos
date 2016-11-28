/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author JBARDALEG
 */
public class Nodo<T extends Comparable<T>> 
{
    T elem;
    int index;
    Nodo<T> next;

    public Nodo<T> getNext() {
        return next;
    }
    public int getIndex() {
        return index;
    }
    public T getElem() {
        return elem;
    }

    public Nodo(T elem, int index) {
        this.elem = elem;
        this.index = index;
        this.next = null;
    }
    
}
