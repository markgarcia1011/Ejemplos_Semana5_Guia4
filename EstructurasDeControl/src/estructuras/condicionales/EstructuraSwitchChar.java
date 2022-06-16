
package estructuras.condicionales;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EstructuraSwitchChar {
    
    public static void main(String [] args) {
        try{ 
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el estado civil de la persona:");
            String estadoCivil = leer.readLine(); 
            
            switchChar(estadoCivil.toUpperCase().charAt(0));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      public static void switchChar(char estadoCivil){ 
          String mensajeEstadoCivil;
          switch(estadoCivil){ 
              case 'S': 
                  mensajeEstadoCivil = "Soltero/a";
                  break; 
              case 'C': 
                  mensajeEstadoCivil = "Casado/a";
                  break;
              case 'D':
                   mensajeEstadoCivil = "Divorsiado/a";
                   break; 
              case 'A':
                   mensajeEstadoCivil = "Acompañado/a";
                   break;
              case 'F':
                   mensajeEstadoCivil = "Forever Alone";
                    break;
              default: 
                  mensajeEstadoCivil = "EstadoCivil erroneo!";
        }
          System.out.println("Su estadoCivil es: " + mensajeEstadoCivil);
          
      }
          
 }
