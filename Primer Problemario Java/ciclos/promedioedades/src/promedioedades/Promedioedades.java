/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioedades;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Promedioedades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int edad,suma=0,promedio,alumnos=15;
        System.out.append("Ingrese las edades a promediar");
        for (int i=0;i<alumnos;i++){
        
        edad = sc.nextInt();    
        suma = suma + edad;
        }
        System.out.println(suma);
        promedio = suma/alumnos;
        System.out.println("El promedio de las edades ingresado es: "+promedio);
    }
    
}
