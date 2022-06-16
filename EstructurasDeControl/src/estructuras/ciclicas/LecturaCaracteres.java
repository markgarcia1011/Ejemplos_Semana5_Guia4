
package estructuras.ciclicas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LecturaCaracteres {
    public void main (String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresa el nombre:");
            String nombre = leer.readLine();
            leerCaracteresFor(nombre.toUpperCase());     
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void leerCaracteresFor(String palabra) {
        for(int i =0; i < palabra.length(); i++) {
            System.out.println("Caracter: " + i + " ->: " + palabra.charAt(i));     
        }
    }
    
}

