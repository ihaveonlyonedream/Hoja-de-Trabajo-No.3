//******************************************************************************************************************
//Universidad del Valle de Guatemala
//Autores:                  William Orosco      13386
//                          Dulce Chacon        13463
//                          Nancy Giron         13467
//                          Luis Gomez          13135
//Clase MAIN para GENERAR NUMEROS ALEATORIOS y guardarlos en un archivo de texto
//para que fucione:
//
//Crear el archivo numeros.txt en la direccion C:/   
//(directamente en el disco duro, no meter en ninguna otra carpeta)
//
//******************************************************************************************************************



package ht4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//******************************************************************************************************************

public class Main {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //******************************************************************************************************************
        
        //Se genera un archivo de texto con numeros aleatorios
        RndNumeros generador = new RndNumeros();
 
        //******************************************************************************************************************
        
        //Lectura del documento Datos.txt
        try{
            //Se abre el archivo Datos.txt y se lee linea por linea. 
            FileInputStream archivo = new FileInputStream("C:/numeros.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String linea;
            String resultado = "";
            
        //******************************************************************************************************************    
            
            //Se lee linea por linea
            while ((linea = buffer.readLine()) != null)   {

                //Se eliminan las comas del string y se agregan a un arreglo de strings.
                String[] lineaArray = linea.split(",");
                
        //******************************************************************************************************************
                //Se imprime los numero generados en desorden
                for(int i=0; i < lineaArray.length;i++){
                    resultado = resultado+" "+lineaArray[i];
            }
                             System.out.println("Numeros en desorden:" +resultado + "\nNumeros Ordenados:");
                             
        //******************************************************************************************************************        
        //******************************************************************************************************************       
                
                //Distintos tipos de Sorting utilizados para el profiler ------------->Quitar doble diagonal en el sorting deseado
                             
                             
                resultado = Sorting.bubbleSort(lineaArray,lineaArray.length);
                //resultado = Sorting.insertionSort(lineaArray, lineaArray.length);
                //resultado = Sorting.mergeSort(lineaArray);
                //resultado = Sorting.quickSort(lineaArray);
                
        //******************************************************************************************************************        
        //******************************************************************************************************************        
                
                NumerosOrdenados guardar = new NumerosOrdenados(resultado);
            }
            
        entrada.close();
            
            
        }catch (Exception e){ 
            System.err.println("Archivo no encontrado");
        }
    }
}

//******************************************************************************************************************