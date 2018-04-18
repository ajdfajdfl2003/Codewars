package com.angus.codewars;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

/*
 題目：https://www.codewars.com/kata/convert-string-to-camel-case
 */
public class ConvertStringToCamelCase {

    public static String toCamelCase(String s) {
        return Arrays.stream(s.split("_"))
                .map(str -> str.substring(0, 1).toUpperCase().concat(str.substring(1, str.length())))
                .collect(joining(""));
    }
}
