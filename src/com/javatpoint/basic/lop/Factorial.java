package com.javatpoint.basic.lop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1; // Initialize factorial result
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply i to the current result
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
