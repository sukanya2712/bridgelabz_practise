package com.bridgelabz;


import java.util.Scanner;

/*Write a Java program to create a class called "Employee" with instance variables "name," "salary," and "ID."
Include a method to calculate the employee's yearly salary and a method to print the employee's name and salary.
 */
public class Employee {
    String name;
    int salary;
    int ID;

    public int calSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee monthly salary");
        int x = sc.nextInt();
        salary = x*12;
        return salary;
    }

    public void employeeNameandSalary(String name,int ID){
        int salaryvalue = calSalary();
        System.out.println("Name of Employee is : " + name);
        System.out.println("ID of Employee is : " + ID);
        System.out.println("Employee's yearly salary is : " + salaryvalue );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();

        System.out.println("Enter name of Employee : ");
        obj.name = sc.next();
        System.out.println("Enter ID of Employee : ");
        obj.ID = sc.nextInt();

        obj.employeeNameandSalary(obj.name, obj.ID);
    }
}
