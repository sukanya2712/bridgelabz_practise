package com.java;

public class variables {

    int a=10; //instance variable

    static int b=20; //static variable

    void add(){
        a=20*2;
        System.out.println(a);
        System.out.println("add instance method ");  //instance method
    }

    void add2(){
        System.out.println("add2 instance");
        System.out.println(a);
    }

    static void minus(){
        System.out.println("static method ");    //static method
    }

    void multipply(){
        int c=5; //local variables
        int b=3;
        System.out.println(c*b);
    }
    public static void main(String[] args) {
       variables ab=new variables(); // calling instance variable
       System.out.println(ab.a);
       ab.add();

       variables ef = new variables();
       ef.add2();

//       ab.add();
//       ab.multipply();
//
//        System.out.println(b); //calling static variable
//
//        System.out.println(variables.b); // calling static variables using classname.variable name
//
//        variables cd = new variables();  // calling static variable by using reference variable
//        System.out.println(variables.b);
//
//        minus();              //calling static method directly
//        variables.minus();    //calling static method using classname
    }
}
