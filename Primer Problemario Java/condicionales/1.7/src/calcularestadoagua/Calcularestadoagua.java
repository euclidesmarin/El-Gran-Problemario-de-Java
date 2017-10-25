/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularestadoagua;

/**
 *
 * @author Euclides
 */
import java.util.Scanner;
public class Calcularestadoagua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la temperatura para saber el estado del agua");
        double temp=sc.nextDouble();        
        if (temp<=0){
            System.out.println("El agua se encuentra en estado solido");
        } else {
            if (temp<=100){
                System.out.println("El agua se encuentra en estado liquido");
            } else {
                System.out.println("El agua se encuentra en estado gaseoso");
            }
        }
    }
}
               
              
        
    
    

