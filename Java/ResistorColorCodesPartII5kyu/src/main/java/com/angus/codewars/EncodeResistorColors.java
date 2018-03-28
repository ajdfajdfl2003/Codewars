package com.angus.codewars;

import java.util.HashMap;

public class EncodeResistorColors {
    public static String encodeResistorColors(String ohmsString) {
        String[] splitOhmsStr = ohmsString.split(" ");
        String ohmsValue = splitOhmsStr[0];

        ohmsValue = calculateOhms(ohmsValue);

        String result = "";
        String[] bands = ohmsValue.split("");
        for (int i = 0; i < 2; i++) {
            result += getResistorColor().get(bands[i]) + " ";
        }

        int multiplier = ohmsValue.length() - 2;
        return result + getResistorColor().get(String.valueOf(multiplier)) + " gold";
    }

    private static String calculateOhms(String ohmsValue) {
        if (ohmsValue.contains("k")) {
            ohmsValue = String.valueOf((int) (Double.parseDouble(ohmsValue.substring(0, ohmsValue.indexOf("k"))) * 1000));
        } else if (ohmsValue.contains("M")) {
            ohmsValue = String.valueOf((int) (Double.parseDouble(ohmsValue.substring(0, ohmsValue.indexOf("M"))) * 1000000));
        }
        return ohmsValue;
    }

    private static HashMap<String, String> getResistorColor() {
        HashMap<String, String> resistorColor = new HashMap<String, String>();
        resistorColor.put("0", "black");
        resistorColor.put("1", "brown");
        resistorColor.put("2", "red");
        resistorColor.put("3", "orange");
        resistorColor.put("4", "yellow");
        resistorColor.put("5", "green");
        resistorColor.put("6", "blue");
        resistorColor.put("7", "violet");
        resistorColor.put("8", "gray");
        resistorColor.put("9", "white");
        return resistorColor;
    }
}
