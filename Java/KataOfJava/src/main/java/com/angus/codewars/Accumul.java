package com.angus.codewars;

public class Accumul {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitOfStr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            result.append(splitOfStr[i].toUpperCase());
            result.append(new String(new char[i]).replace("\0",
                    splitOfStr[i].toLowerCase()));
            if (i < s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }
}
