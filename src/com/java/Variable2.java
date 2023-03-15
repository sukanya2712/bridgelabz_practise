package com.java;



class variable3{
        int a=4;
        int b=5;

        static int c=6;
        static int d=8;

        void add(){
            System.out.println(a+b);
            System.out.println(a);
            System.out.println(variable3.c);
            System.out.println(c);
            System.out.println(d);
        }

        static void minus(){
            variable3 asf = new variable3();
            System.out.println(asf.a- asf.b);
            System.out.println(c);
        }



}



public class Variable2 {
    public static void main(String[] args) {
             variable3 def = new variable3();
             def.add();

             variable3.minus();
             System.out.println(variable3.c);



             variables ef = new variables();    //within the package calling another class
             ef.add2();
    }
}
