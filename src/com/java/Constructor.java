package com.java;

public class Constructor {

     //constructor declared by user
//        Test.java()
//        { System.out.println("0-arg constructor");
//        }
//        Test.java(int i)
//        { System.out.println("1-arg constructor");
//        }
//        Test.java(int a,int b)
//        { System.out.println("2-arg constructor");
//        }
//        public static void main(String[] args)
//        {  Test.java t1=new Test.java();
//            Test.java t2=new Test.java(10);
//            Test.java t3=new Test.java(100,200);
//        }


    //default constructor with instance variables
//    String a;
//    String b;
//
//
//    Test.java(String a,String b){
//       this.a=a;
//       this.b=b;
//    }
//    void display(){
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    public static void main(String[] args) {
//        Test.java t = new Test.java("abc","def");
//        t.display();
//        Test.java t1 = new Test.java("ghi","ijk");
//        t1.display();
//    }

    //constructor chaining
    Constructor(){
        this(10);
        System.out.println("0-arg");
    }

    Constructor(int a){
        this(20,30);
        System.out.println("1-arg");
    }

    Constructor(int a , int b){
        System.out.println("2-arg");
    }

    public static void main(String[] args) {
        Constructor t = new Constructor();
    }
}
