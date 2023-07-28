package com.takeo.week2day1;

import java.util.Scanner;

public class scannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter length of thr array: ");
        int lengthOfArray = scanner.nextInt();

        int[] numArray = new int[lengthOfArray];

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(" Enter value of Elements [" + i + "]");
            int a = scanner.nextInt();
            numArray[i] = a;

        }

         int result = 0;

        for (int i = 0; i < numArray.length; i++){
            result = numArray[i];

        }

        System.out.println(" Sum of all numbers you entered is " + result);
        scanner.close();
    }
}
