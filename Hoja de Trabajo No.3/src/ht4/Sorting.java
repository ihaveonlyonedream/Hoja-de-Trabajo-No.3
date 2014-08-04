/*
 * Universidad del valle de Guatemala
 * Algoritmos y estructuras de datos
 */
package ht4;


/*
 * implementacion del codigo de los diferentes metodos de SORTING
 */
public class Sorting
{
    
    /*BUBBLE SORT. William Orozco. 
     * Codigo tomado de: Java Structures/Data structures for the principled programmer   
     * Autor: Duanef Bailey*/
   public static void bubbleSort (Comparable elementos, int i)
   {
      /*Implementacion del algoritmo de ordenamiento bubble Sort*/
      int numSorted =0; //numero de valores en orden
      int index; //contador general
      int temp;
      while (numSorted < i){
          for (index =1; index < i-numSorted; index++){
              if (elementos.compareTo(index-1,index)){
                  temp=elementos.getValor(index-1);
                  elementos.setValor(index-1, elementos.getValor(index));
                  elementos.setValor(index, temp);//se hace el intercambio
              }
          }
          numSorted++;
      }
   }
   
   
   //AGREGAR ACA EL CODIGO DE LOS OTROS METODOS DE SORTING.
   public static void insertionSort(int[] elementos, int index)
   {
       if(index < elementos.length)
       {
           int j = index;
	   int B = elementos[index];
	   while ((j > 0) && (elementos[j-1] > B))
           {
               elementos[j] = elementos[j-1];
	       j--;
           }
           elementos[j] = B;
	   insertionSort(elementos, index + 1);
       }
   }

}

