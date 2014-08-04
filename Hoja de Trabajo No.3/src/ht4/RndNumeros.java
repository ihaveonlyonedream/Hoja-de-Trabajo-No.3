/*
 *Clase donde se generan numeros aleatorios y se guardan en un archivo. 
 * Referencia: http://eddytocodigo.com/2011/04/03/java-abre-y-sobreescribe-un-archivo-de-texto/
 */
package ht4;

import java.io.*;
import java.util.Random;

/**
 *
 * @author W
 */
public class RndNumeros {
    
    /*------------------------------------------------------------
     *constante para manejar la cantidad de numeros aleatorios generados.
     *HACER PRUEBAS EN PROFILER CON VALORES DE 10, 100, 500, 1000, 1200, 1600, 1800, 2000*/
    private final int tamanio = 10;
    //------------------------------------------------------------
    private  Random random = new Random();
    
    File archivo; 
    
    public RndNumeros()throws FileNotFoundException, IOException{
 
        //Se abre el archivo de texto donde se guardaran los numeros random generados.
        archivo = new File("C:/numeros.txt"); 
        String cadena="";
        //los numeros aleatorios se generany se concatenan en una cadena separados por espacios
        for (int i=0; i<tamanio; i++){
        //generacion de numeros aleatorios desde cero hasta 3000. Se generaran entre hasta  2000 aleatorios. 
            cadena+=random.nextInt(10)+",";//los numeros se separan con comas al guardarlos, para facilitar la separacion posterior
        }
        
        //se manejan todas las posibles excepciones posibles y se reescribe el archivo
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
            output.write(cadena);//si no ocurrio ningun error, se sobreescribe el archivo

        }
        finally {
            output.close();
        }
    }
}
    
