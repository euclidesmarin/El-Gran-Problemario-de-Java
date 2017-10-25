/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirnegpos;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Convertirnegpos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=0,cantidad=0,negativo = 0;
    System.out.println("Ingrese los numeros");
        
    do {
        num= sc.nextInt();
        if (num<0){
            negativo=num*-1;
            
        }
        cantidad++;
         System.out.println(" "+negativo); 
    }while (cantidad<15); {
      
        
    }
    
    }
    
}
