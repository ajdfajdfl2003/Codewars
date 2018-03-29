package com.angus.codewars;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class SortTheOdd {
    public static SortTheOdd newInstance() {
        return new SortTheOdd();
    }

    public int[] sortArray(int[] array) {
        PrimitiveIterator.OfInt sortedOdd = IntStream.of(array).filter(e -> e % 2 == 1).sorted().iterator();

        return IntStream.of(array)
                .map(e -> e % 2 == 0 ? e : sortedOdd.nextInt())
                .toArray();
    }
}
