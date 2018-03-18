package com.angus;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class Kata {
    public static Kata newInstance() {
        return new Kata();
    }

    public int[] sortArray(int[] array) {
        PrimitiveIterator.OfInt sortedOdd = IntStream.of(array).filter(e -> e % 2 == 1).sorted().iterator();

        return IntStream.of(array)
                .map(e -> e % 2 == 0 ? e : sortedOdd.nextInt())
                .toArray();
    }
}
