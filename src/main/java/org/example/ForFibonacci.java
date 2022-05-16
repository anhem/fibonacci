package org.example;

import java.util.ArrayList;
import java.util.List;

public class ForFibonacci implements Fibonacci {

    @Override
    public void printFibonacci(int size) {
        for (Integer integer : getFibonacci(10)) {
            System.out.printf("%d ", integer);
        }
        System.out.println();
    }

    @Override
    public List<Integer> getFibonacci(int size) {
        int first = 0;
        int second = 1;
        int next;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(first);
            next = first + second;
            first = second;
            second = next;
        }
        return result;
    }
}
