package com.angus.codewars;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

/*
 題目：https://www.codewars.com/kata/convert-string-to-camel-case
 */
public class ConvertStringToCamelCase {

    public static String toCamelCase(String s) {
        String[] afterReplacement = s.split("_");
        return afterReplacement[0] + Arrays.stream(afterReplacement).skip(1)
                .map(str -> str.substring(0, 1).toUpperCase().concat(str.substring(1, str.length())))
                .collect(joining(""));
    }
}
