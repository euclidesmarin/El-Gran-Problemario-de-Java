/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechactual;

/**
 *
 * @author emarin
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Fechactual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Fecha actual en formato completo:
    Date fechaActual = new Date ();
    
    //Formateando la fecha:
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat ("dd/MMM/yyyy");
    System.out.println("Son las :"+formatoHora.format(fechaActual)+" del: "+formatoFecha.format(fechaActual));
    
    //Fecha actual desglosada.
    Calendar fecha = Calendar.getInstance();
    
    int ano = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH)+1;
    int dia = fecha.get(Calendar.DAY_OF_MONTH)+1;
    
    System.out.println("Fecha de manana :" +dia+ "/" + (mes)+ "/" + ano);
    }
    
}
