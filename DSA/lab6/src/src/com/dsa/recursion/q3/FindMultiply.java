package com.dsa.recursion.q3;

import java.util.Scanner;

public class FindMultiply {
    public static int multiply(int a, int b){
        if(b==0) return 0;
        if(a==1) return 1;
        return a + multiply(a,--b);
    }
    public static void main(String[] args){
        try{
            Scanner sc  = new Scanner(System.in);
            int b;
            if((b=(sc.nextInt()))<0) throw new IllegalArgumentException("b can't be less than 0");
            else System.out.println(multiply(sc.nextInt(),b));
        }catch(IllegalArgumentException  e){
            System.out.println("The error message : " + e.getMessage());
        }
    }
}
