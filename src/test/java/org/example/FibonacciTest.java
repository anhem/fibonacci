package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private static final int SIZE = 100;

    @Test
    public void fibonacciImplementationsReturnsTheSameValues() {
        assertEquals(new ForFibonacci().getFibonacci(SIZE), new RecursiveFibonacci().getFibonacci(SIZE));
        assertEquals(new ForFibonacci().getFibonacci(SIZE), new StreamFibonacci().getFibonacci(SIZE));
    }

}