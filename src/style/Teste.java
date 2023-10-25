/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package style;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Teste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
       d.setDate((c.get(Calendar.DAY_OF_MONTH+4)));
      //  d.setMonth(c.get(Calendar.MONTH));
       // d.setYear(c.get(Calendar.YEAR));
        
        System.out.println(d.getDate());
        
    }
}
