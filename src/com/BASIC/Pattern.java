package com.BASIC;

import java.util.Scanner;

public class Pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        for(int i=0;i<n;i++){
//            for (int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

//    Write a function to print the following pattern:
//            ****
//
//            ***
//
//            **
//
//            *

    public static void main(String[] args) {
        int n=4;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
