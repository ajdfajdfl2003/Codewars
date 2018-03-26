package com.angus.codewars;

public class PlayPass {
    public static String playPass(String s, int n) {
        char[] strToChars = s.toCharArray();

        for (int i = 0; i < strToChars.length; i++) {
            System.out.print(strToChars[i]);
            if (Character.isAlphabetic(strToChars[i])) {
                strToChars[i] = Character.toLowerCase(strToChars[i]);
                strToChars[i] = (char) (((strToChars[i] - 'a' + n) % 26) + 'a');
                System.out.print(strToChars[i]);
                if (i % 2 == 0) {
                    strToChars[i] = Character.toUpperCase(strToChars[i]);
                } else {
                    strToChars[i] = Character.toLowerCase(strToChars[i]);
                }
            } else if (Character.isDigit(strToChars[i])) {
                strToChars[i] = (char) ('9' - Character.getNumericValue(strToChars[i]));
            }
            System.out.println();
        }
        StringBuilder result = new StringBuilder(new String(strToChars)).reverse();

        return result.toString();
    }
}
