package com.takeo.assignment2;

import java.util.Scanner;

public class ifElseCalculator {

    public static void main(String[] args) {

        int x, y, z, ch;
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter First Number ");
        x = input.nextInt();

        System.out.println(" Enter Second Number ");
        y = input.nextInt();

        System.out.println(" Choices Are ");
        System.out.println(" 1. Addition ");
        System.out.println(" 2. Subtraction ");
        System.out.println(" 3. Multiply ");
        System.out.println(" 4. Divide ");
        System.out.println(" Enter Your Choice ");
        ch = input.nextInt();
        switch (ch) {
            case 1 -> {
                z = x + y;
                System.out.println(" Addition = " + z);
            }
            case 2 -> {
                z = x - y;
                System.out.println(" Subtraction = " + z);
            }
            case 3 -> {
                z = x * y;
                System.out.println(" Multiply = " + z);
            }
            case 4 -> {
                z = x / y;
                System.out.println(" Divide = " + z);
            }
            default -> System.out.println(" Wrong Choice Entered ");

        }
    }
}