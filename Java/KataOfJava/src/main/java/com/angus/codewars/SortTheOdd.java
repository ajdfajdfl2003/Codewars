package com.angus.codewars;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

/*
 題目：https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
 */
public class SortTheOdd {
    public static SortTheOdd newInstance() {
        return new SortTheOdd();
    }

    public int[] sortArray(int[] array) {
        // 把所有 int array 內的 奇數 做 遞增排序
        PrimitiveIterator.OfInt sortedOdd = IntStream.of(array).filter(e -> e % 2 == 1).sorted().iterator();

        return IntStream.of(array)
                .map(e -> e % 2 == 0 ? e : sortedOdd.nextInt())
                .toArray();
    }
}
