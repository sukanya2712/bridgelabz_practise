package com.polymorphismm;

//public class Parent {
//   void m1(){System.out.println("parent m1()");}
//};
//    class Child extends Parent
//    {  void m1(){System.out.println("child m1()");}
//        public static void main(String[] args)
//        {
//            Parent p = new Child();
//            p.m1(); //output : parent m1()
//            System.out.println(p.toString());
//        }
//
//        public String toString()
//        { return getClass().getName() + '@' + Integer.toHexString(hashCode(6d03e736));
//        }
//    };

//class Animal{ }
//class Dog extends Animal{ }
//class Parent{
//    Animal m1(){
//    System.out.println("parent m1");
//    return new Animal();
//    }
//}
//class Child extends Parent
//{
//    @Override
//    Animal m1() {
//        return super.m1();
//    }
//
//    public static void main(String[] args)
//    { Parent p = new Parent();
//        Animal a = p.m1();
//        Child c = new Child();
//        Dog d = c.m1();
//    }

class parent{
    void m1(){
        System.out.println("parent m1");
    }

}
class child extends parent {
    @Override
    void m1() {

    }

    void m2(){
        System.out.println("child m2");
    }
    public static void main(String[] args) {
        parent p2 = new child();
        p2.m1();//child m1
       // p2.m2();
        child cd=(child)p2;//typecasting
        cd.m1();
        cd.m2();
        child de=new child();
        de.m2();
        de.m1();
    }
};


