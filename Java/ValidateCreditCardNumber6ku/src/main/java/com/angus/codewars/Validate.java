package com.angus.codewars;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Validate {
    public static boolean validate(String n) {
        int[] checkValid = Stream.of(n.split("")).mapToInt(v -> Integer.parseInt(v)).toArray();
        int needToCheked = checkValid.length % 2;
        for (int i = 0; i < checkValid.length; i++) {
            if (i % 2 == needToCheked) {
                int replacement = checkValid[i] * 2;
                replacement = replacement > 9 ? replacement - 9 : replacement;
                checkValid[i] = replacement;
            }
        }
        return IntStream.of(checkValid).sum() % 10 == 0;
    }
}
