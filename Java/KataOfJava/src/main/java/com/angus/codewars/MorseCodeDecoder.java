package com.angus.codewars;

import java.util.HashMap;
import java.util.Map;

/*
 題目：https://www.codewars.com/kata/decode-the-morse-code/
 */
public class MorseCodeDecoder {
    private static Map<String, String> decode = new HashMap<>();

    static {
        decode.put("....", "H");
        decode.put(".", "E");
        decode.put("-.--", "Y");
        decode.put(".---", "J");
        decode.put("..-", "U");
        decode.put("-..", "D");
    }

    public static String decode(String morseCode) {
        String[] splitOfWords = morseCode.split("   ");

        StringBuilder result = new StringBuilder();
        for (String word : splitOfWords) {
            String[] splitOfCharacter = word.split(" ");
            for (String character : splitOfCharacter) {
                result.append(decode.get(character));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
