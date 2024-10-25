package com.dsa.recursion.q2;

import java.util.Scanner;

public class FindRemainder {
    static int findRemainder(int a , int b){
        if(a>b) return b;
        return findRemainder(a,b-a);
    }
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Divisor and Dividend");
            int divisor, dividend;
            if ((divisor = (sc.nextInt())) < 0 || (dividend = (sc.nextInt())) < 0)
                throw new IllegalArgumentException("Divisor and/or Dividend can't be negative");
            else System.out.println(findRemainder(divisor, dividend));
        }catch(IllegalArgumentException e){
            System.out.println("The exception message : " + e.getMessage());
        }
    }
}
