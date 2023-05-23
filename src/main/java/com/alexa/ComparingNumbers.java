package com.alexa;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1= sc.nextInt();
        System.out.println("Enter another number:");
        int num2= sc.nextInt();
        if(num1>num2){
            System.out.println("The greatest of two numbers is :"+num1);
        }else{
            System.out.println("The greatest of two numbers is :"+num2);
        }
    }
}
