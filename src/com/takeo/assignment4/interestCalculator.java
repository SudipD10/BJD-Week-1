package com.takeo.assignment4;

import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the Principal Amount ");
        double principal = scanner.nextDouble();

        System.out.println(" Enter the rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.println(" Enter the Time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = ( principal * time * rate ) / 100;

        System.out.println(" Simple Interest: " + simpleInterest);
        scanner.close();

    }
}
