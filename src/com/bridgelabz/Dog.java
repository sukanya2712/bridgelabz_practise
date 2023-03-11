package com.bridgelabz;

import java.util.Scanner;

public class Dog {
    String breed;
    int age;
    float weight;

    public int calDogAge(int age){
        int calage = age*5;
        return calage;
    }

    public void dogAgeBreedWeight(){
        System.out.println("Dogs breed is : " + breed);
        System.out.println("Dogs weight is : " + weight);
        int ageofDog = calDogAge(age);
        System.out.println("Age of Dog in human years is : " + ageofDog);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Dog obj = new Dog();
        System.out.println("Enter Breed");
        obj.breed=sc.next();
        System.out.println("Enter Age: ");
        obj.age=sc.nextInt();
        System.out.println("Enter Weight:- ");
        obj.weight=sc.nextFloat();
        obj.dogAgeBreedWeight();
    }
}
