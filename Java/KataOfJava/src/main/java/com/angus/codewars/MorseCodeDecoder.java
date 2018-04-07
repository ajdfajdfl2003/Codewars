package com.angus.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 題目：https://www.codewars.com/kata/decode-the-morse-code/
 Wiki: https://en.wikipedia.org/wiki/Morse_code
 題目有說：他已經有定義好表了，我們可以不用去見那張表格...，題目真的要看清楚...
 */
public class MorseCodeDecoder {
    private static Map<String, String> MorseCode = new HashMap<>();

    static {
        MorseCode.put("-.-.--", "!");
        MorseCode.put(".-.-.-", ".");
        MorseCode.put("...---...", "SOS");
        MorseCode.put(".-", "A");
        MorseCode.put("-...", "B");
        MorseCode.put("-.-.", "C");
        MorseCode.put("-..", "D");
        MorseCode.put(".", "E");
        MorseCode.put("..-.", "F");
        MorseCode.put("--.", "G");
        MorseCode.put("....", "H");
        MorseCode.put("..", "I");
        MorseCode.put(".---", "J");
        MorseCode.put("-.-", "K");
        MorseCode.put(".-..", "L");
        MorseCode.put("--", "M");
        MorseCode.put("-.", "N");
        MorseCode.put("---", "O");
        MorseCode.put(".--.", "P");
        MorseCode.put("--.-", "Q");
        MorseCode.put(".-.", "R");
        MorseCode.put("...", "S");
        MorseCode.put("-", "T");
        MorseCode.put("..-", "U");
        MorseCode.put("...-", "V");
        MorseCode.put(".--", "W");
        MorseCode.put("-..-", "X");
        MorseCode.put("-.--", "Y");
        MorseCode.put("--..", "Z");
        MorseCode.put(".----", "1");
        MorseCode.put("..---", "2");
        MorseCode.put("...--", "3");
        MorseCode.put("....-", "4");
        MorseCode.put(".....", "5");
        MorseCode.put("-....", "6");
        MorseCode.put("--...", "7");
        MorseCode.put("---..", "8");
        MorseCode.put("----.", "9");
        MorseCode.put("-----", "0");

    }

    public static String decode(String morseCode) {
        String[] splitOfWords = morseCode.trim().split("   ");

        /*
          Use stream, map each word then pass word to decodeWord method,
          than join each word with space
         */
        String result = Arrays.stream(splitOfWords)
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));

        return result;
    }

    private static String decodeWord(String word) {
        /* split each character with space, than map to MorseCode and join together */
        return Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining());
    }
}
