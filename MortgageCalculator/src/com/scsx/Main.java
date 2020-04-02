package com.scsx;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    // Principal: 100000
    // Annual interest rate: 3.92
    // Period (Years): 30
    // Mortgage: result expected

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.println("Calculate your Mortgage");

        //get principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        //get monthly interest
        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;

        //get number of payments
        System.out.print("Period (Years): ");
        short years = scanner.nextShort();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //  P( r(1 + r)^n  /  ((1 + r)^n) - 1) )

        double mortgage = principal
                * (monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                / ((Math.pow((1 + monthlyInterest), numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
