/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Meses {

    /**
     * @param args the command line arguments
     */
    //Pedir un mes (numero) y mostrar el nombre del mes.
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mes = 0;
        System.out.println("Por favor ingresa un numero entre 1 y 12");
        mes = sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Solo se admiten numeros entre 1 y 12");
                break;
        }
    }
    
}
