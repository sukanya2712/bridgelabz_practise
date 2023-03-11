package com.bridgelabz;

/* Write a Java program to create a class called "BankAccount"
with instance variables "balance" and "accountNumber."
 Include a method to deposit money into the account and a method
 to withdraw money from the account.
 */

import java.util.Scanner;

public class BankAccount {

     public int balance;
     public int accountNumber;
     public int bal1,bal2;

    public void moneyDeposit(int currbal){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int depositamount=sc.nextInt();
        currbal=currbal+depositamount;
        System.out.println("Your current balance is "+ currbal);
    }

    public  void moneyWithdraw(int curr){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int withdrawn=sc.nextInt();
        curr=curr-withdrawn;
        System.out.println("Your current balance is "+ curr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number of Account : ");
        BankAccount obj1 = new BankAccount();
        BankAccount obj2 = new BankAccount();
        int ACCNO = sc.nextInt();
        switch (ACCNO)
        {
            case 1: {
                System.out.println("Enter acc balance: ");
                obj1.bal1= sc.nextInt();
                System.out.println("Press 1.withdraw 2.Deposit");
                int choice = sc.nextInt();
                    switch (choice){
                    case 1:{
                         obj1.moneyWithdraw(obj1.bal1);
                         break;
                    }
                    case 2:{
                        obj1.moneyDeposit(obj1.bal1);
                        break;
                    }
                    }
                break;
            }
            case 2:
            {
                System.out.println("Enter acc balance:");
                obj2.bal2= sc.nextInt();
                System.out.println("Press 1.withdraw 2.Deposit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:{
                        obj2.moneyWithdraw(obj2.bal2);
                        break;
                    }
                    case 2:{
                        obj2.moneyDeposit(obj2.bal2);
                        break;
                    }
                }
                break;
            }
        }

    }
}
