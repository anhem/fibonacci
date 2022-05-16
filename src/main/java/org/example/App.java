package org.example;

import java.util.Scanner;

public class App {
    /**
     *  the Fibonacci sequence, in which each number is the sum of the two preceding ones.
     *  //size of 10 should print: 0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        System.out.print("Enter a size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        new ForFibonacci().printFibonacci(size);
        new StreamFibonacci().printFibonacci(size);
        new RecursiveFibonacci().printFibonacci(size);

    }
}
