package com.employees.api.Models;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers:");

        // Input two numbers
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Check for division by zero
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN;

        // Display results
        System.out.println("Results:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (!Double.isNaN(quotient)) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Close the scanner
        scanner.close();

    }
}


