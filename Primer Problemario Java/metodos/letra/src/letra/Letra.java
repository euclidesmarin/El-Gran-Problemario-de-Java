/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letra;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Euclides
 */
public class Letra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        letraRepetida repetir = new letraRepetida();
        repetir.setNum1(LeerNumero("Ingrese el numero de veces que desea repetir la letra"));
        repetir.setLetra(LeerChar("Introduce la letra"));
        repetir.repetirletra();
    }
    
    public static int LeerNumero(String mensaje)
    {
       Scanner sc=new Scanner(System.in);
       do
       {
           try
           {
             System.out.println(mensaje);
             return sc.nextInt();
           }
           catch(InputMismatchException e)
           {
             sc.next();
             System.out.println("Error en formato de numero, " + e.getMessage());
           }
       
       }while(true);    
    }
    
    public static char LeerChar(String mensaje)
    {
       Scanner sc=new Scanner(System.in);
       do
       {           
         System.out.println(mensaje); 
         String valor = sc.next();
         if(valor.length() == 1)
             return valor.charAt(0);
         
         System.out.println("Error, debe ser un caracter");
       }while(true); 
    
    }
    
}
