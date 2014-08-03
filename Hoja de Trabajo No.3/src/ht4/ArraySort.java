/*
 * Universidad del valle de Guatemala
 * Algoritmos y estructuras de datos
 * 
 * 
 * Clase para leer los numeros aleatorios generados, y ordenarlos con diferentes metodos de sorting
 * Instancia la clase Arreglo, y llama a los metodos del sorting. 
 */
package ht4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;


public class ArraySort {
    //atributos
    private Vector datos;
    private Arreglo sortArray;
    File archivo=new File("C:/numeros.txt"); 
public ArraySort() throws FileNotFoundException, IOException{
        
        // Abrimos el archivo
        FileInputStream fstream = new FileInputStream("C:/numeros.txt");
        // Creamos el objeto de entrada
        DataInputStream entrada = new DataInputStream(fstream);
        // Creamos el Buffer de Lectura para recibir todos los numeros como cadena de texto separados por espacio
        BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
        String strLinea; // variable temporal que almacena la lectura de la cadena de numeros separados por espacio
        
        // Lee cada linea del archivo, se queda con la ultima. Se comprueba que no sea linea vacia
        if ((strLinea = buffer.readLine()) != null){
            sortArray=new Arreglo(strLinea);
            //------------------------------------------------------------
            //ESTA LINEA DEBE MODIFICARSE PARA HACER LAS PRUEBAS CON LOS DIFERENTES SORTING
            Sorting.bubbleSort(sortArray, sortArray.getSize());
            //------------------------------------------------------------
            
        }
        
        
        //se crea una variable temporal para almacenar los numeros ordenados y mostrarlos en el archivo de texto
        String cadena="";
        for (int i=0; i<sortArray.getSize(); i++){
        //Los numeros ordenados se concatenan y se guardan en la cadena
            cadena+=Integer.toString(sortArray.getValor(i))+",";
            
        }
        
        
        //se manejan todas las posibles excepciones y se reescribe el archivo
        if (archivo == null) {
        throw new IllegalArgumentException("El archivo no debe ser nulo.");
        }
        if (!archivo.exists()) {
        throw new FileNotFoundException ("el archivo no existe: " + archivo);
        }
        if (!archivo.isFile()) {
        throw new IllegalArgumentException("no debe ser un directorio: " + archivo);
        }
        if (!archivo.canWrite()) {
        throw new IllegalArgumentException("El archivo no puede ser escrito: " + archivo);
        }

        Writer output = new BufferedWriter(new FileWriter(archivo));
        try {
            output.write(cadena);

        }
        finally {
            output.close();
        }
    }

    


    }





