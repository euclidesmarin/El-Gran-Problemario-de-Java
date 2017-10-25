/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleria;

import java.util.Scanner;

/**
 *
 * @author Euclides
 */
public class Papeleria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try {
        Scanner sc=new Scanner(System.in);
        double pvp = 0, precio_coste = 0, ganancia = 0;
        System.out.println("Ingrese el precio del producto");
        precio_coste = sc.nextDouble();
        if (precio_coste<3){
            ganancia=0.15;
            pvp = (precio_coste*ganancia)+precio_coste;
            System.out.println("El precio de venta es de "+pvp);
        }else 
            if (precio_coste>=3&&precio_coste<=6){
                ganancia = 0.50;
                pvp = precio_coste + ganancia;
                System.out.println("El precio de venta es "+pvp);
            }else
            if (precio_coste >6){
                ganancia = 0.25;
                pvp = (precio_coste * ganancia) + precio_coste;
                System.out.println("El precio de venta es "+pvp);
            }
                
    }catch (Exception e){
        System.out.println("Ingreso un valor incorrecto "+e.getMessage());
    }
    
}
}
