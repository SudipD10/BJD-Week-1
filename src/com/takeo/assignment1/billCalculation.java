package com.takeo.assignment1;

public class billCalculation {
    public static void main(String[] args) {

        double amount = 30;
        double tax = 15;
        double tip = 10;

        double totalAmount = amount + tax + tip;

        System.out.println(" amount = $ " + amount);
        System.out.println(" tax = $ " + tax);
        System.out.println(" tip = $ " + tip);

        System.out.println(" The total Amount is $ " + totalAmount + " . ");


    }
}
