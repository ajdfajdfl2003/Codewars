package com.angus.codewars;
/*
 題目：https://www.codewars.com/kata/basic-encryption
 */
public class BasicEncrypt {
    public String encrypt(String text, int rule) {
        if (text.isEmpty()) {
            return "";
        }

        char[] strToChars = text.toCharArray();
        for (int i = 0; i < strToChars.length; i++) {
            /*
             題目要求有 256 個字元可以使用，shift 後跟 256 做 mod
             */
            strToChars[i] = (char) ((strToChars[i] + rule) % 256);
        }

        return new String(strToChars);
    }
}
