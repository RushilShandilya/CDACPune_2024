package com.dsa.recursion.q1;

import java.util.Scanner;

public class FindQuotient {
    static int quotient(int a, int b){
        if(a>b) return 0;
        return quotient(a,b-a)+1;
    }
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Divisor and Dividend");
            int divisor, dividend;
            if ((divisor = (sc.nextInt())) < 0 || (dividend = (sc.nextInt())) < 0)
                throw new IllegalArgumentException("Divisor and/or Dividend can't be negative");
            else System.out.println(quotient(divisor, dividend));
        }catch(IllegalArgumentException e){
            System.out.println("The exception message : " + e.getMessage());
        }
    }
}
