package com.angus.codewars;

import java.util.Arrays;
import java.util.Comparator;

/*
 題目：https://www.codewars.com/kata/next-smaller-number-with-the-same-digits/
 參考：https://github.com/Vorgue/Next-smaller-number-with-the-same-digits
 */
public class NextSmaller {
    public static long nextSmaller(long n) {
        String[] splitDigits = Long.toString(n).split("");
        int index = 0;
        boolean flag = false;

        /* Find the last one is greater than next one */
        for (int i = 0; i < splitDigits.length - 1; i++) {
            if (getLong(splitDigits[i]) > getLong(splitDigits[i + 1])) {
                index = i;
                flag = true;
            }
        }

        /* cannot find any element is greater than next one */
        if (!flag) return -1;

        /*
            Find the first element less than element[index]
            than swap it and break out
        */
        for (int i = splitDigits.length - 1; i > 0; i--) {
            if (getLong(splitDigits[i]) < getLong(splitDigits[index])) {
                swapDigit(splitDigits, index, i);
                break;
            }
        }

        /* Cannot lead with zero */
        if (splitDigits[0].equals("0")) {
            return -1;
        }

        String allDigits = convertToString(splitDigits);

        /* Sort as descending from element[index+1] */
        String partialResult = convertToString(Arrays.stream(allDigits.substring(index + 1).split("")).
                sorted(Comparator.reverseOrder()).toArray(String[]::new));

        return getLong(allDigits.substring(0, index + 1).concat(partialResult));
    }

    private static String convertToString(String[] splitDigits) {
        return String.join("", splitDigits);
    }

    private static void swapDigit(String[] splitDigits, int index, int i) {
        String tmp;
        tmp = splitDigits[i];
        splitDigits[i] = splitDigits[index];
        splitDigits[index] = tmp;
    }

    private static long getLong(String digit) {
        return Long.parseLong(digit);
    }
}
