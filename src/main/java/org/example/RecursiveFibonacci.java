package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class RecursiveFibonacci implements Fibonacci {
    @Override
    public void printFibonacci(int size) {
        String fibonacci = getFibonacci(size).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(fibonacci);
    }

    @Override
    public List<BigInteger> getFibonacci(int size) {
        return getFibonacciList(new ArrayList<>(List.of(ZERO, ONE)), size);
    }

    private List<BigInteger> getFibonacciList(List<BigInteger> result, int size) {
        int currentSize = result.size();
        if (currentSize == size) {
            return result;
        }
        result.add(result.get(currentSize - 2).add(result.get(currentSize - 1)));
        return getFibonacciList(result, size);
    }
}

