package org.example;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class StreamFibonacci implements Fibonacci {

    @Override
    public void printFibonacci(int size) {
        toFibonacciStream(size)
                .forEach(i -> System.out.printf("%d ", i));
        System.out.println();
    }

    @Override
    public List<BigInteger> getFibonacci(int size) {
        return toFibonacciStream(size)
                .collect(Collectors.toList());
    }

    private Stream<BigInteger> toFibonacciStream(int size) {
        return Stream.iterate(new BigInteger[]{ZERO, ONE}, arr -> new BigInteger[]{arr[1], arr[0].add(arr[1])})
                .map(arr -> arr[0])
                .limit(size);
    }
}
