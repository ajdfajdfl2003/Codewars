package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/next-smaller-number-with-the-same-digits/
 */
public class NextSmaller {
    public static long nextSmaller(long n) {
        String[] allDigits = Long.toString(n).split("");

        for (int i = allDigits.length - 1; i > 0; i--) {
            String tmp;
            if (Long.parseLong(allDigits[i]) < Long.parseLong(allDigits[i - 1])) {
                tmp = allDigits[i];
                allDigits[i] = allDigits[i - 1];
                allDigits[i - 1] = tmp;
            }
        }

        return Long.parseLong(String.join("", allDigits));
    }
}
