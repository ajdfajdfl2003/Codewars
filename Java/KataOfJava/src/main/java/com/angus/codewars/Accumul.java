package com.angus.codewars;

public class Accumul {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        String[] splitOfStr = s.split("");
        for (int i = 0; i < s.length(); i++) {
            result.append(splitOfStr[i].toUpperCase());
            result.append(getRepeatString(splitOfStr[i], i));
            if (i < s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    private static String getRepeatString(String waitToRepeat, int repeatTimes) {
        return new String(new char[repeatTimes])
                .replace("\0", waitToRepeat.toLowerCase());
    }
}
