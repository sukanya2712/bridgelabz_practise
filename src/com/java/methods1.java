package com.java;

public class methods1 {
//    int add(){
//        int a=10;
//        int b=20;
//        int c=a+b;
//        return c;
//    }
//
//    static void mul(){
//        int c=8;
//        int d=7;
//        System.out.println(c*d);
//    }
//    public static void main(String[] args) {
//            methods1 ab =new methods1();
//            System.out.println(ab.add());
//            methods1.mul();
//
//    }

// with parameters
//    void m1(int a,int b){
//        System.out.println(a*b);
//    }
//
//    static void m2(int c, int d){
//        System.out.println(c+d);
//    }
//
//    public static void main(String[] args) {
//        methods1 ab = new methods1();
//        ab.m1(3,4);
//        m2(5,10);
//    }
// this keyword with instance onlt we cant use it in static method
//      int a=100;
//     int b=200;
//     static int c=20;
//     static int d=40;
//
//     void add(int a, int b){
//         System.out.println(a-b);
//         System.out.println(this.a - this.b);
//     }
//
//     static void mul(int e,int f){
//         System.out.println(c*d);
//         System.out.println(methods1.c*methods1.d);
//     }
//
//    public static void main(String[] args) {
//        methods1 ab = new methods1();
//        ab.add(4,5);
//        methods1.mul(30,60);
//    }

    //conversion of local to instance to improve scope of variables
    //passing value of local to instance variables
//    int a=30;
//    int b=60;
//    void add(int c , int d){
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(this.a);
//        System.out.println(this.b);
//        this.a=c;
//        this.b=d;
    //    a=c;
    //    b=d
//
//    }
//    void mul(){
//        System.out.println(this.a);
//        System.out.println(this.b);
//    }
//
//    public static void main(String[] args) {
//        methods1 ab = new methods1();
//        ab.add(20,40);
//        ab.mul();
//    }


}
