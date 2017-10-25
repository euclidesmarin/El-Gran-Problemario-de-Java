/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisiesto;

import java.util.Scanner;

/**
 *
 * @author emarin
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    //Un a;o es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400.
    //Escribe un programa que lea un a;o y devuelva si es bisiesto o no.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = 0;
        System.out.println("Ingresa el año");
        a=sc.nextInt();
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
    System.out.println("Es bisiesto");
    }else{
            System.out.println("No es bisiesto");
        }
    }
    
}
