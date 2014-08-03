/*
 * Clase encargada de guardar un arreglo de cadenas, despues de partir la cadena original de numeros que se leyo del archivo de texto
 */
package ht4;

/**
 *
 * @author W
 */
public class Arreglo implements Comparable{
    private String[] arregloCadenas;
    public Arreglo(String strLinea){
        //strLinea.replaceAll("\\s",",");//se separan los espacios por comas para poder hacer el split
        arregloCadenas=strLinea.split(",");//se guarda un arreglo de cadenas en array, despues de hacer split
    }

    @Override
    public int getValor(int i) { //metodo para retornar el valor entero que esta en la posicion i del arreglo
        return Integer.parseInt(arregloCadenas[i]);
    }
    
    
    @Override
    /*
    *compara dos elementos del arreglo. Devuelve true si el primero es mayor al segundo. 
    * Recibe como parametros las dos posiciones en el arreglo para obtener sus valores 
    */
    public boolean compareTo(int i, int j) {
        if (getValor(i)>getValor(j)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void setValor(int i, int valor) {
        arregloCadenas[i]=Integer.toString(valor);
    }
    
    public int getSize(){
        return arregloCadenas.length;
    }
    
}
