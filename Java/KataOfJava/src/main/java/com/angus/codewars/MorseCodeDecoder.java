package com.angus.codewars;

import java.util.HashMap;
import java.util.Map;

/*
 題目：https://www.codewars.com/kata/decode-the-morse-code/
 */
public class MorseCodeDecoder {
    private static Map<String, String> decodeMap = new HashMap<>();

    static {
        decodeMap.put(".-", "A");
        decodeMap.put("-...", "B");
        decodeMap.put("-.-.", "C");
        decodeMap.put("-..", "D");
        decodeMap.put(".", "E");
        decodeMap.put("..-.", "F");
        decodeMap.put("--.", "G");
        decodeMap.put("....", "H");
        decodeMap.put("..", "I");
        decodeMap.put(".---", "J");
        decodeMap.put("-.-", "K");
        decodeMap.put(".-..", "L");
        decodeMap.put("--", "M");
        decodeMap.put("-.", "N");
        decodeMap.put("---", "O");
        decodeMap.put(".--.", "P");
        decodeMap.put("--.-", "Q");
        decodeMap.put(".-.", "R");
        decodeMap.put("...", "S");
        decodeMap.put("-", "T");
        decodeMap.put("..-", "U");
        decodeMap.put("...-", "V");
        decodeMap.put(".--", "W");
        decodeMap.put("-..-", "X");
        decodeMap.put("-.--", "Y");
        decodeMap.put("--..", "Z");
        decodeMap.put(".----", "1");
        decodeMap.put("..---", "2");
        decodeMap.put("...--", "3");
        decodeMap.put("....-", "4");
        decodeMap.put(".....", "5");
        decodeMap.put("-....", "6");
        decodeMap.put("--...", "7");
        decodeMap.put("---..", "8");
        decodeMap.put("----.", "9");
        decodeMap.put("-----", "0");

    }

    public static String decode(String morseCode) {
        System.out.println(morseCode);
        String[] splitOfWords = morseCode.split("   ");

        StringBuilder result = new StringBuilder();
        for (String word : splitOfWords) {
            String[] splitOfCharacters = word.split(" ");
            for (String character : splitOfCharacters) {
                String decode = decodeMap.get(character);
                if (decode != null) {
                    result.append(decode);
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
