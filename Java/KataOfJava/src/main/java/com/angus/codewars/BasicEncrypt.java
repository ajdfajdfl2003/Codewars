package com.angus.codewars;

public class BasicEncrypt {
    public String encrypt(String text, int rule) {
        if (text.isEmpty()) {
            return "";
        }

        char[] strToChars = text.toCharArray();
        for (int i = 0; i < strToChars.length; i++) {
            strToChars[i] = (char) ((strToChars[i] + rule) % 256);
        }

        return new String(strToChars);
    }
}