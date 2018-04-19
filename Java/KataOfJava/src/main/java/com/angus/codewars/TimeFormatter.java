package com.angus.codewars;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }

        int transToYears = seconds / 31536000;
        int transToDays = (seconds - transToYears * 31536000) / 86400;
        int transToHours = (seconds - transToYears * 31536000 - transToDays * 86400) / 3600;
        int transToMinutes = (seconds - transToYears * 31536000 - transToDays * 86400 - transToHours * 3600) / 60;
        int transToSeconds = seconds - transToYears * 31536000 - transToDays * 86400 - transToHours * 3600 - transToMinutes * 60;

        return buildDurationFormat(transToYears, transToDays, transToHours, transToMinutes, transToSeconds);
    }

    private static String buildDurationFormat(int years, int days, int hours, int minutes, int seconds) {
        List<String> result = new ArrayList<>();

        if (years > 0) {
            result.add(buildUnitOfTimes(years, "year"));
        }

        if (days > 0) {
            result.add(buildUnitOfTimes(days, "day"));
        }

        if (hours > 0) {
            result.add(buildUnitOfTimes(hours, "hour"));
        }

        if (minutes > 0) {
            result.add(buildUnitOfTimes(minutes, "minute"));
        }

        if (seconds > 0) {
            result.add(buildUnitOfTimes(seconds, "second"));
        }

        return appendSeparated(result);
    }

    private static String appendSeparated(List<String> formatDuration) {
        StringBuilder result = new StringBuilder();

        int sizeOfDuration = formatDuration.size();
        for (int i = 0; i < sizeOfDuration; i++) {

            result.append(formatDuration.get(i));

            if (sizeOfDuration - i > 2) {
                result.append(", ");

            } else if (sizeOfDuration - i == 2) {
                result.append(" and ");

            }
        }

        return result.toString();
    }

    private static String buildUnitOfTimes(int currentUnitTime, String unit) {
        String space = " ";

        return currentUnitTime + space + (currentUnitTime > 1 ? unit.concat("s") : unit);
    }
}
