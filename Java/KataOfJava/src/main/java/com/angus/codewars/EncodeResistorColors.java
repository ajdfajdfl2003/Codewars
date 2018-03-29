package com.angus.codewars;

public class EncodeResistorColors {
    private static String[] CODES = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};

    public static String encodeResistorColors(String ohmsString) {
        String splitOhmsStr = ohmsString.split(" ")[0];
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
