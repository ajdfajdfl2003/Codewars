package com.angus.codewars;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        int transToDays = seconds / 86400;
        int transToHours = (seconds - transToDays * 86400) / 3600;
        int transToMinutes = (seconds - transToDays * 86400 - transToHours * 3600) / 60;
        int transToSeconds = seconds - transToDays * 86400 - transToHours * 3600 - transToMinutes * 60;

        return buildDurationFormat(transToDays, transToHours, transToMinutes, transToSeconds);

    }

    private static String buildDurationFormat(int days, int hours, int minutes, int seconds) {

        List<String> result = new ArrayList<>();

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

        if (formatDuration.size() == 1) {
            return formatDuration.get(0);

        } else if (formatDuration.size() == 2) {
            return formatDuration.get(0) + " and " + formatDuration.get(1);

        }

        return formatDuration.get(0) + ", " + formatDuration.get(1) + " and " + formatDuration.get(2);

    }

    private static String buildUnitOfTimes(int currentUnitTime, String unit) {

        String space = " ";

        return currentUnitTime + space + (currentUnitTime > 1 ? unit.concat("s") : unit);

    }
}
