package com.angus.codewars;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 題目：https://www.codewars.com/kata/validate-credit-card-number/
 */
public class CreditcardValidation {
    public static boolean validate(String n) {
        // 用 stream 把每個 String 轉換成 Integer
        // 然後存成 int array
        int[] checkValid = Stream.of(n.split("")).mapToInt(Integer::parseInt).toArray();

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
