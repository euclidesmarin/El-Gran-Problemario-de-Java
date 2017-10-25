/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedionotas;

import java.util.Scanner;

/**
 *
 * @author emarin
 */
public class Promedionotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double promedio, calificaciones=0,suma=0;
        int notas=7;
        for (int i=1;i<=notas;i++){
        System.out.append("Ingrese las calificaciones a promediar");
        calificaciones = sc.nextDouble();
        suma = suma + calificaciones;
        }
        System.out.println(suma);
        promedio = suma/calificaciones;
        System.out.println(promedio);
    }
    
}
