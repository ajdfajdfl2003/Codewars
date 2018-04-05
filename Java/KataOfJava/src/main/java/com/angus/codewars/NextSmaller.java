package com.angus.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.LongStream;

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

        String firstDigit = allDigits.substring(0, 1);
        /* Sorted without first digit */
        List<String> sortedPartialDigits = Arrays.stream(allDigits.substring(1, allDigits.length())
                .split("")).sorted().collect(toList());
        sortedPartialDigits.add(0, firstDigit);

        if (compareWithOrigin(n, Long.parseLong(String.join("", sortedPartialDigits)))) {
            return Long.parseLong(String.join("", sortedPartialDigits));
        }

        /* Find most closet and smaller than first digit */
        List<Long> closetDigit = LongStream.range(0, Long.parseLong(firstDigit))
                .filter(digit -> sortedPartialDigits.contains(String.valueOf(digit)))
                .boxed().sorted(Comparator.reverseOrder()).collect(toList());
        swapDigit(sortedPartialDigits, firstDigit, closetDigit.get(0));
        List<String> result = sortedPartialDigits.subList(1, sortedPartialDigits.size())
                .stream().sorted(Comparator.reverseOrder()).collect(toList());
        result.add(0, sortedPartialDigits.get(0));

        if (compareWithOrigin(n, Long.parseLong(String.join("", result)))) {
            if (!result.get(0).equals("0")) {
                return Long.parseLong(String.join("", result));
            }
        }

        return -1;
    }

    private static void swapDigit(List<String> sortedPartialDigits, String element, Long closetDigit) {
        int elementIndex = sortedPartialDigits.indexOf(element);
        int closetDigitIndex = sortedPartialDigits.indexOf(String.valueOf(closetDigit));
        sortedPartialDigits.set(elementIndex, String.valueOf(closetDigit));
        sortedPartialDigits.set(closetDigitIndex, element);
    }

    private static boolean compareWithOrigin(long n, long comparison) {
        return comparison < n;
    }
}
