/*
 * Universidad del valle de Guatemala
 * Algoritmos y estructuras de datos
 */
package ht4;

/**
 *
 * @author William Orozco
 * Interfaz a implementar en la clase Arreglo
 */
public interface Comparable {
    public abstract int getValor(int i);
    public abstract void setValor (int i, int valor);
    public abstract boolean compareTo(int i, int j);
}
