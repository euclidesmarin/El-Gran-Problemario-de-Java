/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numposneg;

/**
 *
 * @author Euclides
 */
import java.util.Scanner;
public class Numposneg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num=sc.nextInt();
        if (num>0){
            System.out.println(num+"El numero es positivo");
        }else{
            if (num<0){
                System.out.println(num+"El numero es negativo");
            }
        }
    }
    
}
