package com.angus.codewars;

import java.util.HashMap;

public class EncodeResistorColors {
    public static String encodeResistorColors(String ohmsString) {
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
        String[] splitOhmsStr = ohmsString.split(" ");
        String result = "";
        for (String band : splitOhmsStr[0].split("")) {
            result += resistorColor.get(band) + " ";
        }
        return result + "black gold";
    }
}
