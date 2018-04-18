package com.angus.codewars;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        int transToMinutes = seconds / 60;
        int transToSeconds = seconds - transToMinutes * 60;

        String formatMinutes = transToMinutes + (transToMinutes > 1 ? " minutes" : " minute");
        String formatSeconds = transToSeconds + (transToSeconds > 1 ? " seconds" : " second");

        StringBuilder result = new StringBuilder();
        if (transToMinutes != 0) {
            result.append(formatMinutes + " and ");
        }
        if (transToSeconds != 0) {
            result.append(formatSeconds);
        }

        return result.toString();
    }
}
