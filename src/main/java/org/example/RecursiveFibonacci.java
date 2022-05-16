package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecursiveFibonacci implements Fibonacci {
    @Override
    public void printFibonacci(int size) {
        String fibonacci = getFibonacci(size).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(fibonacci);
    }

    @Override
    public List<Integer> getFibonacci(int size) {
        return getFibonacciList(new ArrayList<>(List.of(0, 1)), size);
    }

    private List<Integer> getFibonacciList(List<Integer> result, int size) {
        int currentSize = result.size();
        if (currentSize == size) {
            return result;
        }
        result.add(result.get(currentSize - 2) + result.get(currentSize - 1));
        return getFibonacciList(result, size);
    }
}

