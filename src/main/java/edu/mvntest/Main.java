package edu.mvntest;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class Main{


   public static void main(String[] args){
     System.out.println("Hello World!!!");

     DateTime localTime = new DateTime();
     System.out.println("Current time : " + localTime.toLocalTime() + " TimeZone: " + localTime.getZone());

     DateTime usTime = localTime.toDateTime(DateTimeZone.forID("America/New_York"));
     System.out.println("American time : " + usTime.toLocalTime() + " TimeZone: " + usTime.getZone());
   }
}
