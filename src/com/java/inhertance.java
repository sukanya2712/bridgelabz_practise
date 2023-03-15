package com.java;

//class inherit{
//    int x=2;
//    void add(){
//        System.out.println(3*4);
//    }
//}
//
//class inherit2 extends inherit{
//    int y=2;
//    void minus(){
//        System.out.println("2 class");
//    }
//}
//
//public class inhertance extends inherit2 {
//
//    public static void main(String[] args) {
//        inherit ab = new inherit();
//        ab.add();
//
//        inherit2 cd = new inherit2();
//        cd.minus();
//        cd.add();
//
//        inherit obj1 = new inherit2();// Parent reference can hold child object
//        // With the parent reference , we can access only parent class properties
//        System.out.println(obj1.x);
//
//        inherit2 obj2 = new inherit(); // child reference cannot be passed to parent
//
//    }
//}

//hierachical inheritance
class inherit{
    int x=2;
    void add(){
        System.out.println(3*4);
    }
}

class inherit2 extends inherit{
    int y=2;
    void minus(){
        System.out.println("2 class");
    }
}

public class inhertance extends inherit {

    public static void main(String[] args) {

        inhertance gh = new inhertance();
        gh.add();


        inherit ab = new inherit();
        ab.add();

        inherit2 cd = new inherit2();
        cd.minus();
        cd.add();

        inherit obj1 = new inhertance();// Parent reference can hold child object
        // With the parent reference , we can access only parent class properties
        System.out.println(obj1.x);

        inherit obj2 = new inherit2();
       // System.out.println(obj2.y); // With the parent reference , we can access only parent class properties
        System.out.println(obj2.x);

        //inherit2 obj3 = new inherit();// child reference cannot be passed to parent

    }
}
