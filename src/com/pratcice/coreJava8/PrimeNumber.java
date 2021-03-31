package com.pratcice.coreJava8;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean flag =isPrimeNumber(num);
        if(!flag){
            System.out.println("Number given is not prime number");
        } else {
            System.out.println("Number given is prime number"+num);
        }

    }

    private static boolean isPrimeNumber(int num) {
      boolean flag = true;
        if(num==0 || num==1){
          flag=false;
        }
        for(int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
               flag=false;
                break;
            }
        }
    return flag;
    }
}
