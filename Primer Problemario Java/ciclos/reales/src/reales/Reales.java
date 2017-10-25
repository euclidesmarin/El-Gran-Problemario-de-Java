/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reales;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Reales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cantidad=0, num=0,suma = 0,promedio=0;
        System.out.println("Cuantos numeros desea sumar y promediar ?");
        cantidad = sc.nextInt();
        for (int i=0;i<cantidad;i++){
            System.out.println("Ingrese los numeros");
            num= sc.nextInt();
            suma = num + suma;
            promedio= suma/cantidad;
            
        }
        System.out.println("El valor de la suma es "+suma);
        System.out.println("El promedio es "+promedio);
    }
    
}
