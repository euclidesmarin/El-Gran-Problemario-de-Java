/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

import java.util.Scanner;

/**
 *
 * @author Euclides
 */
public class clasentrada 
{
    Scanner sc=new Scanner(System.in);
    private int Valor;
    private double Real;
    private String Cadena;
    private char Caracter;
        
    public clasentrada (int Valor, double Real, String Cadena, char Caracter) 
    {
    this.Valor=0;
    this.Cadena="";
    this.Real=0;
    this.Caracter='c';
    }

      
    public int getValor ()
    {
    Valor = sc.nextInt();
    return Valor;   
    }
    
    public int setValor ()
    {
        Valor = sc.nextInt();
        return Valor;
    }
    
    public double getReal ()
    {
    Real = sc.nextDouble();
    return Real;
    }
    
    public double setReal ()
    {
    Real = sc.nextDouble();
    return Real;
    }
    
    public String getCadena ()
    {
    Cadena = sc.next();
    return Cadena;
    }
    public String setCadena ()
    {
    Cadena = sc.next();
    return Cadena;
    }
    public char getCaracter ()
    {
    Caracter = sc.next().charAt(Caracter);
    return Caracter;
    }
    public char setCaracter ()
    {
    Caracter = sc.next().charAt(Caracter);
    return Caracter;
}
}
