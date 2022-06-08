package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForFibonacciTest extends SystemOverride {

    private final ForFibonacci forFibonacci = new ForFibonacci();

    @Test
    public void printFibonacci() {
        forFibonacci.printFibonacci(10);
        assertEquals("0 1 1 2 3 5 8 13 21 34 \n", outStream.toString());
    }

    @Test
    public void getFibonacci() {
        List<BigInteger> fibonacci = forFibonacci.getFibonacci(10);

        assertEquals(10, fibonacci.size());
        assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]", fibonacci.toString());
    }

}