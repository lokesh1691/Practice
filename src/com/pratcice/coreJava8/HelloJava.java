package com.pratcice.coreJava8;


import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HelloJava {

    public static void main(String[] args) {

      System.out.println("Hello World");


        Instant instant = Instant.now();
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(instant));

// works with ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt.format(DateTimeFormatter.ISO_INSTANT));


      String opt = " true";

      switch (opt) {
        case "true":

          System.out.print("True");
// break;
// default:
          System.out.print("***");

      }
      System.out.println("Done");



    }
}
