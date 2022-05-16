package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFibonacci implements Fibonacci {

    @Override
    public void printFibonacci(int size) {
        toFibonacciStream(size)
                .forEach(i -> System.out.printf("%d ", i));
        System.out.println();
    }

    @Override
    public List<Integer> getFibonacci(int size) {
        return toFibonacciStream(size)
                .collect(Collectors.toList());
    }

    private Stream<Integer> toFibonacciStream(int size) {
        return Stream.iterate(new Integer[]{0, 1}, arr -> new Integer[]{arr[1], arr[0] + arr[1]})
                .map(arr -> arr[0])
                .limit(size);
    }
}
