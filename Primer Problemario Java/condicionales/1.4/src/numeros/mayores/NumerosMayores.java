/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.mayores;

/**
 *
 * @author Euclides
 */
import java.util.Scanner;
public class NumerosMayores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num=sc.nextInt();
        int num2=sc.nextInt();
        if(num>num2){
            System.out.println(num+" Es el numero mayor");
        }else{
            System.out.println(num2+" Es el numero mayor");
        }
    }
    
}
