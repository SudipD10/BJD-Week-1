package com.takeo.assignment3;

import java.util.Scanner;

public class fizzBuzzGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Number ");
        int limit = scanner.nextInt();

        for(int i = 1; i <= limit; i++){
            if(i % 15 == 0 ) {
                System.out.println(" fizzBuzz ");
            } else if( i % 3 == 0 ) {
                System.out.println(" Fizz ");
            } else if( i % 5 == 0 ) {
                System.out.println(" Buzz ");
            } else{
                System.out.println( i );
                scanner.close();
            }
        }

    }
}
