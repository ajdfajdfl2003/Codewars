package com.angus.codewars;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        return java.util.stream.IntStream.range(0, data.length)
                .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
                .toArray();
    }
}
