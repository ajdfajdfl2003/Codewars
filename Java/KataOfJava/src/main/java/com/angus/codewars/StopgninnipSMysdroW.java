package com.angus.codewars;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

/*
 題目：https://www.codewars.com/kata/5264d2b162488dc400000001
 */
public class StopgninnipSMysdroW {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() >= 5 ? new StringBuilder(s).reverse().toString() : s)
                .collect(joining(" "));
    }
}
