/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestrario;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author emarin
 */
public class Muestrario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        Scanner sc=new Scanner(System.in);
        int edad=0,n = 0,j = 0,a = 0,v = 0;
        double promn, promj, proma, promv, niños = 0, jovenes = 0, adultos = 0, viejos = 0, peso ;
        
        
        for (int i=1;i<10;i++)
           {
            System.out.println("Ingrese las edades");
            edad = sc.nextInt(); 
            System.out.println("Ingrese peso");
            peso = sc.nextDouble();
            
            if (edad>=0&&edad<=13){
                System.out.println("NIÑO");
                niños = niños + peso ;
                n++;
                
            }else 
                if (edad>=14&&edad<=29) {
                      System.out.println("JOVEN");    
                      jovenes = jovenes + peso ;
                      j++;
                      
                }else
                    if(edad>=30&&edad<=59)
                    {
                         System.out.println("ADULTO");  
                         adultos = adultos + peso ;
                         a++;
                         
                    }else
                        if (edad>=60){
                            System.out.println("VIEJO");
                            viejos = viejos + peso;
                            v++;
                            
                        }
                                    
        }
        promn =niños/n;
        promj = jovenes/n;
        proma = adultos/n;
        promv = viejos/n;
        
        System.out.println("La cantidad de niños es: "+n);
        System.out.println("La cantidad de jovenes es: "+j);
        System.out.println("La cantidad de adultos es: "+a);
        System.out.println("La cantidad de viejos es : "+v);
        
        System.out.println("El promedio de peso de ninos es "+promn);
        System.out.println("El promedio de peso de ninos es "+promj);
        System.out.println("El promedio de peso de ninos es "+proma);
        System.out.println("El promedio de peso de ninos es "+promv);
        }catch (InputMismatchException e){
            System.out.println("Ingreso un dato invalido");
        }
    
}
}