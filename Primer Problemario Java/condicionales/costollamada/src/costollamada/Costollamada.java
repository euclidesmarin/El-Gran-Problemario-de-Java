/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costollamada;

import java.util.Scanner;

/**
 *
 * @author Euclides
 */
public class Costollamada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            long minuto = 0, llamada;
            System.out.println("Introduzca la cantidad de minutos de la llamada");
            minuto = sc.nextInt();
            if (minuto <=5)
            {
                System.out.println("El costo de la llamada es de Bs F 10");
            }else{
                llamada = minuto *2;
                System.out.println("El costo de la llamada es "+llamada);
            }
        }catch (Exception e){
            System.out.println("Error en formato de dato "+e.getMessage());
        }
    }
    
}
