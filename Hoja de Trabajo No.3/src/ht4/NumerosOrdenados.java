//******************************************************************************************************************
//Universidad del Valle de Guatemala
//Autores:                  William Orosco      13386
//                          Dulce Chacon        13463
//                          Nancy Giron         13467
//                          Luis Gomez          13135
// Clase donde se guardan los numeros aleatorios ya ordenados en un archivo. 
// Referencia: http://eddytocodigo.com/2011/04/03/java-abre-y-sobreescribe-un-archivo-de-texto/
//******************************************************************************************************************


package ht4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

/**
 *
 * @author Luis
 */
public class NumerosOrdenados {
    
    
    
    
    
    File archivo; 
    
    public NumerosOrdenados(String cadena)throws FileNotFoundException, IOException{
 
        //Se abre el archivo de texto donde se guardaran los numeros random generados.
        archivo = new File("C:/numerosOrdenados.txt"); 
        
        
        
        //se manejan todas las posibles excepciones posibles y se reescribe el archivo
        if (archivo == null) {
        throw new IllegalArgumentException("El archivo no debe ser nulo.");
        }
        if (!archivo.exists()) {
        throw new FileNotFoundException ("el archivo para guardar los numeros ordenados no existe: " + archivo);
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
