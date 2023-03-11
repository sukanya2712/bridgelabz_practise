package com.bridgelabz;

/*Write a Java program to create a class called "Student" with instance variables "name," "age," and "ID."
Include a method to print the name and age of the student*/

public class student {
    //INSTANCE VARIABLE
    String name = "JIYA";
    int age = 20;
    String id = "3456@abc";

    //calling instance variable into instance method
    public void nameofStudent(){
        System.out.println(name);
    }

    //calling instance variable into static method
    public static void ageofStudent(){
        student obj1 = new student();
        System.out.println(obj1.age);
    }

    //main method
    public static void main(String[] args) {
          student obj = new student();//creating obj to call instance method
          obj.nameofStudent();//calling instance method
          ageofStudent();//calling static method
          System.out.println(obj.id);//directly accessing instance variable
    }
}
