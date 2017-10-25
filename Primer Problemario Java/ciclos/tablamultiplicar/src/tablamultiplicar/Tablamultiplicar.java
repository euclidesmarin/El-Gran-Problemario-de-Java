/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

/**
 *
 * @author emarin
 */
import java.util.Scanner;
public class Tablamultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int producto, multiplicando;
        System.out.println("Cual tabla de multiplicar quieres hacer ? ");
        multiplicando = sc.nextInt();
        for (int multiplicador=0;multiplicador<=10;multiplicador++){
            producto = multiplicando * multiplicador;
            //System.out.println("La tabla del "+multiplicando);
            System.out.println(multiplicando+"*" +multiplicador+"="+producto);        
        }
        System.out.println("La tabla del "+multiplicando);
    }
    
}
