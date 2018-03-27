package com.angus.codewars;

public class HumanReadableTime {
    private static String formatStr = "%02d";

    public static String makeReadable(int seconds) {
        int hour = 0;
        int minute = 0;
        int second = 0;
        return String.format(formatStr, hour) + ":" + String.format(formatStr, minute) + ":" + String.format(formatStr, second);
    }
}
