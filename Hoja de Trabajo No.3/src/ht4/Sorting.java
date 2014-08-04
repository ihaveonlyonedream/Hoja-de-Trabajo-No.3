//******************************************************************************************************************
//Universidad del Valle de Guatemala
//Autores:                  William Orosco      13386
//                          Dulce Chacon        13463
//                          Nancy Giron         13467
//                          Luis Gomez          13135
//Clase que contiene los distintos tipos de sorting. 
//
// BubbleSort, InsertionSort, QuickSort y MergeSort
//
//Todos los sort reciben como parametro un arreglo de strings y en el caso de bubbleSort e Insertion sort reciben
//como otro parametro la longitud del arreglo.
//******************************************************************************************************************
package ht4;


//******************************************************************************************************************

public class Sorting
{
    
    public static String resultado = "";
    
    
    /*BUBBLE SORT. William Orozco. 
     * Codigo tomado de: Java Structures/Data structures for the principled programmer   
     * Autor: Duanef Bailey*/
    //******************************************************************************************************************
    //******************************************************************************************************************
    
       public static String bubbleSort (String[] elementos, int i)
   {
      /*Implementacion del algoritmo de ordenamiento bubble Sort*/
      int numSorted =0; //numero de valores en orden
      String temp;
      while (numSorted < i){
          
          for (int index =1; index < i-numSorted; index++){
              
              if ((Integer.parseInt(elementos[index-1]))>(Integer.parseInt(elementos[index]))){
                  
                  temp = elementos[index-1];
                  elementos[index-1] = elementos[index];
                  elementos[index] = temp;//se hace el intercambio
              }
          }
          numSorted++;
      }
      
    for(int k=0; k < elementos.length;k++){
            if(k!=0)
            resultado = resultado + "," + elementos[k];
            else
                resultado = resultado + elementos[k];
        }
        System.out.println(resultado);
        
        return resultado;
    
   }
       //******************************************************************************************************************
       //******************************************************************************************************************
       
       
       
       /*insertionSort. Dulce Chacon. */
        //******************************************************************************************************************
       //******************************************************************************************************************
   
        public static String insertionSort(String[] elementos, int n)
   {
       int numerosOrdenados = 1;
       int index;
       
       
       while(numerosOrdenados < elementos.length){
          
           String temp = elementos[numerosOrdenados];
           
           for (index = numerosOrdenados; index > 0; index --){
           
               if (Integer.parseInt(temp)< Integer.parseInt(elementos[index-1])){
               
                   elementos[index] = elementos[index-1];
                              
               }else{
                   
                   break;
               
               
               }
           
               
           }
	   
           elementos[index] = temp;
           numerosOrdenados++;
           
       }
       
       for(int k=0; k < elementos.length;k++){
            if(k!=0)
            resultado = resultado + "," + elementos[k];
            else
                resultado = resultado + elementos[k];
        }
        System.out.println(resultado);
        return resultado;
   }
        
        
        //******************************************************************************************************************
        //******************************************************************************************************************
         
        
        
        /*QuickSort. Nancy Giron. */
        //******************************************************************************************************************
        //******************************************************************************************************************
        
public static String quickSort(String elementos[]){
    
        elementos = quickSortOrd(elementos,0,elementos.length - 1);
        for(int k=0; k < elementos.length;k++){
            if(k!=0)
            resultado = resultado + "," + elementos[k];
            else
                resultado = resultado + elementos[k];
        }
        System.out.println(resultado);
        return resultado;
  
}


    private static String[] quickSortOrd(String elementos [], int punteroIzquierdo, int punteroDerecho) {
    
             
        int izq = punteroIzquierdo;
        int der = punteroDerecho;
        
        if (punteroIzquierdo != punteroDerecho){
        
            int pivote = punteroIzquierdo;
            String temp;
            
            while(punteroIzquierdo != punteroDerecho){
            
                while ((Integer.parseInt(elementos[punteroDerecho]) >= Integer.parseInt(elementos[pivote]))&& (punteroIzquierdo < punteroDerecho)){
                    punteroDerecho--;
                }            
                
                while ((Integer.parseInt(elementos[punteroIzquierdo]) < Integer.parseInt(elementos[pivote]))&&(punteroIzquierdo < punteroDerecho)){
                
                    punteroIzquierdo++;
                
                }
                
                if (punteroDerecho != punteroIzquierdo){
                
                    temp = elementos[punteroDerecho];
                    elementos[punteroDerecho] = elementos[punteroIzquierdo];
                    elementos[punteroIzquierdo] = temp;
                    
                    
                
                }
            }
        
            if(punteroIzquierdo == punteroDerecho){
            
                quickSortOrd(elementos,izq,punteroIzquierdo );
                quickSortOrd(elementos,punteroIzquierdo +1,der);
                
            }
            
        }
        
        return elementos;
    }
    
    //******************************************************************************************************************
    //******************************************************************************************************************
    
    
    
    /*MergeSort. Luis Gomez*/
    //******************************************************************************************************************
    //******************************************************************************************************************
       
    public static String mergeSort(String [] elementos){
    
        elementos = MergeSortOrd(elementos);
        for(int k=0; k < elementos.length;k++){
            if(k!=0)
            resultado = resultado + "," + elementos[k];
            else
                resultado = resultado + elementos[k];
        }
        System.out.println(resultado);
        return resultado;
    }
    
    private static String[] MergeSortOrd(String [] elementos){
    
        if(elementos.length==1){
            return elementos;
        
        }else{
            
            int n = (int) Math.floor(elementos.length/2);
            String B[]= new String [n];
            String C[]= new String [elementos.length-n];
            
            
            for (int i = 0; i < elementos.length; i++){
               
                if(i<n)
                    B[i]=elementos[i];
                else
                    C[i-n]=elementos[i];
                
            }
            
            B=MergeSortOrd(B);
            C=MergeSortOrd(C);
            elementos=Merge(B,C);
            return elementos;

        }
        
    }

    private static String[] Merge(String[] A, String[] B) {
        
        String C[] = new String[(A.length) + (B.length)];
        int a=0,b=0;
        
        for (int i=0; i < (A.length) + (B.length);i++){
        
            if(a==A.length){
            
                C[i]=B[b];
                b++;
                 
            }
            else
            if(b==B.length){
            
                C[i]=A[a];
                a++;
       
            }
            else
            if(Integer.parseInt(A[a]) > Integer.parseInt(B[b])){
            
            
                C[i]=B[b];
                b++;
                  
            }
            else{
            
                C[i]=A[a];
                a++;
            
            }
            
        }

        return C;
    }
    
    
    //******************************************************************************************************************
    //******************************************************************************************************************

}
