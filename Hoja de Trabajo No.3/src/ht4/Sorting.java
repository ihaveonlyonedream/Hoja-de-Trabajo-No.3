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
   
   /*QuickSort Nancy Girón 
    Codigo tomado de: Java Structures/Data structures for the principled programmer
    * Autor: Duanef Bailey*/
   public static void quicksort(int A[], int izq, int der)
    {

        int piv=A[izq]; //Tomamos el primer elemento de piv.
        int i=izq; // i va a buscar de izq a der. 
        int j=der; // j va a buscar de der a izq.
        int aux;

        while(i<j)
        {// Mientras no se cruce la busquda, esto se va a repetir. 
           while(A[i]<=piv && i<j) i++; // Busca elementos mayores del piv. 
                while(A[j]>piv) j--;         //Busca un elemento menor que el piv. 
                     if (i<j) 
                     {                                        
                         aux= A[i];           // hacer intercambio.
                         A[i]=A[j];
                         A[j]=aux;
                     }
                  }
        /*
         * El piv sera colocado de manera que del lado izquierdo estaran los menores a el, y 
         * del lado derecho se pocisionaran los mayores a el.
        */
         A[izq]=A[j];               
         A[j]=piv;                     
         if(izq<j-1)
            quicksort(A,izq,j-1); // se ordena el subarray izquierdo
         if(j+1 <der)
            quicksort(A,j+1,der); // se ordena el subarray derecho
    }

}

