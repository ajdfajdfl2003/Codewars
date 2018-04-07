package com.angus.codewars;

public class NextBigger {
    public static long nextBiggerNumber(long n) {
        String[] splitOfDigits = String.valueOf(n).split("");

        boolean flag = false;
        int index = 0;
        for (int i = 0; i < splitOfDigits.length - 1; i++) {
            if (getLong(splitOfDigits[i]) < getLong(splitOfDigits[i + 1])) {
                flag = true;
                index = i + 1;
            }
        }

        if (!flag) return -1;

        for (int i = index; i >= 0; i--) {
            if (getLong(splitOfDigits[index]) > getLong(splitOfDigits[i])) {
                String tmp = splitOfDigits[i];
                splitOfDigits[i] = splitOfDigits[index];
                splitOfDigits[index] = tmp;
                break;
            }
        }

        return getLong(String.join("", splitOfDigits));
    }

    private static long getLong(String digit) {
        return Long.parseLong(digit);
    }
}
