package com.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Pract {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Y");
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("G");
        arrayList.add("H");
        arrayList.add("I");
        arrayList.add("U");

        Scanner scan = new Scanner (System.in);

        ArrayList<String> names = new ArrayList();
       TreeSet<String> se = new TreeSet<String>();


       se.addAll(arrayList);

        System.out.println(se);
       names.addAll(se);

       for(int i=names.size()-1; i >=0;  i--)
       {
           System.out.println(names.get(i).toString());
       }
    }

}