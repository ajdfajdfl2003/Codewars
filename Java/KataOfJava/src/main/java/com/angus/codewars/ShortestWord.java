package com.angus.codewars;

import java.util.stream.Stream;

public class ShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
