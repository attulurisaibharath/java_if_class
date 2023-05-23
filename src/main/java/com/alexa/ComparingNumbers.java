package com.alexa;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1= sc.nextInt();
        System.out.println("Enter another number:");
        int num2= sc.nextInt();
        System.out.println("Enter a third number:");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The greatest of three numbers is :"+num1);
        }else if(num2>num3){
            System.out.println("The greatest of three numbers is :"+num2);
            
        }else if(num1 == num2 || num2 == num3){
            System.out.println("Two of the given numbers are equal");
            
        else{
            System.out.println("The greatest of three numbers is:"+num3);
        }
    }
}
