/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivosnegativosneutros;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Positivosnegativosneutros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positivo=0, negativo=0, cero=0, num;
        for (int i=1;i<=3;i++){
            System.out.println("Introduzca los numeros");
            num = sc.nextInt();
            if (num>0){
                positivo++;
            }else if(num<0){
            negativo++;
        }else
                cero++;
        }
        System.out.println("La cantidad de numero positivos "+positivo);
        System.out.println("La cantidad de numero positivos "+negativo);
        System.out.println("La cantidad de numero positivos "+cero);
    }
    
}
