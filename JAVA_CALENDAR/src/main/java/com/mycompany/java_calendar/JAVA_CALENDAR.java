/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java_calendar;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;

public class JAVA_CALENDAR {

    public static void main(String[] args) throws ParseException {
        
      /*  SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date =simpleDateFormat.parse("2022-5-17");
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);
        
        System.out.println(calendar.getTime());
*/
      Calendar calendar = new Calendar.Builder()
              .setDate(2023, 11, 6)
              .setTimeOfDay(3, 45, 30)
              .build();                ///builder pattern///
      System.out.println(calendar.getTime());
      
      
    }
}
