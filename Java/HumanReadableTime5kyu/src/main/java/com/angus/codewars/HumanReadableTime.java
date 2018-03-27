package com.angus.codewars;

public class HumanReadableTime {
    private static String formatStr = "%02d";

    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        int minute = (seconds - (hour * 3600)) / 60;
        int second = seconds % 60;
        return String.format(formatStr, hour) + ":" + String.format(formatStr, minute) + ":" + String.format(formatStr, second);
    }
}
