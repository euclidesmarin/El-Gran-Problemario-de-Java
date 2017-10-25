/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimirsolopositivos;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Imprimirsolopositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double num = 0;
        
        for(int i=0;i<=10;i++){
            System.out.println("Ingrese 10 numeros");
            num = sc.nextDouble();
            if (num >= 0){
                System.out.println(num);
            }else{
                System.out.println("No se admiten numeros negativos");
            }
        }
    }
    
}

