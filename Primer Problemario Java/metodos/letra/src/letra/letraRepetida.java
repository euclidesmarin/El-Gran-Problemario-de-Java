/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letra;

/**
 *
 * @author Euclides
 */
public class letraRepetida {
    private int num1;
    private char letra;
    
    public letraRepetida ()
    {
        this.num1=0;
        this.letra = '\0';//es es el vacio en char
    }
    public int getNum1()
    {
        return this.num1;
    }
    public void setNum1(int num1)
    {
        this.num1=num1;
    }
    public char getLetra ()
    {
        return this.letra;
    }
    public void setLetra (char letra)
    {
        this.letra=letra;
    }
    public void repetirletra ()
    {
        for (int i=1;i<num1;i++)
        {
            System.out.println(letra);
        }
    }

    
}
