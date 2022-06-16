
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchlnt {
  public static void main(String [] args) {
        try{ 
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingrese un número entre 1 y 5");
            int numero = Integer.parseInt(leer.readLine()); 
            switchInt(numero);
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
public static void switchInt(int numero){ 
    String nombreDelNumero;
    switch (numero){ 
        case 1: 
            nombreDelNumero = "Uno";
            break; 
        case 2: 
            nombreDelNumero = "Dos";
            break;
        case 3:
            nombreDelNumero = "Tres";
            break;
        case 4:
            nombreDelNumero = "Cuatro";
        case 5:
            nombreDelNumero = "Cinco";
            break;
        default: 
            nombreDelNumero = "Número no válido!";
    }
    System.out.println("El número ingresado es: " + nombreDelNumero);
  }  
}
