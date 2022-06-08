package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class ForFibonacci implements Fibonacci {

    @Override
    public void printFibonacci(int size) {
        for (BigInteger bigInteger : getFibonacci(size)) {
            System.out.printf("%d ", bigInteger);
        }
        System.out.println();
    }

    @Override
    public List<BigInteger> getFibonacci(int size) {
        BigInteger first = ZERO;
        BigInteger second = ONE;
        BigInteger next;
        List<BigInteger> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(first);
            next = first.add(second);
            first = second;
            second = next;
        }
        return result;
    }
}
