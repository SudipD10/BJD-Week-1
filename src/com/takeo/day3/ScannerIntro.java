package com.takeo.day3;


import java.util.Scanner;

public class ScannerIntro {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         System.out.print(" Enter your name: ");
         String name = scanner.nextLine();

         System.out.print(" Enter your age: ");
         int age = scanner.nextInt();

         System.out.print(" Enter your favourite number: " );
         double favouriteNumber = scanner.nextDouble();

         System.out.println(" Hello, " + name + " ! ");
         System.out.println(" You are " + age + " years old. ");
         System.out.println(" Your favourite number is " + favouriteNumber +" . ");



     }
}
