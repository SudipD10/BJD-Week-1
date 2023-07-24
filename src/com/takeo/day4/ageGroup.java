package com.takeo.day4;

import java.util.Scanner;

public class ageGroup {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Your Age ");
        int age = scanner.nextInt();

        if (age <=0 ){
            System.out.println(" Enter the valid Age. ");
        }
        else if (age > 1 && age<=13 ){
            System.out.println(" You are a Child. ");
        }
        else if  (age > 13 && age <= 30 ){
            System.out.println(" You are an Adult. ");
        }
        else if (age > 30 && age <= 50 ){
            System.out.println(" You are Middle Aged. ");
        }
        else if (age >50 && age <=100 ){
            System.out.println(" You are Old. ");
        }
        else if (age > 100 ){
            System.out.println(" Enter the Valid Age. ");
        }

        scanner.close();
    }
}
