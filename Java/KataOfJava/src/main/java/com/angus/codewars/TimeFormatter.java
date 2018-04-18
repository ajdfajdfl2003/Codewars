package com.angus.codewars;

public class TimeFormatter {
    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        int transToHours = seconds / 3600;
        int transToMinutes = (seconds - transToHours * 3600) / 60;
        int transToSeconds = seconds - transToHours * 3600 - transToMinutes * 60;

        return buildDurationFormat(transToHours, transToMinutes, transToSeconds);

    }

    private static String buildDurationFormat(int hours, int minutes, int seconds) {

        StringBuilder result = new StringBuilder();

        if (hours > 0) {
            String formatMinutes = buildUnitOfTimes(0, hours, "hour", "");
            result.append(formatMinutes);
        }

        if (minutes > 0) {
            String formatMinutes = buildUnitOfTimes(hours, minutes, "minute", ", ");
            result.append(formatMinutes);
        }

        if (seconds > 0) {
            String formatSeconds = buildUnitOfTimes(minutes, seconds, "second", " and ");
            result.append(formatSeconds);
        }

        return result.toString();

    }

    private static String buildUnitOfTimes(int largerUnitTime, int currentUnitTime, String unit, String separateBy) {
        String space = " ";
        return (largerUnitTime > 0 ? separateBy : "") +
                currentUnitTime + space + (currentUnitTime > 1 ? unit.concat("s") : unit);
    }
}
