package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveFibonacciTest extends SystemOverride {

    private final RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();

    @Test
    public void printFibonacci() {
        recursiveFibonacci.printFibonacci(10);
        assertEquals("0 1 1 2 3 5 8 13 21 34\n", outStream.toString());
    }

    @Test
    public void getFibonacci() {
        List<BigInteger> fibonacci = recursiveFibonacci.getFibonacci(10);

        assertEquals(10, fibonacci.size());
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]", fibonacci.toString());
    }

}