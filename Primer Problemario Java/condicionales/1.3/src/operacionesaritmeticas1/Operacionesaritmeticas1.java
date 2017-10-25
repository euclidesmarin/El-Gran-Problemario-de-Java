/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaritmeticas1;

/**
 *
 * @author Euclides
 */
import java.util.Scanner;
public class Operacionesaritmeticas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num=sc.nextInt();
        if (num>0){
            Scanner sc2=new Scanner(System.in);
        System.out.println("Ingresa un segundo numero");
        int num2 = sc2.nextInt();
        int sum,resta,div;
        sum=num + num2;
        resta=num - num2;
        div=num/num2;
        System.out.println("La suma es "+sum);
        System.out.println ("La resta es "+resta);
        System.out.println("La division es "+div);
        }else{
            System.out.println("Solo se aceptan numeros positivos");
        }
    }
    
}
