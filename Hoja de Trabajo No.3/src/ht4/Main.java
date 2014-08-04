/*
 * Clase MAIN para GENERAR NUMEROS ALEATORIOS y guardarlos en un archivo de texto
 * para que fucione:
 * 
 * Crear el archivo numeros.txt en la direccion C:/   
 * (directamente en el disco duro, no meter en ninguna otra carpeta)
 */
package ht4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author W
 */
public class Main {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
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

                //Se eliminan los espacios del string y se agregan a un arreglo de strings.
                String[] lineaArray = linea.split(",");
        //******************************************************************************************************************
                for(int i=0; i < lineaArray.length;i++){
                    resultado = resultado+" "+lineaArray[i];
            }
                             System.out.println(resultado);
                
                Sorting.bubbleSort(lineaArray,lineaArray.length);
                
    
            }
        entrada.close();
            
            
        }catch (Exception e){ 
            System.err.println("Archivo no encontrado");
        }
    }
}
