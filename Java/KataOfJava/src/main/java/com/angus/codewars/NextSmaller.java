package com.angus.codewars;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/*
 題目：https://www.codewars.com/kata/next-smaller-number-with-the-same-digits/
 */
public class NextSmaller {
    public static long nextSmaller(long n) {
        String allDigits = Long.toString(n);

        /* Only two digit, just change it */
        if (allDigits.length() == 2) {
            String exchanged = allDigits.substring(1, 2) + allDigits.substring(0, 1);
            if (compareWithOrigin(n, Long.parseLong(exchanged))) {
                return Long.parseLong(exchanged);
            }
        }

        /* Sorted without first digit */
        List<String> sortedPartialDigits = Arrays.stream(allDigits.substring(1, allDigits.length())
                .split("")).sorted().collect(toList());
        sortedPartialDigits.add(0, allDigits.substring(0, 1));

        if (compareWithOrigin(n, Long.parseLong(String.join("", sortedPartialDigits)))) {
            return Long.parseLong(String.join("", sortedPartialDigits));
        }

        return Long.parseLong(String.join("", sortedPartialDigits));
    }

    private static boolean compareWithOrigin(long n, long comparison) {
        return comparison < n;
    }
}
