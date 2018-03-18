package com.angus;

import java.util.Arrays;

public class Kata {
    public static Kata newInstance() {
        return new Kata();
    }

    public int[] sortArray(int[] array) {
        int[] sortedOdd = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().toArray();
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = sortedOdd[flag];
                flag++;
            }
        }
        return array;
    }
}
