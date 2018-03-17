package com.angus.codewars;

public class Kata {
    public static int findShort(String s) {
        String[] splitWord = s.split(" ");

        int shortest = 0;
        for (String word : splitWord) {
            if (shortest == 0) {
                shortest = word.length();
            } else {
                shortest = Math.min(shortest, word.length());
            }
        }

        return shortest;
    }
}
