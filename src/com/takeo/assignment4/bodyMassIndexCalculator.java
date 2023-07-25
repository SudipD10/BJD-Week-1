package com.takeo.assignment4;

import java.util.Scanner;
public class bodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your Weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println(" Enter your Height (meter): ");
        double height = scanner.nextDouble();

        double result = weight / ( height * height);

        System.out.println(" Your Body Mass Index: " + weight );
        scanner.close();


    }
}
