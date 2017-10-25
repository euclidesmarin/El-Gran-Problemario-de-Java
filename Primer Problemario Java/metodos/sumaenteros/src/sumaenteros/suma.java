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
public class suma {
    private double num1;
    private double num2;
public suma (){
    
}
public double getNum1(){
    return this.num1;
}
public void setNum1(double num1){
    this.num1=num1;
}
public double getNum2 (){
    return this.num2;
}
public void setNum2 (double num2){
    this.num2=num2;
}
    public void sumanumero (){
    System.out.println("La suma del primer numero: "+getNum1()+" y del segundo numero: "+getNum2()+" es: "+(getNum1()+getNum2()));
    System.out.println("La division del primer numero: "+getNum1()+" y del segundo numero: "+getNum2()+" es: "+(getNum1()/getNum2()));
    }
}

