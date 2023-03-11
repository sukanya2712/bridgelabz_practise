package com.bridgelabz;

import java.util.Scanner;

public class Circle {
    double radius;
    public void areaofCircle(double radius){
        double area = 3.14*radius*radius;
        System.out.println("Area of circle will be : " + area);
    }

    public static void circumferenceofCircle(){
        Circle obj1 = new Circle();
        //double radiusforcircum = obj1.radius;
        double circumference = 2*3.14*obj1.radius;
        System.out.println("Circumference of circle will be  : " + circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();

        System.out.println("Enter radius of circle : ");
        obj.radius=sc.nextDouble();
        obj.areaofCircle(obj.radius);
        circumferenceofCircle();
    }
}
