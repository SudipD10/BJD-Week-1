package com.takeo.day2;

public class Calculator {
//implementation of calculation logic
    public static void main(String[] args){

      //addition of two numbers

        int a = 5;
        int b = 7;
        int total = a + b;
        System.out.println(" sum of " + a + " and " + b + " = " + total);

        //substraction of two numbers
         int subtract = a - b;
         System.out.println(" subtract of " + a + " and " + b + " = " + subtract);

         //multiplication of two numbers
        int multiplication = a * b;
        System.out.println(" multiplication of " + a + " and " + b +" = " + multiplication);

        //divide of two numbers
        int divide = a / b;
        System.out.println(" divide of " + a + " and " + b + " = " + divide);
    }
}