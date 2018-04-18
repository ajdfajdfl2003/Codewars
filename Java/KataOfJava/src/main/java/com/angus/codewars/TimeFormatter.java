package com.angus.codewars;

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

        StringBuilder result = new StringBuilder();

        if (days > 0) {
            result.append(buildUnitOfTimes(0, days, "day", ""));
        }

        if (hours > 0) {
            result.append(buildUnitOfTimes(0, hours, "hour", ""));
        }

        if (minutes > 0) {
            result.append(buildUnitOfTimes(hours, minutes, "minute", ", "));
        }

        if (seconds > 0) {
            result.append(buildUnitOfTimes(minutes, seconds, "second", " and "));
        }

        return result.toString();

    }

    private static String buildUnitOfTimes(int largerUnitTime, int currentUnitTime, String unit, String separateBy) {
        String space = " ";
        return (largerUnitTime > 0 ? separateBy : "") +
                currentUnitTime + space + (currentUnitTime > 1 ? unit.concat("s") : unit);
    }
}
