package com.angus.codewars;

public class PlayPass {
    public static String playPass(String s, int n) {
        char[] strToChars = s.toCharArray();

        for (int i = 0; i < strToChars.length; i++) {
            if (Character.isAlphabetic(strToChars[i])) {
                char toBeReplaced = Character.toLowerCase(strToChars[i]);
                toBeReplaced = (char) (((toBeReplaced - 'a' + n) % 26) + 'a');
                if (i % 2 == 0) {
                    toBeReplaced = Character.toUpperCase(toBeReplaced);
                } else {
                    toBeReplaced = Character.toLowerCase(toBeReplaced);
                }
                strToChars[i] = toBeReplaced;
            } else if (Character.isDigit(strToChars[i])) {
                strToChars[i] = (char) ('9' - Character.getNumericValue(strToChars[i]));
            }
        }

        return new StringBuilder(new String(strToChars)).reverse().toString();
    }
}
