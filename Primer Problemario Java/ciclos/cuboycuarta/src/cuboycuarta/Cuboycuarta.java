/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboycuarta;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Cuboycuarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double numeros=0, cubo=0, cuarta=0;
     
        for (int i=1;i<=10;i++){
        numeros = sc.nextDouble();
        cubo = Math.pow(numeros, 3);
        
        cuarta = Math.pow(numeros,4);
        System.out.println("El cubo de "+numeros+ "es : "+cubo);
        System.out.println("La cuarta de "+numeros+ "es :"+cuarta);
    }
       
        
    
}
}
