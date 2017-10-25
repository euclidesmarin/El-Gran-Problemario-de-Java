/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;

/**
 *
 * @author Euclides
 */
import java.util.Scanner;

public class Sumaenteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        suma sumanum = new suma();
        System.out.println("Introduce el primer numero");
        sumanum.setNum1(sc.nextDouble());
        
        System.out.println("Introduce el segundo numero");
        sumanum.setNum2(sc.nextDouble());
        
        sumanum.sumanumero();
    }
    
}

