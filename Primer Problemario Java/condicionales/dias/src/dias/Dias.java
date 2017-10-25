/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias;

import java.util.Scanner;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Dias {

    /**
     * @param args the command line arguments
     */
    //Solicitar al usuario la inicial del dia de la semana y mostrar el nombre del dia completo.
    //La letra inicial puede ser mayuscula o minuscula. Usar la X para el miercoles.
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char dia = 0;
        System.out.println("Por favor ingresa una letra incial de un dia de la semana");
        dia = sc.next().charAt(dia);
        switch (dia){
            case 'l':
            case 'L':
                System.out.println("Lunes");
                break;
            case 'm':
            case 'M':
                System.out.println("Martes");
                break;
            case 'x':
            case 'X':
                System.out.println("Miercoles");
                break;
            case 'j':
            case 'J':
                System.out.println("Jueves");
                break;
            case 'v':
            case 'V':
                System.out.println("Viernes");
                break;
            case 's':
            case 'S':
                System.out.println("Sabado");
                break;
            case 'd':
            case 'D':
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Letra incorrecta");
                break;
        }
    }
    
}
