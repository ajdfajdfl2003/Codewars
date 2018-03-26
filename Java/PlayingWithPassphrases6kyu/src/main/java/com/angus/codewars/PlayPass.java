package com.angus.codewars;

public class PlayPass {
    public static String playPass(String s, int n) {
        char[] strToChars = s.toCharArray();

        for (int i = 0; i < strToChars.length; i++) {
            if (Character.isAlphabetic(strToChars[i])) {
                strToChars[i] += 1;
                if (i % 2 == 0) {
                    strToChars[i] = Character.toUpperCase(strToChars[i]);
                } else {
                    strToChars[i] = Character.toLowerCase(strToChars[i]);
                }
            }
        }
        StringBuilder result = new StringBuilder(new String(strToChars)).reverse();

        return result.toString();
    }
}
