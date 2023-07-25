package com.takeo.assignment4;

import java.util.Scanner;

public class powerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Base Number: ");
        int powerNumber = scanner.nextInt();

        System.out.println(" Enter the Exponent: ");
        int exponent = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < exponent; i++ ) {
            result = result + powerNumber;
        }

        System.out.println(powerNumber + " ^ " + exponent + " = " + result);
        scanner.close();
    }
}
