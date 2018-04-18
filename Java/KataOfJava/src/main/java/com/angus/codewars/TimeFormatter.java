package com.angus.codewars;

public class TimeFormatter {
    public static String formatDuration(int seconds) {

        int transToMinutes = seconds / 60;
        int transToSeconds = seconds - transToMinutes * 60;

        return buildDurationFormat(transToMinutes, transToSeconds);

    }

    private static String buildDurationFormat(int transToMinutes, int transToSeconds) {

        StringBuilder result = new StringBuilder();

        if (transToMinutes != 0) {
            String formatMinutes = buildUnitOfTimes(0, transToMinutes, "minute");
            result.append(formatMinutes);
        }

        if (transToSeconds != 0) {
            String formatSeconds = buildUnitOfTimes(transToMinutes, transToSeconds, "second");
            result.append(formatSeconds);
        }

        return result.toString();

    }

    private static String buildUnitOfTimes(int largerUnitTime, int currentUnitTime, String unit) {
        return (largerUnitTime > 0 ? " and " : "") +
                currentUnitTime + " " + (currentUnitTime > 1 ? unit.concat("s") : unit);
    }
}
