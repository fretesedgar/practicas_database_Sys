/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.Calendar;
import java.util.GregorianCalendar;


class Tiempo {
    //asignando formato de fecha a la variable fecha
    Calendar fecha = new GregorianCalendar();
    
    String year = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    
    //unificando datos en una sola variable
    String fechacompleta = dia + "-" + mes + "-" + year;
    
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    
    //String segundo = Integer.toString(fecha.get(Calendar.SECOND)); --> No muestra segundo en tiempo real
    
    //unificando datos en una sola variable
    String horacompleta = hora + ":" + minuto;
}
