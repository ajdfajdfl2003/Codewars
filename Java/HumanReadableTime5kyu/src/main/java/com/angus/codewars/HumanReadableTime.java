package com.angus.codewars;

public class HumanReadableTime {
    private static String formatStr = "%02d";

    public static String makeReadable(int seconds) {
        int hour = 0;
        int minute = seconds / 59;
        int second = (seconds - minute) % 59;
        return String.format(formatStr, hour) + ":" + String.format(formatStr, minute) + ":" + String.format(formatStr, second);
    }
}
