package com.angus.codewars;

import java.util.Arrays;

public class NextBigger {
    public static long nextBiggerNumber(long n) {
        String[] splitOfDigits = String.valueOf(n).split("");

        boolean flag = false;
        int index = 0;
        for (int i = 0; i < splitOfDigits.length - 1; i++) {
            if (getLong(splitOfDigits[i]) < getLong(splitOfDigits[i + 1])) {
                flag = true;
                index = i;
            }
        }

        if (!flag) return -1;

        for (int i = index + 1; i < splitOfDigits.length; i++) {
            if (getLong(splitOfDigits[i]) > getLong(splitOfDigits[index])) {
                String tmp = splitOfDigits[i];
                splitOfDigits[i] = splitOfDigits[index];
                splitOfDigits[index] = tmp;
                break;
            }
        }

        String[] partialResult = Arrays.stream(convertToString(splitOfDigits)
                .substring(index + 1, splitOfDigits.length)
                .split("")).sorted().toArray(String[]::new);
        String result = convertToString(splitOfDigits).substring(0, index + 1)
                + convertToString(partialResult);

        return getLong(result);
    }

    private static String convertToString(String[] splitOfDigits) {
        return String.join("", splitOfDigits);
    }

    private static long getLong(String digit) {
        return Long.parseLong(digit);
    }
}
