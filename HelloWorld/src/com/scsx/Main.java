package com.scsx;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // PRIMITIVES
        byte smallAge = 30;
        int viewsCount = 5515159;
        long emailsSent = 55151565165159L; // L so that it's not interpreted as int
        float price = 10.99F; // F so that it's not interpreted as double
        char letter = 'A';
        boolean isAlive = true;

        // REFERENCE
        // Date
        Date now = new Date(); // new allocates memory; it's not needed in primitives
	    System.out.println(now.getTime());

	    // String
	    String message = new String("Hello World!");
	    String message2 = "Hello World!"; // this is the same, as shorthand, looks like primitive but is ref
        message.endsWith("World!"); // true

        System.out.println(message.toLowerCase());
        System.out.println(message);

        // Arrays
        int[] numbers = new int[5]; // length = 3
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 4;

        System.out.println(numbers); // [I@378bf509  -> Address of this object in memory
        System.out.println(Arrays.toString(numbers)); // [1, 2, 4, 0, 0]  -> Because is int[] non-declared values are 0

        int[] numbers2 = {1, 2, 4, 8, 16}; // shorthand
        int numberOfItems = numbers2.length; // 5

        // Multi Arrays
        int[][] gameBoard = new int[2][3];
        gameBoard[0][0] = 1; // assign value
        System.out.println(Arrays.deepToString(gameBoard)); // [[1, 0, 0], [0, 0, 0]]  -> in multi arrays deepToString is needed to show values

        int[][] gameBoard2 = { {1, 2, 4}, {1, 1, 0} }; // shorthand

        // CONSTANTS
        final float pi = 3.1416F;

        // Arithmetic Expressions
        // the usual except.
        int division = 10 / 3; // = 3, for decimals we must convert:
        double division2 = (double)10 / (double)3; // 3.3333333

        // INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }
}
