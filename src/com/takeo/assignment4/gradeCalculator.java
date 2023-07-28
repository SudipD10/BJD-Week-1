package com.takeo.assignment4;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println(" Enter The Average Marks Scored: ");
       int marksScored = scanner.nextInt();
       if ( marksScored > 100 || marksScored < 0 ){
           System.out.println(" Invalid Score ");
       }
       else if ( marksScored >= 90 ){
           System.out.println(" Grade : A ");
       }
       else if ( marksScored >= 80 ){
           System.out.println(" Grade : B ");
       }
       else if ( marksScored >= 70 ){
           System.out.println(" Grade : C ");
       }
       else if ( marksScored >= 60 ){
           System.out.println(" Grade : D ");
       }
       else {
           System.out.println(" Grade : F ");
       }
       scanner.close();
    }
}
