package com.polymorphismm;

public class methodoverloading {
//    REGULAR
//    void m1(){
//        System.out.println("im m1");
//    }
//
//    void m1(int a){
//        System.out.println("im also m1");
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.m1();
//        t.m1(3);
//    }

//    AUTOMATIC PROMOTION
//    void m1(int a){
//        System.out.println("im m1");
//    }
//
//    void m1(float f){
//        System.out.println("im float m1");
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.m1('c');
//        t.m1(9.5f);
//    }
//
//    OBJECT-CHILD RELATIONSHIP
//    static void m1(Object a){
//        System.out.println("im obj m1");
//    }
//
//    static void m1(String a){
//        System.out.println("im string m1");
//    }
//
//    public static void main(String[] args) {
//        m1(new Object());
//        m1("arun");
//        m1(null);
//    }


    void m1(int i){
        System.out.println("stringbuffer bb");
    }
    void m1(String...i){
        System.out.println("cvararg");
    }

    public static void main(String[] args) {
        methodoverloading r=new methodoverloading();
        r.m1();
        r.m1(10);

    }

}
