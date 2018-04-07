package com.angus.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 題目：https://www.codewars.com/kata/decode-the-morse-code/
 */
public class MorseCodeDecoder {
    private static Map<String, String> decode = new HashMap<>();

    static {
        decode.put(".-", "A");
        decode.put("-...", "B");
        decode.put("-.-.", "C");
        decode.put("-..", "D");
        decode.put(".", "E");
        decode.put("..-.", "F");
        decode.put("--.", "G");
        decode.put("....", "H");
        decode.put("..", "I");
        decode.put(".---", "J");
        decode.put("-.-", "K");
        decode.put(".-..", "L");
        decode.put("--", "M");
        decode.put("-.", "N");
        decode.put("---", "O");
        decode.put(".--.", "P");
        decode.put("--.-", "Q");
        decode.put(".-.", "R");
        decode.put("...", "S");
        decode.put("-", "T");
        decode.put("..-", "U");
        decode.put("...-", "V");
        decode.put(".--", "W");
        decode.put("-..-", "X");
        decode.put("-.--", "Y");
        decode.put("--..", "Z");

    }

    public static String decode(String morseCode) {
        String[] splitOfWords = morseCode.split("   ");

        StringBuilder result = new StringBuilder();
        for (String word : splitOfWords) {
            Arrays.stream(word.split(" "))
                    .forEach(character -> result.append(decode.get(character)));
            result.append(" ");
        }
        return result.toString().trim();
    }
}
