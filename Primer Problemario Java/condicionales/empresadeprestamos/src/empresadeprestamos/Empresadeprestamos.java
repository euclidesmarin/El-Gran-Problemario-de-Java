/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadeprestamos;

import java.util.Scanner;

/**
 *
 * @author Euclides
 */
public class Empresadeprestamos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            double prestamo = 0,interes=0,credito=0,totalcredito;
           prestamo = sc.nextDouble();
            if (prestamo >= 5000){
                interes = prestamo * 0.10;
                credito = (prestamo + interes ) / 3;
                totalcredito = interes + prestamo;
                System.out.println("Debe cancelar un total de 3 cuotas por un monto de "+credito);
                System.out.println("El total del credito es de "+totalcredito);
            }else
                if (prestamo <=1000){
                    interes = prestamo * 0.12;
                    credito = (prestamo + interes ) / 1;
                    totalcredito = interes + prestamo;
                    System.out.println("Debe cancelar un total de 1 cuota por un monto de "+credito);
                    System.out.println("El total del credito es de "+totalcredito);
                }else
                    if(prestamo>2000 && prestamo<3000){
                        interes = prestamo * 0.12;
                        credito = (prestamo + interes) / 2;
                        totalcredito = interes + prestamo;
            System.out.println("Debe cancelar un total de 2 cuota por un monto de "+credito);
            System.out.println("El total del credito es de "+totalcredito);
        }
        }catch (Exception e){
            System.out.println("Ingreso un dato erroneo ");
        }
    }
    
}
