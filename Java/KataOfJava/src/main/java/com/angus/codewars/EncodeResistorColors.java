package com.angus.codewars;

/*
 題目：https://www.codewars.com/kata/5855777bb45c01bada0002ac
 */
public class EncodeResistorColors {
    private static String[] CODES = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};

    public static String encodeResistorColors(String ohmsString) {
        // 只取 ohms 前面的數字
        String splitOhmsStr = ohmsString.split(" ")[0];

        // 先把後面有不是數字的取代掉
        // 然後去乘上 相對應的數字，
        // k -> 1000, M -> 1000000
        String ohmsValue = "" + (int) (Double.parseDouble(splitOhmsStr.replaceAll("[^\\.0-9]", "")) * calcFactor(splitOhmsStr));

        String result = "";
        String[] bands = ohmsValue.split("");
        for (int i = 0; i < 2; i++) {
            result += CODES[Integer.parseInt(bands[i])] + " ";
        }

        int multiplier = ohmsValue.length() - 2;
        return result + CODES[multiplier] + " gold";
    }

    private static int calcFactor(String ohmsValue) {
        return ohmsValue.contains("k") ? 1000 : ohmsValue.contains("M") ? 1000000 : 1;
    }
}
